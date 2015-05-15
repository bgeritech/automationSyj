package com.modules;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Basic {
	protected final WebDriver dr;
	protected String url;
	
	
	public Basic(WebDriver driver){
		this.dr = driver;
	}
	
	//URL跳转
	public void goTo(){
		this.dr.get(this.url);
	}
	
	//返回当前页面链接
	public String currentUrl(){
		return this.dr.getCurrentUrl();
	}
	
	//多窗口打开处理
	public void Multiwindows(){
		Set<String> handles = this.dr.getWindowHandles();//获取所有窗口
		String handle = this.dr.getWindowHandle();//定义一个当前已经打开的窗口
		handles.remove(this.dr.getWindowHandle());
		WebDriver childDr = this.dr.switchTo().window(handles.iterator().next());
		childDr.close();
		this.dr.switchTo().window(handle);//切换到之前打开的窗口
	}
	//打开火狐浏览器
	public static WebDriver openFireFox() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	//打开
	public static WebDriver openChrome() {
		WebDriver dr1 = new ChromeDriver();
		return dr1;
		
	}
	
	//处理主窗口已关闭子窗口未关闭的情况
	public static void closeWebDriver(WebDriver driver){
		if(driver == null)
			return;
		try{
			String current = driver.getWindowHandle();  
			Set<String> otherWins = driver.getWindowHandles();
			for(String winId : otherWins)
				if(winId.equals(current))
					continue;
				else
					driver.switchTo().window(winId).close();		
		}catch(Exception ex){
			//ignore
		}finally{
			try{
				driver.quit();
			}catch(Exception ex){}
		}
	}
	
	//页面滚屏到底部处理
	public void scrollScreen(){
		//使用js代码执行页面到底部
		((JavascriptExecutor)dr).executeScript("scrollTo(0,4000)");
		
	}
	//层级定位
	public void supernatantLogin(final By fc){
		(new WebDriverWait(dr, 10)).until(new ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver d){
                return d.findElement(fc).isDisplayed();
            }
        } );
		WebElement menu = dr.findElement(fc);
        (new Actions(dr)).moveToElement(menu).perform();
	}
	//UI自动截图功能
	public static void screenShot(WebDriver driver){
		String dir_name = "PageScreens"; //截图存放的目录名称
		//判断是否存在该目录，不存在则新建目录
		if(!(new File(dir_name).isDirectory())){
			new File(dir_name).mkdir();
		}
		
		SimpleDateFormat datef = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String time = datef.format(new Date());// 格式化当前时间，例如20141129-165210
		
		try{
			 // 关键代码，执行屏幕截图，默认会把截图保存到temp目录
			File source_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// 这里将截图另存到我们需要保存的目录，例如PageScreens\20141129-165210.png
			FileUtils.copyFile(source_file, new File(dir_name + File.separator + time + ".png"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
}
