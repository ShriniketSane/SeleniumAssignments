package browserstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("Shoes");
		Thread.sleep(5000);
		List<WebElement> li = driver.findElements(By.xpath("div[@class='two-pane-results-container']/div/div"));
		int a = li.size();
		System.out.println(a);
		li.get(1).click();
	}

}
