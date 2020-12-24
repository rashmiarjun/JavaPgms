package Poisss;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class HandlingReadData2 {
		
		public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
			Cell c1 = wb.getSheet("sheet2").getRow(1).getCell(0);
	double s = c1.getNumericCellValue();
			
			String s1= c1.toString();
			System.out.println(s1);
			
			

}
	}
