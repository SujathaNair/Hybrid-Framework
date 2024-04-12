package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {
	
	
	@Test(priority = 1)
	public void titleTest() {
		System.out.println("Tiltle test ");
		
		String ActualTitle = driver.getTitle();
		System.out.println("Title is: "+ActualTitle);
		Assert.assertEquals(ActualTitle, "OrangeHRM");
	}

	@Test(invocationCount = 2)
	public void applicationDescription() {
		System.out.println("Application version");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		String ActualVersion = driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']")).getText();
		Assert.assertEquals(ActualVersion, "OrangeHRM OS 5.6.1");
	}

}
