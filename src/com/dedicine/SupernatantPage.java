package com.dedicine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.modules.Basic;

public class SupernatantPage extends Basic {

	public SupernatantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * #####登陆注册弹出层####
	 * @parm1 亲，您的操作需要在登录后才能完成
	 * @parm2 亲，如您要登录请先完成注册
	 */
	//以下是登陆弹出层操作元素@parm1
	By poploginLocator = By.id("pop_login");
	By poploginuserLocator = By.id("log_username");
	By poploginpassLocator = By.id("log_password");
	By poploginrepassLocator = By.id("dl");
	By poploginbtnLocator = By.id("loginbtn");
	By poploginfregLocator = By.id("goregbtn");
	By poplogincloseLocator = By.cssSelector("#pop_login div.title a"); //关闭按钮
	By poploginerrtitleLocator = By.xpath("//div[@id='pop_login']/div[2]/div[1]/ul/li[1]/span"); //登陆错误提示
	//以下是注册弹出层操作元素@parm2
	By popRegLocator = By.id("pop_reg");
	By popReguserLocator = By.id("reg_username");
	By popRegvalidLocator = By.id("reg_valid");
	By popReggetcheckLocator = By.id("getcheck");
	By popRegpassLocator = By.id("reg_password1");
	By popRegpasssLocator = By.id("reg_password2");
	By popRegnameLocator = By.id("reg_truename");
	By popRegagreeLocator = By.id("reg_agree");
	By popRegxyLocator = By.id("tkbtn");
	By popRegisterLocator = By.id("regbtn");
	By popRegCloseLocator = By.cssSelector("#pop_reg div.title a");
	By popRegerrphoneLocator = By.className("msg msg1"); //手机号表单提示语
	By popRegerrvalidLocator = By.className("msg msg2"); //验证码表单提示语
	By popRegerrpass1Locator = By.className("msg msg3"); //密码框提示语
	By popRegerrpass2Locator = By.className("msg msg4"); //重复密码提示语
	By popRegerrnameLocator = By.className("msg msg5"); //用户姓名提示语
	//通用登陆浮层定位
	public WebElement getpopLoginFloat(){
		return this.dr.findElement(poploginLocator);
	}
	//通用登陆浮层用户名表单定位
	public WebElement getpopLoginFloatUser(){
		return this.dr.findElement(poploginuserLocator);
	}
	//通用登陆浮层密码表单定位
	public WebElement getpopLoginFloatPass(){
		return this.dr.findElement(poploginpassLocator);
	}
	//通用登陆浮层记住密码按钮定位
	public WebElement getpopLoginFloatrem(){
		return this.dr.findElement(poploginrepassLocator);
	}
	//通用登陆浮层登陆按钮定位
	public WebElement getpopLoginFloatBtn(){
		return this.dr.findElement(poploginbtnLocator);
	}
	//通用登陆浮层免费注册按钮定位
	public WebElement getpopLoginFloatReg(){
		return this.dr.findElement(poploginfregLocator);
	}
	//通用登陆浮层关闭按钮定位
	public WebElement getpopLoginFloatClose(){
		return this.dr.findElement(poplogincloseLocator);
	}
	//通用登陆浮层错误提示定位
	public WebElement getpopLoginErrTitle(){
		return this.dr.findElement(poploginerrtitleLocator);
	}
	
	//@parm2
	public WebElement getRegSuper(){	//注册浮层
		return this.dr.findElement(popRegLocator);
	}
	//通用登陆-注册浮层用户名表单定位
	public WebElement getRegUser(){
		return this.dr.findElement(popReguserLocator);
	}
	//通用登陆-注册浮层密码表单定位
	public WebElement getRegPassone(){
		return this.dr.findElement(popRegpassLocator);
	}
	//通用登陆-注册浮层重复密码表单定位
	public WebElement getRegPasstwo(){
		return this.dr.findElement(popRegpasssLocator);
	}
	//通用登陆-注册浮层验证码表单定位
	public WebElement getRegValid(){
		return this.dr.findElement(popRegvalidLocator);
	}
	//通用登陆-注册浮层真实姓名表单定位
	public WebElement getRegtrueName(){
		return this.dr.findElement(popRegnameLocator);
	}
	//通用登陆-注册浮层同意条款按钮定位
	public WebElement getRegagreebtn(){
		return this.dr.findElement(popRegagreeLocator);
	}
	//通用登陆-注册浮层条款链接钮定位
	public WebElement getRegxylink(){
		return this.dr.findElement(popRegxyLocator);
	}
	//通用登陆-注册浮层注册按钮定位
	public WebElement getRegister(){
		return this.dr.findElement(popRegisterLocator);
	}
	
}
