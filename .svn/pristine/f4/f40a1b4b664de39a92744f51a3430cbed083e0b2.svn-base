package com.dedicine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.modules.Basic;
/*
 * 首页右侧浮层
 * 1.登陆
 * 2.注册
 * 3.生意小秘书
 * 4.意见反馈
 * 5.APP
 * 6.返回顶部
 */
public class IndexRight extends Basic {

	public IndexRight(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By memServiceLocator = By.id("rightcblge");
	By loginsuperLocator = By.id("loginf1");
	By memUsernameLocator = By.xpath("//*[@id='loginf1']/p[1]/input");
	By memPasswordLocator = By.xpath("//*[@id='loginf1']/p[2]/input");
	By memSubmitLocator = By.cssSelector("#loginf1 p.mt35 a");
	By secretaryLocator = By.className("rightcbl_xms");
	By rightcblappLocator = By.className("rightcblapp");
	By feedbackLocator = By.className("rightcbldef");
	By backtopLocator = By.className("rightcbltop");
	 
	
	public WebElement memberSrv(){
		return this.dr.findElement(memServiceLocator);
	}
	//处理层级定位鼠标移动
	public void supernatantLogin(){
		(new WebDriverWait(dr, 10)).until(new ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver d){
                return d.findElement(loginsuperLocator).isDisplayed();
            }
        } );
		WebElement menu = dr.findElement(loginsuperLocator);
        (new Actions(dr)).moveToElement(menu).perform();
	}
	
	public WebElement memberUser(){
		return this.dr.findElement(memUsernameLocator);
	}
	
	public WebElement memberPass(){
		return this.dr.findElement(memPasswordLocator);
	}
	
	public WebElement memberSubmit(){
		return this.dr.findElement(memSubmitLocator);
	}
	
	public WebElement secretaryRight(){
		return this.dr.findElement(secretaryLocator);
	}
	
	public WebElement appRight(){
		return this.dr.findElement(rightcblappLocator);
	}
	
	public WebElement feedbackright(){
		return this.dr.findElement(feedbackLocator);
	}
	
	public WebElement returnTop(){
		return this.dr.findElement(backtopLocator);
	}
	
}
