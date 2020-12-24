package com.autodesk.crm.Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Gaurav
 *
 */
public class FileLib {

	String filePath = "./data/input.xlsx";
	String propFile = "./data/commonData.properties";

	/**
	 * used to read data from excel
	 * 
	 * @param sheetName
	 * @param rownNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName, int rownNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rownNum);
		String data = row.getCell(cellNum).getStringCellValue();
		return data;

	}

	/**
	 * used to write data in excel
	 * 
	 * @param sheetName
	 * @param rownNum
	 * @param cellNum
	 * @param cellValue
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetName, int rownNum, int cellNum, String cellValue)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rownNum);
		Cell cel = row.createCell(cellNum);
		cel.setCellValue(cellValue);
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		wb.close();

	}

	/**
	 * used to get the number of Row in excel sheet
	 * 
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowIndex = sh.getLastRowNum();
		return rowIndex;
	}

	/**
	 * used to get the common data from properties file
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream(propFile);
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj.getProperty(key);
	}

}