package handlingWebElements;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step:1 type-casting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Step:2 access the method and store in RAM
		File ram= ts.getScreenshotAs(OutputType.FILE);
		
		//Step:3 specify the location
		File destin=new File("./photo/amazon.png");
		
		//Step:4 Copy paste from Ram to destiny location
		FileUtils.copyFile(ram, destin);
		
		driver.close();
	}
}
