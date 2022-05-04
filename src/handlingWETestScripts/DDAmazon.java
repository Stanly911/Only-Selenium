package handlingWETestScripts;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDAmazon 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		Select s= new Select(dropDown);
		s.selectByIndex(3);
		s.selectByValue("search-alias=amazon-pharmacy");
		s.selectByVisibleText("Appliances");
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		for(WebElement b:alloptions)
		{
			System.out.println(b.getText());
		}
		driver.close();
	}
}
