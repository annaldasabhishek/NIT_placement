package Abhishek;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class selenium_link {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
        driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
        List<WebElement> link= driver.findElements(By.tagName("a"));
        System.out.println("number of links:"+link.size());
          for(WebElement links:link)
          {
    	     System.out.println(links.getText());
          }
	}
}
