package com.finance.testconfiguration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestConfiguration {
	public WebDriver driver;
@BeforeMethod
public void init()
{
	System.setProperty("webdriver.chrome.driver", "./browser_exe/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.rediff.com/");	
}
@AfterMethod
public void tearDown()
{
//driver.quit();	
}
}
