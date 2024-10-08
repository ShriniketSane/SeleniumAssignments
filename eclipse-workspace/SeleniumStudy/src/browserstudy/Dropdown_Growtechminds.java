package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Growtechminds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("Choice1"));
		Select s1 = new Select(w1);
		s1.selectByVisibleText("Demo2");
		WebElement w2 = driver.findElement(By.id("Choice2"));
		Select s2 = new Select(w2);
		s2.selectByIndex(15);
		WebElement w3 = driver.findElement(By.id("Choice3"));
		Select s3 = new Select(w3);
		s3.selectByValue("Power10");
		
		for(int i = 15; i>8; i--)
		{
		WebElement w4 = driver.findElement(By.id("Choice"+(19-i)));
		Select s4 = new Select(w4);
		
		s4.selectByIndex(i);
		}
	}

}
