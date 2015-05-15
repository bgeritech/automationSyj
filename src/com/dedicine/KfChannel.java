package com.dedicine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.modules.Basic;

public class KfChannel extends Basic {

	public KfChannel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By kfimLocator = By.id("J_imBox");
	By hidekfLocator = By.className("im-box-act im-box-hide");
	//定位客服浮动框
	public WebElement IMkf(){
		return this.dr.findElement(kfimLocator);
	}
	//定位客服浮动框的关闭元素
	public WebElement IMKFHide(){
		return this.dr.findElement(hidekfLocator);
	}
}
