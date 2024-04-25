package com.allianz.test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.pages.LoginPage;
import com.allianz.utils.DataUtils;

public class LoginTest extends AutomationWrapper{
	
	@Test(dataProvider ="commonDataProvider", dataProviderClass =DataUtils.class)
	
	
	public void validLoginTest(String username, String password, String expectedHeader)
	{
		//driver.findElement(By.name("username")).sendKeys(username);;
		//driver.findElement(By.name("password")).sendKeys(password);;
		//driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
//		LoginPage.enterUsername(driver, username);
//		LoginPage.enterPassword(driver, password);
//		LoginPage.clickonLogin(driver);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickonLogin();
		
		//Assert the header dashboard
		
		String dashboardActualText = loginPage.getDashboardText();
		Assert.assertEquals(dashboardActualText, expectedHeader);
		
		
	}
	
	@Test(dataProvider ="commonDataProvider", dataProviderClass =DataUtils.class)
	
	public void invalidLoginTest(String username, String password, String expectedError )
	{
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickonLogin();
		
		
		//Assert errormessage
		
		String errorActualText = loginPage.getInvalidErrorMessage();
		Assert.assertEquals(errorActualText, expectedError);
		
		
	}

}
