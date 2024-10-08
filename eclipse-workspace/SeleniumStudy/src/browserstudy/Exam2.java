package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Exam2 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
		WebElement popup = driver.findElement(By.xpath("//button[@class='moe-chrome-style-notification-btn moe-btn-close moe-block-class']"));
		popup.click();
		WebElement search = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		search.sendKeys("shoe");
		WebElement searchbutton = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		searchbutton.click();
		WebElement shoe3 = driver.findElement(By.xpath("//img[@sizes='3']"));
		shoe3.click();
		
	}

}
