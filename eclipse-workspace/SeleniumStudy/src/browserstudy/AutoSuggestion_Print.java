package browserstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Print {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(1000);
		List<WebElement> li=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

		for(int i=0;i<li.size();i++)
		{
				WebElement auto1=			li.get(i);
					String s1=		auto1.getText();
					System.out.println(s1);
		}
	}

}
