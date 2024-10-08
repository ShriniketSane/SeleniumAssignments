package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EdgeDriver driver1 = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("shriniket@gmail.com");
		WebElement pass = driver.findElement(By.cssSelector("input#pass"));
		pass.sendKeys("password@123");
		WebElement button = driver.findElement(By.cssSelector("button#royal_login_button"));
		button.click();
		
	}

}
