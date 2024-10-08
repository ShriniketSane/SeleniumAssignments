package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_name3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement SearchBox = driver.findElement(By.name("search_query"));
		SearchBox.sendKeys("GrotechMinds");
		SearchBox.sendKeys(Keys.ENTER);
		}

}
