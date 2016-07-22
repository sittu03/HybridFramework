package com.finance.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath=".//u[text()='Money']")
	public WebElement moneyLink;
	
	@FindBy (linkText="My Portfolio")
	public WebElement portfolioLink;
	
	@FindBy(css="#useremail")
	public WebElement userNameTextBox;
	
	@FindBy(css="#emailsubmit")
	public WebElement continueBtn;
	
	@FindBy(css="#userpass")
	public WebElement passwordTextBox;
	
	@FindBy(css="#loginsubmit")
	public WebElement loginContinueBtn;
	
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public void doLogin()
	{
		moneyLink.click();
		portfolioLink.click();
		userNameTextBox.sendKeys("mail.singh_sam@yahoo.com");
		continueBtn.click();
		passwordTextBox.sendKeys("7735906929");
		loginContinueBtn.click();
	
	}	
}
