package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	public static void main(String[] args)
	{
	ChromeDriver driver= new ChromeDriver();
	
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			WebElement us = driver.findElement(By.id("ap_email"));
			us.sendKeys("shriniketsane007@gmail.com");
			WebElement cn = driver.findElement(By.id("continue"));
			cn.click();
			WebElement ps = driver.findElement(By.name("password"));
			ps.sendKeys("Shopping@114");
			WebElement sg = driver.findElement(By.id("signInSubmit"));
			sg.click();
	}
}
