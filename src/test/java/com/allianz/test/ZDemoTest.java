package com.allianz.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZDemoTest {
	
	@DataProvider
	public Object[][] validData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "Saul";
		data[0][1] = "Saul123";
		
		data[1][0] = "Lia";
		data[1][1] = "Lia123";
		
		data[2][0] = "Ria";
		data[2][1] = "Ria123";
		
		return data;
		
	}
	@Test(dataProvider ="validData")
	
	public void validTest(String username, String password)
	{
		System.out.println("Credentials" +username+" "+password);
	}
	
	

}
