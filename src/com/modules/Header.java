package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header extends Basic {

	public Header(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By headerloginLocator = By.id("login_hd");
	By headerregLocator = By.id("reg_hd");
	By headerMyfc = By.id("myid3");
	By header3gLocator = By.linkText("手机生意街");
	By headerzqtoolsLocator = By.className("mysyjtool mysyj  ");
	By headermysyjLocator = By.linkText("我的生意街");
	By headermycpjlLocator = By.linkText("我的测评记录");
	By headermyjoinLocator = By.linkText("我加入的生意");
	By headermyrelLocator = By.linkText("我发起的生意");
	By headerwenLocator = By.className("ncion mysyj aarrow n_ngin");
	By headermyquesLocator = By.linkText("我的提问");
	By headermyansLocator = By.linkText("我的解答");
	
	//头部的【亲，请登录 】
	public WebElement getHeaderLogin(){
		return this.dr.findElement(headerloginLocator);
	}
	
	public WebElement getHeaderRegister(){
		return this.dr.findElement(headerregLocator);
	}
	
	public WebElement getHeader3gSyj(){
		return this.dr.findElement(header3gLocator);
	}
	
	public WebElement getHeaderZhuanqian(){
		return this.dr.findElement(headerzqtoolsLocator);
	}
	
	public WebElement getHeaderMySyj(){
		return this.dr.findElement(headermysyjLocator);
	}
	
	public WebElement getHeaderMyCP(){
		return this.dr.findElement(headermycpjlLocator);
	}
	
	public WebElement getHeaderMySy(){
		return this.dr.findElement(headermyjoinLocator);
	}
	
	public WebElement getHeaderSybClub(){
		return this.dr.findElement(headerwenLocator);
	}
	
	public WebElement getHeaderMyTw(){
		return this.dr.findElement(headermyquesLocator);
	}
	
	public WebElement getHeaderMyJD(){
		return this.dr.findElement(headermyansLocator);
	}
	
	public WebElement getHeaderMyFc(){
		return this.dr.findElement(headerMyfc);
	}
}
