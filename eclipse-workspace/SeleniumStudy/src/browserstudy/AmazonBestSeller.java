package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonBestSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement BestSeller = driver.findElement(By.partialLinkText("Best"));
		BestSeller.click();
		//WebElement Search1 = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox']"));
		//Search1.sendKeys("Shoe");
		}

}
