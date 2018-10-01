package com.coditas.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDateReader {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		readFromExcel("C:\\Users\\Prachee\\git\\CODITAS-Assignment\\CoditasEmpManagementSystem\\src\\coditasEmpDetails.xlsx");
	}

	public static void readFromExcel(String file) throws IOException {
		XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
		XSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");
		
		System.out.println(myExcelSheet.getPhysicalNumberOfRows());
		
		
		// Iterate excel sheet1 for all rows and getting cell by cell
		for(int rowCnt=0 ; rowCnt<myExcelSheet.getPhysicalNumberOfRows(); rowCnt++){
			XSSFRow row = myExcelSheet.getRow(rowCnt);	
			if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				String name = row.getCell(0).getStringCellValue();
				System.out.println("NAME : " + name);
			}
			if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
				double contact = row.getCell(1).getNumericCellValue();
				System.out.println("Contact :" + contact);
			}
		}
		
		
		
	
		
		myExcelBook.close();
	}

}
