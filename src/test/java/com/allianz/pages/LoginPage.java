package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.AutomationWrapper;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void enterUsername( String username)
	{
		driver.findElement(By.name("username")).sendKeys(username);
	}
	public  void enterPassword(String password)
	{
		driver.findElement(By.name("password")).sendKeys(password);
	}
	public  void clickonLogin()
	{
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
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
	
	// get Dashboard text
		public String getDashboardText()
		{
			String dashboardActualText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
			return dashboardActualText;
		}
	

}
