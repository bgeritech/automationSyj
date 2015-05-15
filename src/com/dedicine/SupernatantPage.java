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
	 * #####��½ע�ᵯ����####
	 * @parm1 �ף����Ĳ�����Ҫ�ڵ�¼��������
	 * @parm2 �ף�����Ҫ��¼�������ע��
	 */
	//�����ǵ�½���������Ԫ��@parm1
	By poploginLocator = By.id("pop_login");
	By poploginuserLocator = By.id("log_username");
	By poploginpassLocator = By.id("log_password");
	By poploginrepassLocator = By.id("dl");
	By poploginbtnLocator = By.id("loginbtn");
	By poploginfregLocator = By.id("goregbtn");
	By poplogincloseLocator = By.cssSelector("#pop_login div.title a"); //�رհ�ť
	By poploginerrtitleLocator = By.xpath("//div[@id='pop_login']/div[2]/div[1]/ul/li[1]/span"); //��½������ʾ
	//������ע�ᵯ�������Ԫ��@parm2
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
	By popRegerrphoneLocator = By.className("msg msg1"); //�ֻ��ű���ʾ��
	By popRegerrvalidLocator = By.className("msg msg2"); //��֤�����ʾ��
	By popRegerrpass1Locator = By.className("msg msg3"); //�������ʾ��
	By popRegerrpass2Locator = By.className("msg msg4"); //�ظ�������ʾ��
	By popRegerrnameLocator = By.className("msg msg5"); //�û�������ʾ��
	//ͨ�õ�½���㶨λ
	public WebElement getpopLoginFloat(){
		return this.dr.findElement(poploginLocator);
	}
	//ͨ�õ�½�����û�������λ
	public WebElement getpopLoginFloatUser(){
		return this.dr.findElement(poploginuserLocator);
	}
	//ͨ�õ�½�����������λ
	public WebElement getpopLoginFloatPass(){
		return this.dr.findElement(poploginpassLocator);
	}
	//ͨ�õ�½�����ס���밴ť��λ
	public WebElement getpopLoginFloatrem(){
		return this.dr.findElement(poploginrepassLocator);
	}
	//ͨ�õ�½�����½��ť��λ
	public WebElement getpopLoginFloatBtn(){
		return this.dr.findElement(poploginbtnLocator);
	}
	//ͨ�õ�½�������ע�ᰴť��λ
	public WebElement getpopLoginFloatReg(){
		return this.dr.findElement(poploginfregLocator);
	}
	//ͨ�õ�½����رհ�ť��λ
	public WebElement getpopLoginFloatClose(){
		return this.dr.findElement(poplogincloseLocator);
	}
	//ͨ�õ�½���������ʾ��λ
	public WebElement getpopLoginErrTitle(){
		return this.dr.findElement(poploginerrtitleLocator);
	}
	
	//@parm2
	public WebElement getRegSuper(){	//ע�ḡ��
		return this.dr.findElement(popRegLocator);
	}
	//ͨ�õ�½-ע�ḡ���û�������λ
	public WebElement getRegUser(){
		return this.dr.findElement(popReguserLocator);
	}
	//ͨ�õ�½-ע�ḡ���������λ
	public WebElement getRegPassone(){
		return this.dr.findElement(popRegpassLocator);
	}
	//ͨ�õ�½-ע�ḡ���ظ��������λ
	public WebElement getRegPasstwo(){
		return this.dr.findElement(popRegpasssLocator);
	}
	//ͨ�õ�½-ע�ḡ����֤�����λ
	public WebElement getRegValid(){
		return this.dr.findElement(popRegvalidLocator);
	}
	//ͨ�õ�½-ע�ḡ����ʵ��������λ
	public WebElement getRegtrueName(){
		return this.dr.findElement(popRegnameLocator);
	}
	//ͨ�õ�½-ע�ḡ��ͬ�����ť��λ
	public WebElement getRegagreebtn(){
		return this.dr.findElement(popRegagreeLocator);
	}
	//ͨ�õ�½-ע�ḡ����������ť��λ
	public WebElement getRegxylink(){
		return this.dr.findElement(popRegxyLocator);
	}
	//ͨ�õ�½-ע�ḡ��ע�ᰴť��λ
	public WebElement getRegister(){
		return this.dr.findElement(popRegisterLocator);
	}
	
}
