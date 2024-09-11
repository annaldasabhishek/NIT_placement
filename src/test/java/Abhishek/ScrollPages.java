package Abhishek;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPages 
{

	public static void main(String[] args)
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
      WebElement ele=driver.findElement(By.xpath("//span[text()='No cost EMI up to 24 months | Starting ₹4,433 INR/month*']"));
	  ((Locatable)ele).getCoordinates().inViewPort();
	  String projectpath = System.getProperty("user.dir");
	  
	  Actions act = new Actions(driver);
	  act.scrollToElement(ele);
	 List< WebElement> abhishek = driver.findElements(By.xpath("//span[text()='No cost EMI up to 24 months | Starting ₹4,433 INR/month*']/../../..//li"));
	  System.out.println("number of itemss:"+abhishek.size());

	}

}
