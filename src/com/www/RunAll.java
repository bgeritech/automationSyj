package com.www;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.testcase.TestIndexPage;
import com.testcase.TestLogin;
/*
 * @author:Bger
 * @param:	@SuiteClasses �����Ҫִ�е�����
 * @return:	
 */

@RunWith(Suite.class)
@SuiteClasses({TestLogin.class,TestIndexPage.class})
public class RunAll {
	//TODO run all case.
}
