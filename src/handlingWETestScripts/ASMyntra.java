package handlingWETestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASMyntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		ele2.sendKeys("dres");
		
		Thread.sleep(3000);
		
		List<WebElement> ele3 = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(ele3.size());
		
		for(WebElement c:ele3)
		{
			System.out.println(c.getText());
		}
		
		driver.close();
	}
}
