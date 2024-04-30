package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
	private WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;

	}

	// get Dashboard text
	public String getDashboardText() {
		String dashboardActualText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		return dashboardActualText;
	}
	
	//ClickonAssignLeave
	//Clickonleavelist
	//ClickonTimesheet

}
