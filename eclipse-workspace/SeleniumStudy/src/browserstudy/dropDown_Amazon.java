package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_Amazon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//span[@class = 'nav-search-scope nav-sprite']
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1  = new Select(e1);
		s1.selectByIndex(11);
	}
}
