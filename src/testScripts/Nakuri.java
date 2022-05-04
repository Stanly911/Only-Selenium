package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nakuri 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.id("usernameField")).sendKeys("subho6114890@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("8900695516#");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com"))
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
