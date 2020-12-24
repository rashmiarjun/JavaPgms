package Poisss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;

public class HandlingWriteData {
	public static void main(String[] args) throws IOException,EncryptedDocumentException, FileNotFoundException
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
		Cell c = wb.getSheet("sheet1").createRow(2).createCell(0);
		c.setCellValue("Selenium");
		
		
		wb.write(new FileOutputStream("./testData/input.xlsx"));//saving file
	}

}