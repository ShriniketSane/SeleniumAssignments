package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement customer = driver.findElement(By.partialLinkText("customer"));
		customer.click();
	}

}
