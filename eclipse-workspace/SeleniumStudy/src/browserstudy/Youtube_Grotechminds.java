package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Grotechminds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		driver.manage().window().maximize();
		WebElement s1 = driver.findElement(By.xpath("//input[@name='search_query']"));
		s1.sendKeys("Grotechminds");
		Thread.sleep(1000);
		s1.sendKeys(Keys.ENTER);
		
	}

}
