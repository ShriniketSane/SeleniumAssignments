package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement us = driver.findElement(By.xpath("(((((/html/body)[1]/div)[1]/header/div/div)[1]/div)[2]/div/form/div[2]/div[1]/div/input)"));
		us.sendKeys("Shoes");
		us.sendKeys(Keys.ENTER);
	}
}
