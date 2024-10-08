package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Growtechminds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.xpath("//div[@id='container']"));	
		WebElement w2 = driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(w1, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w1).perform();
		
		WebElement w3 = driver.findElement(By.xpath("//div[@id='container-1']"));
		a1.dragAndDrop(w3, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w3).perform();
		
		WebElement w4 = driver.findElement(By.xpath("//div[@id='container-2']"));
		a1.dragAndDrop(w4, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w4).perform();
		
		WebElement w5 = driver.findElement(By.xpath("//div[@id='container-3']"));
		a1.dragAndDrop(w5, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w5).perform();
		
		WebElement w6 = driver.findElement(By.xpath("//div[@id='container-4']"));
		a1.dragAndDrop(w6, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w6).perform();
		
		WebElement w7 = driver.findElement(By.xpath("//div[@id='container-5']"));
		a1.dragAndDrop(w7, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w7).perform();
		
		WebElement w8 = driver.findElement(By.xpath("//div[@id='container-6']"));
		a1.dragAndDrop(w8, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w8).perform();
		
		WebElement w9 = driver.findElement(By.xpath("//div[@id='container-7']"));
		a1.dragAndDrop(w9, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w9).perform();
		
		WebElement w10 = driver.findElement(By.xpath("//div[@id='container-8']"));
		a1.dragAndDrop(w10, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w10).perform();
		
		WebElement w11 = driver.findElement(By.xpath("//div[@id='container-9']"));
		a1.dragAndDrop(w11, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w11).perform();
		
		WebElement w12 = driver.findElement(By.xpath("//div[@id='container-10']"));
		a1.dragAndDrop(w12, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w12).perform();
		
		WebElement w13 = driver.findElement(By.xpath("//div[@id='container-11']"));
		a1.dragAndDrop(w13, w2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(w2,w13).perform();
		
		a1.dragAndDrop(w1, w2).perform();
		a1.dragAndDrop(w3, w2).perform();
		a1.dragAndDrop(w4, w2).perform();
		a1.dragAndDrop(w5, w2).perform();
		a1.dragAndDrop(w6, w2).perform();
		a1.dragAndDrop(w7, w2).perform();
		a1.dragAndDrop(w8, w2).perform();
		a1.dragAndDrop(w9, w2).perform();
		a1.dragAndDrop(w10, w2).perform();
		a1.dragAndDrop(w11, w2).perform();
		a1.dragAndDrop(w12, w2).perform();
		a1.dragAndDrop(w13, w2).perform();
		
	}

}
