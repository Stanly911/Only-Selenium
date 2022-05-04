package handlingWebElements; 

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PUHiddenDivision 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
		
		WebElement ele1 = driver.findElement(By.xpath("(//span[@role='button'])[2]"));
		js.executeScript("arguments[0].click();",ele1);
		
		WebElement ele2 = driver.findElement(By.xpath("(//p[text()='16'])[2]"));
		System.out.println(ele2.getText());
		js.executeScript("arguments[0].click();",ele2);
	}
}
