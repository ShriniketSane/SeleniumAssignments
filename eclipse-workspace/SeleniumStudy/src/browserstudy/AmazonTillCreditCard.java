package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class AmazonTillCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement Search1 = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox']"));
		if(Search1.isEnabled()==true)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Absent");
			
		}
		//Search1.sendKeys("Shoe");
		//Search1.submit();
	}

}
