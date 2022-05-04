package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test6 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement username = driver.findElement(By.name("username"));
		wait.until(ExpectedConditions.visibilityOf(username));
		driver.findElement(By.name("username")).sendKeys("xyz@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));	
		wait.until(ExpectedConditions.visibilityOf(password));
		driver.findElement(By.name("password")).sendKeys("AbC@123");		
		
		WebElement button =driver.findElement(By.xpath("//div[text()='Log In']"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		String title = driver.getTitle();
		wait.until(ExpectedConditions.titleContains(title));
	}
}
