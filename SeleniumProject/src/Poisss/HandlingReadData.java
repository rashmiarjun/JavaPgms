package Poisss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingReadData {
	
public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException
 {
	Workbook wb=WorkbookFactory.create(new FileInputStream("./testData/input.xlxs"));
	Sheet s = wb.getSheet("");
	Row r = s.getRow(0);
	Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	System.out.println(value);
	
	Cell c1= wb.getSheet("sheet1").getRow(1).getCell(0);
    String s1= c.getStringCellValue();
    System.out.println(s);
	
	String un = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println("UserName is"+un);
	
	String pw = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	
	System.out.println("PassWord is"+pw);
	
	
	
	
}
}
