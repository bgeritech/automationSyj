package com.dedicine;
/*
 * 每个页面头部面包屑
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.modules.Basic;

public class CrumbsPage extends Basic {

	public CrumbsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * syj.com页面面包屑关键元素定位
	 */
	By indexLocator = By.linkText("首页");
	By hotbusinessLocator = By.linkText("热门生意");
	By smallPfLocator = By.linkText("小本批发");
	By collegebusinessLocator = By.linkText("生意学院");
	By bussinessHhLocator = By.linkText("生意合伙");
	By bussinessSecretaryLocator = By.linkText("生意小秘书");
	//定位首页
	public WebElement getIndex(){
		return this.dr.findElement(indexLocator);
	}
	//定位热门生意
	public WebElement gethotSy(){
		return this.dr.findElement(hotbusinessLocator);
	}
	//定位生意学院
	public WebElement getcoBuss(){
		return this.dr.findElement(collegebusinessLocator);
	}
	//定位生意合伙
	public WebElement getbussHn(){
		return this.dr.findElement(bussinessHhLocator);
	}
	//定位生意小秘书
	public WebElement getksecBuss(){
		return this.dr.findElement(bussinessSecretaryLocator);
	}
	//定位小本批发
	public WebElement getSmallpf(){
		return this.dr.findElement(smallPfLocator);
	}
}
