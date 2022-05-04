package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlassDoor 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.glassdoor.co.in/profile/login_input.htm?userOriginHook=HEADER_SIGNIN_LINK");
		driver.findElement(By.id("inlineUserEmail")).sendKeys("subho6114890@gmail.com");
		driver.findElement(By.id("inlineUserPassword")).sendKeys("8900695516#");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Log In | Glassdoor.co.in"))
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
