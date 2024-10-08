package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://netportal.hdfcbank.com/login#/openMarketLoginCC");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='openMarketUID']"));
		username.sendKeys("shriniketsane");
		WebElement password = driver.findElement(By.xpath("//input[@id='keyboard']"));
		password.sendKeys("P@ssword123");
	}

}
