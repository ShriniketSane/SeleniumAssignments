package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement c1 = driver.findElement(By.id("email"));
		boolean answer = c1.isDisplayed();
		boolean answer1 = c1.isEnabled();
		System.out.println(answer);
		System.out.println(answer1);
		WebElement c2 = driver.findElement(By.id("Female"));
		c2.click();
		if (c2.isSelected()==true)
		{
			System.out.println("My test case is passed");
		}
		else
		{
			System.out.println("My test case is failed");
		}
		
		
	}

}
