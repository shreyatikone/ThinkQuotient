package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitterurl 
{
	public static void main(String args[])throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\QA testing\\seleniumC\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseUrl = "http://www.twitter.com";
	    driver.get(baseUrl);
	    Thread.sleep(3000);
	    System.out.println("end of code");
	}
	}


