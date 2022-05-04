package handlingWebElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/category.php?category=testing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		WebElement plusbttn = driver.findElement(By.id("add"));
		Thread.sleep(3000);
		
		Actions a= new Actions(driver);
		a.doubleClick(plusbttn).perform();
	}
}
