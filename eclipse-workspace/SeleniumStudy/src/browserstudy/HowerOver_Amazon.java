package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowerOver_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(w1).perform();
		}

}