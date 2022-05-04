package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("subhramallickkundu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tukumallick");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText(null));
	}
}
