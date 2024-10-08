package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearningHTML1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\shrin\\OneDrive\\Pictures\\Assignments\\learningHTML1.html");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("1"));
		w1.sendKeys("shriniket");
		WebElement w2 = driver.findElement(By.id("2"));
		w2.sendKeys("Name of your first school");
		WebElement w3 = driver.findElement(By.id("3"));
		w3.sendKeys("abc@123");
		WebElement w4 = driver.findElement(By.xpath("//input[@name='fname']"));
		w4.sendKeys("Shriniket Sane");
		WebElement w5 = driver.findElement(By.id("123"));
		w5.click();
		
	}

}
