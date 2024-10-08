package browserstudy;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Tiltle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
