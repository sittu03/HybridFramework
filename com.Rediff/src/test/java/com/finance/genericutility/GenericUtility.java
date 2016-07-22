package com.finance.genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtility {
	public static void selectDDLByIndex(WebElement wb, int index) {
		
			Select select = new Select(wb);
			select.selectByIndex(index);
		}
	
		// select dropdown value with value
		public static void selectDDLByValue(WebElement wb, String value) {
			Select select = new Select(wb);
			select.selectByValue(value);
		}
	
		// select dropdown value with visibleText
		public static void selectDDLByVisibleText(WebElement wb, String visibleText) {
			Select select = new Select(wb);
			select.selectByVisibleText(visibleText);
		}
	
		// deselecting dropdown value with visibletext
		public static void deselectDDLByVisibleText(WebElement wb, String visibleText) {
			Select deselect = new Select(wb);
			deselect.selectByVisibleText(visibleText);
		}
	
		// deselecting dropdown value with value
		public static void deselectDDLByValue(WebElement wb, String value) {
			Select deselect = new Select(wb);
			deselect.selectByValue(value);
		}
	
		// deselecting dropdown value with index
		public static void deselectDDLByIndex(WebElement wb, int index) {
			Select deselect = new Select(wb);
			deselect.selectByIndex(index);
		}
	
		// deselecting all dropdown value
		public static void deselectAll(WebElement wb) {
	
			Select deselect = new Select(wb);
			deselect.deselectAll();
		}
	
		// for checking whether the dropdown list is multiselected or singleselected
		public static boolean isMultiple(WebElement wb) {
	
			Select checkDDL = new Select(wb);
	
			boolean b = checkDDL.isMultiple();
			return b;
		}
	
		// deselecting dropdown value with value
		public static void getAllSelectedOptions(WebElement wb) {
	
			Select selectAll = new Select(wb);
			selectAll.getAllSelectedOptions();
	
		}
	
		// get all options from the drop-down
		public static void getAllOptions(WebElement wb) {
	
			Select select = new Select(wb);
			select.getOptions();
	
		}
	
		// clicking ok button on the alert popup
		public static void acceptAlert(WebDriver driver) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
	
		// clicking cancel button on the alert pop-up
		public static void dismissAlert(WebDriver driver) {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
	
		// handling promptalert
		public static void promAlert(WebDriver driver, String data) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(data);
			alert.accept();
		}
	
		public static void getAlertMsg(WebDriver driver) {
			Alert alert = driver.switchTo().alert();
			alert.getText();
		}
		public static void FrameByIndex(WebDriver driver, int index) {
			driver.switchTo().frame(index);
		}
	
		public static void FrameByName(WebDriver driver, String name) {
			driver.switchTo().frame(name);
		}
	
		public static void FrameById(WebDriver driver, String id) {
			driver.switchTo().frame(id);
		}
	
		public static void FrameByWebElement(WebDriver driver, WebElement webelement) {
			driver.switchTo().frame(webelement);
		}
	
		public static void doubleClick(WebDriver driver, WebElement webelement) {
			Actions actions = new Actions(driver);
			actions.doubleClick(webelement).perform();
		}
	
		public static void contextClick(WebDriver driver, WebElement webelement) {
			Actions actions = new Actions(driver);
			actions.contextClick(webelement).perform();
		}
	
		public static void moveToElement(WebDriver driver, WebElement webelement) {
			Actions actions = new Actions(driver);
			actions.moveToElement(webelement).perform();
		}
	
		public static void clickAndHold(WebDriver driver, WebElement webelement) {
			Actions actions = new Actions(driver);
			actions.clickAndHold(webelement).perform();
		}
	
		public static void sendKeys(WebDriver driver, WebElement webelement) {
			Actions actions = new Actions(driver);
			actions.sendKeys(webelement).perform();
		}
	
		public static void release(WebDriver driver, WebElement webelement) {
			Actions actions = new Actions(driver);
			actions.release(webelement).perform();
		}
	
		public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
			Actions actions = new Actions(driver);
			actions.dragAndDrop(source, target).perform();
		}
	
		
		public static void takeScreenshot(WebDriver driver,String name) throws IOException{
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./screenshots/"+name+".png"));
		}
	
}

