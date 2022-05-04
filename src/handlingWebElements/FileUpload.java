package handlingWebElements;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{
	
	public static void main(String[] args) throws IOException  
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		ele.click();
		//js.executeScript("arguments[0].click();",ele);
		Runtime.getRuntime().exec("C:\\Users\\SUBHADEEP MALLICK\\Desktop\\Testbook\\QSpider\\Class\\Selenium\\AutoIT\\NakuriPopup.au4.exe");
	}
}
