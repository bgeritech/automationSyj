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
	By header3gLocator = By.linkText("�ֻ������");
	By headerzqtoolsLocator = By.className("mysyjtool mysyj  ");
	By headermysyjLocator = By.linkText("�ҵ������");
	By headermycpjlLocator = By.linkText("�ҵĲ�����¼");
	By headermyjoinLocator = By.linkText("�Ҽ��������");
	By headermyrelLocator = By.linkText("�ҷ��������");
	By headerwenLocator = By.className("ncion mysyj aarrow n_ngin");
	By headermyquesLocator = By.linkText("�ҵ�����");
	By headermyansLocator = By.linkText("�ҵĽ��");
	
	//ͷ���ġ��ף����¼ ��
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
