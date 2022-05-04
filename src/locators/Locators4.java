package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();
	}
}
