package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Name2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("shriniket@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Password@123");
	}

}
