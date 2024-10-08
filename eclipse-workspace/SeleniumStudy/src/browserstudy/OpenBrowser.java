package browserstudy;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();//open browser
		driver.get("https://www.facebook.com");//nevagating to google.com
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
