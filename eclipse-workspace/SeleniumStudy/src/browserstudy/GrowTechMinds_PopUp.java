package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowTechMinds_PopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Search1 = driver.findElement(By.xpath("(//input[@onclick='myFunction()']"));
		Search1.click();
		driver.switchTo().alert().accept();

	}

}
