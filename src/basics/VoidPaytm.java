package basics;

import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VoidPaytm 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.switchTo().frame(0);
		/*driver.findElement(By.linkText("Google Play")).click();
		WebElement ele = driver.findElement(By.xpath("//a[@title='Close']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);*/
		driver.switchTo().defaultContent();
	}
}
