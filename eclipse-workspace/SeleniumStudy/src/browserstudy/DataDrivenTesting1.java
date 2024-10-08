package browserstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("C:\\Users\\shrin\\OneDrive\\Desktop\\GitAcc\\Assignments\\Selenium.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Sheet1");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String username = c1.getStringCellValue();
		System.out.println(username);
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(2);
		String password = c2.getStringCellValue();
		System.out.println(password);
		
		
	}

}
