package browserstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement login = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		login.click();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("9423336306");
		WebElement buttoncontinue = driver.findElement(By.id("continue"));
		buttoncontinue.click();		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Shopping@114");
		WebElement SignInButton = driver.findElement(By.id("signInSubmit"));
		SignInButton.click();	
		}

}
