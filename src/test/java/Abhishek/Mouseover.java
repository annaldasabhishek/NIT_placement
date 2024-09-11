package Abhishek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover {

	public static void main(String[] args) 
	{
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    WebElement link =driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
	 
	    Actions abh = new Actions(driver);
	     abh.moveToElement(link).build().perform();
	     driver.findElement(By.xpath("//a[@class='jBYtJt'][normalize-space()='Bedsheets']")).click();
	     
	     
	    
	    
	}

}
