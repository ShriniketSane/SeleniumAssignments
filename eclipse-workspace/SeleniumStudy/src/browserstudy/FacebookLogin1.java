package browserstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookLogin1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("C:\\Users\\shrin\\OneDrive\\Desktop\\GitAcc\\Assignments\\DDT.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		for (int i=1;i<6;i++)
		{
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("pass")).clear();
				String email = w1.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
				String password = w1.getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();
				driver.findElement(By.id("email")).sendKeys(email);
				driver.findElement(By.id("pass")).sendKeys(password);
				driver.findElement(By.name("login")).click();
				Thread.sleep(2000);
				
		}
	}

}
