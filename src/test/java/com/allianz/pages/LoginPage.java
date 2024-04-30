package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords {
	
	private By usernameLocator=By.name("username");
	private By passwordLocator =By.name("password");
	private By clickonLoginLocator = By.xpath("//button[text()=' Login ']");
	
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		
	}
	
	public void enterUsername( String username)
	{
		//driver.findElement(usernameLocator).sendKeys(username);
		super.setInputText(usernameLocator, username);
		
	}
	public  void enterPassword(String password)
	{
		//driver.findElement(passwordLocator).sendKeys(password);
		super.setInputText(passwordLocator, password);
	}
	public  void clickonLogin()
	{
		//driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		super.clickElement(clickonLoginLocator);
	}
	
	
//	public static void clickonLogin(WebDriver driver)
//	{
//		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//	}
//	
	// get invalid error message
	public String getInvalidErrorMessage()
	{
		String errorActualText = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		return errorActualText;
	}
	
	public String usernamePlaceHolder()
	{
		return driver.findElement(usernameLocator).getAttribute("placeholder");
	}
	
	
	

}
