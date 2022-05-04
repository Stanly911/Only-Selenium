package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VoidIDK 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(3000);
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
		driver1.findElement(By.cssSelector("input[id='pass']")).sendKeys("admin");
		Thread.sleep(3000);
		driver1.findElement(By.cssSelector("button[name='login']")).click();
	}
}
