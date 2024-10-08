package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(w1);
		s1.selectByIndex(12);
		WebElement s2 = driver.findElement(By.id("twotabsearchtextbox"));
		s2.sendKeys("India");
		s2.sendKeys(Keys.ENTER);
		
	}

}
