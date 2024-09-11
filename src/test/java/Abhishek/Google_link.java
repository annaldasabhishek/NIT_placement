package Abhishek;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Google_link
{
	    public static void main(String[] args) 
		{
			  WebDriverManager.chromedriver().setup();
		      WebDriver driver =new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      driver.manage().window().maximize();
		      driver.get("https://www.google.com/");
		      driver.findElement(By.name("q")).sendKeys("selenium");
		      List<WebElement> name=driver.findElements(By.xpath("//li[@role='presentation']//parent::ul"));
		     
		        for(int i=0; i<=name.size()-1; i++)
		        {
		           System.out.println(name.get(i).getText());
		        }
		}      
	}
