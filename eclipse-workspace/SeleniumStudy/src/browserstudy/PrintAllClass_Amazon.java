package browserstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllClass_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> li = driver.findElements(By.tagName("a"));
		int count = li.size();
		System.out.println(count);
		for(int i = 0; i<count; i++)
		{
			WebElement a1 = li.get(i);
			String s1 = a1.getText();
			System.out.println(s1);
		}
	}

}
