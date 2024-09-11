package Abhishek;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Bestsellers
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//inpggut[@type='text']")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
        int best= driver.findElements(By.xpath("//span[text()='Best seller']")).size();
          System.out.println(" number of best sellers:"+best);
        // driver.findElement(By.xpath("//span[@id='B01MTQ5M7B-best-seller-label']//span[@class='a-badge-text'][normalize-space()='Best seller']")).click();
	}
}
