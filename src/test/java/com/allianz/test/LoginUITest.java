package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest {

	@Test(priority = 1)
	public void titleTest() {
		System.out.println("Tiltle test ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		String ActualTitle = driver.getTitle();
		System.out.println("Title is: "+ActualTitle);
		Assert.assertEquals(ActualTitle, "OrangeHRM");
	}

	@Test(invocationCount = 2)
	public void applicationDescription() {
		System.out.println("Application version");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		String ActualVersion = driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']")).getText();
		Assert.assertEquals(ActualVersion, "OrangeHRM OS 5.6.1");
	}

}
