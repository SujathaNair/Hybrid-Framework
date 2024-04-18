package com.allianz.utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public Object[][] loginData()
	{
		Object[][] data = new Object[2][3];
		data[0][0] = "Saul";
		data[0][1] = "Saul123";
		data[0][2] ="Invalid credentials";
		
		data[1][0] = "Lia";
		data[1][1] = "Lia123";
		data[1][2] ="Invalid credentials";
		
				
		return data;
		
	}

}
