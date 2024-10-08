package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		gmail.click();
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		WebElement login = driver.findElement(By.id("identifierId"));
		login.sendKeys("sane.shriniket@gmail.com");
		}

}
