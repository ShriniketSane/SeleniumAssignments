package browserstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ManishHTML {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\shrin\\OneDrive\\Pictures\\Assignments\\Manish.html");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("firstName"));
		w1.sendKeys("Shriniket");
		WebElement w2 = driver.findElement(By.id("lastName"));
		w2.sendKeys("Sane");
		WebElement w3 = driver.findElement(By.id("email"));
		w3.sendKeys("abc@123");
		WebElement w4 = driver.findElement(By.id("subscribe"));
		w4.click();
		WebElement w5 = driver.findElement(By.id("male"));
		w5.click();
		WebElement w6 = driver.findElement(By.id("country"));
		Select s1 = new Select(w6);
		s1.selectByVisibleText("Australia");
		WebElement w7 = driver.findElement(By.xpath("//input[@type ='button']"));
		w7.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
