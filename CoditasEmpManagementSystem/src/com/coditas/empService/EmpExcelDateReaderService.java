package com.coditas.empService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.coditas.model.Employee;

public class EmpExcelDateReaderService {

	

	public static List<Employee> readFromExcel(String file) throws IOException {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
		XSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");
		
		System.out.println(myExcelSheet.getPhysicalNumberOfRows());
		
		
		// Iterate excel sheet1 for all rows and getting cell by cell
		for(int rowCnt=0 ; rowCnt<myExcelSheet.getPhysicalNumberOfRows(); rowCnt++){
			Employee employee = new Employee();
			XSSFRow row = myExcelSheet.getRow(rowCnt);	
			if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				String name = row.getCell(0).getStringCellValue();
				employee.setE_name(name);
				System.out.println("NAME : " + name);
			}
			if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
				Double in_Time = row.getCell(1).getNumericCellValue();
				employee.setIn_time(Double.toString(in_Time));
				System.out.println("Contact :" + in_Time);
			}
			if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
				Double out_Time = row.getCell(2).getNumericCellValue();
				employee.setIn_time(Double.toString(out_Time));
				System.out.println("Contact :" + out_Time);
			}
			if (row.getCell(2).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
				double contact = row.getCell(1).getNumericCellValue();
				System.out.println("Contact :" + contact);
			}
			
			employees.add(employee);
		}
		myExcelBook.close();
		return employees;
	}

}
