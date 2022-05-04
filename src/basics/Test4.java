package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/ ");
		 
		 Thread.sleep(3000);
		 driver.navigate().to("https://www.youtube.com/");
		 
		 Thread.sleep(3000);
		 driver.navigate().back();
		 
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 
		 driver.close();
	}
}
