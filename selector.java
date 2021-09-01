package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class selector
{
	public static void main(String args[])throws InterruptedException

	{
		
		System.setProperty("webdriver.chrome.driver","D:\\QA testing\\seleniumC\\chromedriver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    WebElement login=driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
	    login.sendKeys("starts- with function");
	    WebElement mobile=driver.findElement(By.id("mobno"));
	    WebElement mobilebyc=driver.findElement(By.xpath("//input[contains(@name,'mobno')]"));
	    mobile.sendKeys("4444444444");
	    Thread.sleep(2000);
	    mobile.clear();
	    mobilebyc.sendKeys("66666666666");
	

}
}