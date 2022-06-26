package com.selemnium_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static String getDataFromExcel(int Row, int Cell, String FileName) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Nikita\\Documents\\Selenium_Practice\\Gmail.xlsx");
		String Value = WorkbookFactory.create(file).getSheet(FileName).getRow(Row).getCell(Cell).getStringCellValue();
		return Value;
	}
}
