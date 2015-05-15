package com.dedicine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.modules.Basic;

public class LoginPage extends Basic {

	public LoginPage(WebDriver driver,String url) {
		super(driver);
		this.url = url;
		this.goTo();
		// TODO Auto-generated constructor stub
	}
	
	By usernameLocator = By.id("login_email_id");
	By passwordLocator = By.id("loginPassword");
	By VcodeLocator = By.id("loginVfCode");
	By loginButtonLocator = By.className("login_lk_login_btn");
	//��λ�û��������
	public WebElement getUserNameField(){
		return this.dr.findElement(usernameLocator);
	}
	//��λ���������
	public WebElement getPassWordField(){
		return this.dr.findElement(passwordLocator);
	}
	//��λ��֤�������
	public WebElement getVcodeField(){
		return this.dr.findElement(VcodeLocator);
	}
	//��λ��¼��ť
	public WebElement getSubmitButton(){
		return this.dr.findElement(loginButtonLocator);
	}
	//ִ�е�¼����
	private void LoginStep(String userName,String passWord){
		this.getUserNameField().sendKeys(userName);
		this.getPassWordField().sendKeys(passWord);
		this.getSubmitButton().click();
	}
	//��¼����
	public Loginresult login(String userName,String passWord){
		this.LoginStep(userName, passWord);
		return new Loginresult(this.dr);
	}

}
