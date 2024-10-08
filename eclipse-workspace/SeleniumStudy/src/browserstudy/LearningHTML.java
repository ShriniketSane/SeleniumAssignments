package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\shrin\\Downloads\\learningHTML1.html");
		WebElement username = driver.findElement(By.name("username"));
		username.isEnabled();
		username.sendKeys("shriniket");
		WebElement hint = driver.findElement(By.name("say hello"));
		hint.sendKeys("first school name");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("abcd@1234");
		WebElement FirstName = driver.findElement(By.name("fname"));
		FirstName.sendKeys("Shriniket");
		WebElement IHaveABoy = driver.findElement(By.name("name1"));
		IHaveABoy.click();
		WebElement IHaveAGirl = driver.findElement(By.name("name2"));
		IHaveAGirl.click();
		WebElement IHaveABaby = driver.findElement(By.name("name3"));
		IHaveABaby.click();
		WebElement LastName = driver.findElement(By.id("121"));
		boolean b1 = LastName.isDisplayed();
		boolean b2 = LastName.isEnabled();
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
