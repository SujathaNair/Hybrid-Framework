package com.allianz.test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.utils.DataUtils;

public class LoginTest extends AutomationWrapper{
	
	@Test
	
	public void validLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");;
		driver.findElement(By.name("password")).sendKeys("admin123");;
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		//Assert the header dashboard
		
		String dashboardActualText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(dashboardActualText, "Dashboard");
		
		
	}
	
	@Test(dataProvider ="loginData", dataProviderClass =DataUtils.class)
	
	public void invalidLoginTest(String username, String password, String expectedError )
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		//Assert errormessage
		
		String errorActualText = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		Assert.assertEquals(errorActualText, expectedError);
		
		
	}

}
