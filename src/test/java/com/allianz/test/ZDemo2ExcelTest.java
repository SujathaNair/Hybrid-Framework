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
		String [][]excelData= new String[3][3];
		
		for (int i=1; i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				String val =sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
				excelData[i][j] = val;
				System.out.print(excelData[i][j] + " ");
				
				
			}
			System.out.println();
		}
		book.close();
		file.close();
		
		

	}

}
