package javaprogram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class chrome {
public static void main(String [] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver","D://seleniumC//chromedriver//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com/");
}
}


