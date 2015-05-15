package com.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dedicine.CrumbsPage;
import com.dedicine.IndexRight;
import com.modules.Basic;

public class TestCrumbs {

	WebDriver dr;
	@Before
	public void setUp() throws Exception {
		this.dr = new ChromeDriver();
		//dr.get("http://www.syj.com");
		dr.get("https://www.jinshuju.net/f/viMz0j/");
		System.out.println("Start test");
	}

	@After
	public void tearDown() throws Exception {
		this.dr.quit();
		System.out.println("End test");
	}
	@Test
	public void testRefP(){
		Basic roll = new Basic(this.dr);
		roll.scrollScreen();
		System.out.println("ok");
		
	}
	/**
	public void testCrumbs() throws InterruptedException {
		
		CrumbsPage crumbs = new CrumbsPage(this.dr);
		IndexRight rightin = new IndexRight(this.dr);
		Basic roll = new Basic(this.dr);
		crumbs.getIndex().click();
		roll.scrollScreen();
		Thread.sleep(3000);
		rightin.returnTop().click();
		Thread.sleep(3000);
		System.out.println("ok");
	}
	**/
}
