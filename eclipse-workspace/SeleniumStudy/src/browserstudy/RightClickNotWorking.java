package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickNotWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Use F12
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement e1 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Shriniket");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Shriniket@1234");
		WebElement CheckBox = driver.findElement(By.id("chkbox"));
		CheckBox.click();
		

	}

}
