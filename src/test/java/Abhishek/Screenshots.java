package Abhishek;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.messages.types.Source;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Screenshots
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement logo= driver.findElement(By.xpath("//a[@aria-label='Amazon.in']"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
		
		File abhi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(abhi, new File("D:\\software\\core java\\placement\\Screenshots\\tin123.png"));	
	}
}
