package com.allianz.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static Object[][] getSheetIntoTwoDimensionalArray(String path, String sheetName) throws IOException
	{
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet =  book.getSheet(sheetName);
		
			
		int rowCount =sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][]excelData= new Object[rowCount-1][cellCount];
		
		DataFormatter format = new DataFormatter();
		
		for (int i=1; i<rowCount;i++)
		{
			for (int j=0;j<cellCount;j++)
			{
				excelData[i-1][j]  = format.formatCellValue(sheet.getRow(i).getCell(j));
				//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
			
				System.out.print(excelData[i-1][j] + " ");
				
				
			}
			System.out.println();
		}
		book.close();
		file.close();
		
		return excelData;
		
		


	}
	
	

}
