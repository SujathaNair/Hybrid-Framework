package com.allianz.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZDemo2ExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("src/test/resources/test_data/hrm_data.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet =  book.getSheet("invalidLoginTest");
		String value = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		// Write logic to print all cell values
		int rowCount =sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		String [][]excelData= new String[rowCount-1][cellCount];
		
		for (int i=1; i<rowCount;i++)
		{
			for (int j=0;j<cellCount;j++)
			{
				String val =sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
				excelData[i-1][j] = val;
				System.out.print(excelData[i-1][j] + " ");
				
				
			}
			System.out.println();
		}
		book.close();
		file.close();
		
		

	}

}
