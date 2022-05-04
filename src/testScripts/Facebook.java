package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("subhramallickkundu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tukumallick");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
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
