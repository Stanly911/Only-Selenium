package handlingWebElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PUChildBrowser 
{ 
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.amazon.in/");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		driver.quit();
	}
}
