package com.testcase;

import static org.junit.Assert.assertFalse;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

import com.dedicine.CrumbsPage;

public class TestIndexPage {
	WebDriver dr;
	@Before
	public void setUp() throws Exception {
		this.dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.syj.com");
		System.out.println("Start test");
	}

	@After
	public void tearDown() throws Exception {
		this.dr.quit();
		System.out.println("End test");
	}

	@Test
	public void testStaticPage() throws InterruptedException {
		String userName = "18255658090";
		String passWord = "test123";		
		/**
		 * 侧边栏登录浮层测试登陆
		 */
		dr.findElement(By.linkText("首页")).click();
		System.out.println(dr.getCurrentUrl() + dr.getTitle());
		
		dr.findElement(By.id("rightcblge")).click();
		(new WebDriverWait(dr, 10)).until(new ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver d){
                return d.findElement(By.id("loginf1")).isDisplayed();
            }
        } );
		WebElement menu = dr.findElement(By.id("loginf1"));
        (new Actions(dr)).moveToElement(menu).perform();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='loginf1']/p[1]/input")).sendKeys(userName);
		dr.findElement(By.xpath("//*[@id='loginf1']/p[2]/input")).sendKeys(passWord);
		dr.findElement(By.cssSelector("#loginf1 p.mt35 a")).click();
		System.out.println(dr.findElement(By.id("mess1")).getText() + "登陆成功！" );
		Thread.sleep(3000);
		/**
		 * 首页会员信息板块登录后测试退出
		 */
		String exit = dr.findElement(By.cssSelector("#titlea a")).getText();
		String realName = dr.findElement(By.id("usn_n")).getText();
		dr.findElement(By.cssSelector("#titlea a")).click();
		assertFalse(exit,dr.findElement(By.xpath("//*[@id='titlea']/span[1]")).getText().contains("退出"));
		System.out.println(realName + "：已退出！");
		Thread.sleep(1000);
		/**
		 *右侧小秘书页面操作
		 */
		dr.findElement(By.className("rightcbl_xms")).click();
		dr.navigate().back();
		Thread.sleep(1000);
		/**
		 * 右侧APP操作
		 */
		WebElement rightApp =dr.findElement(By.className("rightcblapp"));
		(new Actions(dr)).moveToElement(rightApp).perform();
		Thread.sleep(1000);
		/**
		 * 右侧意见反馈操作
		 */
        WebElement element = dr.findElement(By.className("rightcbldef"));
        element.click();
        Thread.sleep(2000);
        Set<String> handles = dr.getWindowHandles();//获取所以浏览器窗口
        String handle = dr.getWindowHandle();
        handles.remove(dr.getWindowHandle());
        WebDriver d = dr.switchTo().window(handles.iterator().next());        
        d.close();//关闭当前打开的窗口
        dr.switchTo().window(handle); 
        System.out.println(element.getText());
		/**
		 * 右侧返回顶部链接检查
		 */
		dr.findElement(By.className("rightcbltop")).click();	
		/**
		 * syj.com首页面包屑检查
		 */
		dr.findElement(By.linkText("热门生意")).click();
		System.out.println(dr.getCurrentUrl() + dr.getTitle());
		dr.findElement(By.linkText("小本批发")).click();
		System.out.println(dr.getCurrentUrl() + dr.getTitle());
		dr.findElement(By.linkText("生意学院")).click();
		System.out.println(dr.getCurrentUrl() + dr.getTitle());
		dr.findElement(By.linkText("生意合伙")).click();
		System.out.println(dr.getCurrentUrl() + dr.getTitle());
		dr.findElement(By.linkText("生意小秘书")).click();
		System.out.println(dr.getCurrentUrl() + dr.getTitle());
		Thread.sleep(1000);	
	}

}
