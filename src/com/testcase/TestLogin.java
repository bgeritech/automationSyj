package com.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dedicine.*;

public class TestLogin {
	WebDriver dr;
	String loginPageUrl;
	@Before
	public void setUp() throws Exception {
		System.out.println("Start test.");
		this.dr = new ChromeDriver();
		this.loginPageUrl = "http://uc.syj.com/member/login?to_url=http://uc.syj.com/member/login";
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End test.");
		this.dr.quit();
	}

	@Test
	public void testTestLogin() {
		String userName = "18255658090";
		String passWord = "test123";
		LoginPage lPage = new LoginPage(this.dr,this.loginPageUrl);
		Loginresult lresult = lPage.login(userName, passWord);
		assertTrue(lresult.currentUrl().contains("member"));
		System.out.println(dr.findElement(By.id("usn_n")).getText() + "Login successfully!");
	}
}
