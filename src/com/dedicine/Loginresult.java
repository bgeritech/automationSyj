package com.dedicine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.modules.Basic;

public class Loginresult extends Basic {

	public Loginresult(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By greetingLocator = By.xpath("//*[@id='titlea']/span[1]");
	//��λ��¼���״̬
	public WebElement getGreetingplate(){
		return this.dr.findElement(greetingLocator);
	}
}
