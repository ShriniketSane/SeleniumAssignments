package browserstudy;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public void TC1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}

}
