package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectname
{
	public static void main(String args[])throws InterruptedException

{
	
	System.setProperty("webdriver.chrome.driver","D:\\QA testing\\seleniumC\\chromedriver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("xyz");
    driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("pqr");
    driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("xyz@gmail.com");
    driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9999999999");
    driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("def");
    WebElement jt=driver.findElement(By.xpath("//select[@name='UserTitle']"));
	Select jobtitle=new Select( jt );
	jobtitle.selectByVisibleText("Sales Manager");
    System.out.println("Sign Up Page --Title of Page is:"+driver.getTitle());
    driver.close();
    Thread.sleep(3000);
}
}