package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("8900695516");
		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("8900695516#");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com"))
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
