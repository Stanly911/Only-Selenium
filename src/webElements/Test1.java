package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Dashboard"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
