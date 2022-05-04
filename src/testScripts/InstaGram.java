package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstaGram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("stanlymallick@outlook.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Srmmallick@1");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Login • Instagram"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.close();
	}
}
