package com.finance.testscripts;

import org.testng.annotations.Test;

import com.finance.pageobjects.LoginPage;
//import com.finance.pageobjects.Loginpage;
import com.finance.testconfiguration.TestConfiguration;

public class LoginTest extends TestConfiguration{

	@Test
	public void performLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.doLogin();
		
		
	}
}
