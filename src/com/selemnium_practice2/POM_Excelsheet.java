package com.selemnium_practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class POM_Excelsheet {

	public static String Data(int row, int cell, String FileName) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Nikita\\Documents\\Selenium_Practice\\Form.xlsx");
		//FileInputStream file = new FileInputStream("C:\\Users\\Nikita\\Documents\\Selenium_Practice\\Form_2.xlsx");
		String value = WorkbookFactory.create(file).getSheet(FileName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
