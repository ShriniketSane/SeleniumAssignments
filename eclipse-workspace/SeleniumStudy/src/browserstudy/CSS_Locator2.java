package browserstudy;

import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

}