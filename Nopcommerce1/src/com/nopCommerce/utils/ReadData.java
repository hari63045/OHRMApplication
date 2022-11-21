package com.nopCommerce.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static String getLoactor(String filename, String key) throws Exception {
		String filepath=".//locators//"+filename+".properties";
		FileInputStream instream=new FileInputStream(filepath);
		Properties pro=new Properties();
		pro.load(instream);
	return	pro.getProperty(key);
		
	}
	/*public static void main(String[] args) throws Exception {
		String value=ReadData.getLoactor("loginpage", "login");
		System.out.println(value);
	}*/
// second program	
	
	public static String getdata(String filename, int row, int col ) throws Exception {
		String filepath=".//testData//"+filename+".xlsx";
		FileInputStream instream=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(instream);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	/*public static void main(String[] args) throws Exception {
		String data=ReadData.getdata("browser", 1, 1);
		System.out.println(data);
	}*/
	
//Third program
	public static List<String> getdata(String filename, int row) throws Exception {
	String filepath=".//testData//"+filename+".xlsx";
	FileInputStream instream=new FileInputStream(filepath);
	XSSFWorkbook workbook = new XSSFWorkbook(instream);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int cellscount = sheet.getRow(row).getLastCellNum();
	List<String> rowData=new ArrayList<String>();
	for(int i=0;i<cellscount;i++)
	{
	String data=sheet.getRow(row).getCell(i).getStringCellValue();
	rowData.add(data);	
	}
		return rowData;	
	
	}
	/*public static void main(String[] args) throws Exception {
	List<String> data=ReadData.getdata("browser", 1);
	System.out.println(data);
	
}*/
//	fourth method
	
	public static String[][] getdata(String filename) throws Exception {
		String filepath=".//testData//"+filename+".xlsx";
		FileInputStream instream=new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cellscount = sheet.getRow(0).getLastCellNum();
		String completeData[][]=new String[rows][cellscount];
		int k=0,l;
		for(int i=1;i<rows;i++)
		{
			l=0;
			for(int j=0;j<cellscount;j++) {
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				completeData[k][l]=data;
				System.out.println(completeData[k][l]+"");
				l++;
			}
			System.out.println();
			k++;
		}
		return completeData;
		
		}
	/*	public static void main(String[] args) throws Exception {
	 ReadData.getdata("browser");

}*/
}

	
