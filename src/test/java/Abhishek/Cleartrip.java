package Abhishek;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Cleartrip {

    public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@placeholder='Where from?'])")).sendKeys("BLR");
		driver.findElement(By.xpath("//inpuet[@placeholder=\"Where to?\"]")).sendKeys("HYD");
		
 
	}

}
