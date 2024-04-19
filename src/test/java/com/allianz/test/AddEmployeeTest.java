package com.allianz.test;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class AddEmployeeTest extends AutomationWrapper {
	@Test
	
	public void uploadInvalidDisplayPicture()
	{
		File file = new File ("src/test/resources/files/Sample text.txt");
		String path = file.getAbsolutePath();
		driver.findElement(By.name("username")).sendKeys("Admin");;
		driver.findElement(By.name("password")).sendKeys("admin123");;
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.xpath("//input[@type='file' and @class ='oxd-file-input']")).sendKeys(path);
		String actualError = driver.findElement(By.xpath("//span[contains(normalize-space(),'File type')]")).getText();
		Assert.assertTrue(actualError.contains("File type not allowed"));
		
		
	}

}
