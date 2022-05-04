package handlingWETestScripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDFacebook 
{
    public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement option = driver.findElement(By.id("month"));
		Select s=new Select(option);
		s.selectByIndex(5);
		
		System.out.println("MultiSelect= "+s.isMultiple());
		
		List<WebElement> options = s.getOptions();
		ArrayList<String> Sorted=new ArrayList<String>();
		System.out.println("No of Options Present= "+options.size());
		for(WebElement alloption:options)
		{
			Sorted.add(alloption.getText());
			for( int i = Sorted.size(); i==options.size(); i++)
			{
				Object ob = Sorted.clone();
				System.out.println("Before Sorting= "+ob);
			}
		}
		Collections.sort(Sorted);
		System.out.println("After Sorting= "+Sorted);
		driver.close();
	}
}
