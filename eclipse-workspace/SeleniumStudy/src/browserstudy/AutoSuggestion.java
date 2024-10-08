package browserstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Bengalore");
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//div[@class=['OBMEnb']/ul/li"));
		WebElement auto1 = li.get(6);
		String s1 = auto1.getText();
		System.out.println(s1);
	}
}
