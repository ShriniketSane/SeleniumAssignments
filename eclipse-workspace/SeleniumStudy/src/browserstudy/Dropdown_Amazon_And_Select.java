package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Amazon_And_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//span[@class = 'nav-search-scope nav-sprite']
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		s1.selectByValue("search-alias=stripbooks"); //Select by value
		
		Select s2 = new Select(e1);
		s2.selectByVisibleText("Books");//Select by Visible text
		
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("Power of Mind");
		w1.sendKeys(Keys.ENTER);
	}

}
