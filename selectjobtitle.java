package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class selectjobtitle
{
	public static void main(String args[])throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\QA testing\\seleniumC\\chromedriver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
	    driver.manage().window().maximize();
		//Select jobtitle=new Select(driver.findElement(By.xpath("//select[@name='UserTitle']")));
			WebElement jt=driver.findElement(By.xpath("//select[@name='UserTitle']"));
			Select jobtitle=new Select( jt );
			//jobtitle.selectByVisibleText("Sales Manager");
			//jobtitle.selectByValue("Customer_Service_Manager_AP");
			jobtitle.selectByIndex(3);
			
			driver.findElement(By.name("CompanyName")).sendKeys("C o m    p a   n y ");
			Thread.sleep(3000);
			driver.close();
			System.out.println("end of code");
}
}