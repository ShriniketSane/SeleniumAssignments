package browserstudy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonGetLinks {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		int countoflinks=list.size();
		System.out.println(countoflinks);
		//int countofnull=0;
		//String empty="";
		for(int i=0; i<countoflinks;i++) {
			WebElement href_url=list.get(i);
			String link_url=href_url.getAttribute("href");
			System.out.println(link_url);
			verify_the_links(link_url);
	}
	}
	static void verify_the_links(String link_url) throws IOException
	{
		try
		{
		URL u1=new URL(link_url);
		HttpURLConnection u2=		(HttpURLConnection) u1.openConnection();
				u2.connect();
		if(u2.getResponseCode()==200)
		{
			System.out.println("My Link is valid");
		}
		else
		{
			System.out.println("My link is not valid");
		}
		}
		catch(NullPointerException a1)
		{
			
		}
		catch(MalformedURLException a2)
		{
			
		}
		catch(ScriptTimeoutException a3)
		{
		
		}

	}

}
