package Poisss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCount {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb=WorkbookFactory.create(new FileInputStream("./testdata/input.xlxs"));
		int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();
		System.out.println(rowcount);
		
	}

}
