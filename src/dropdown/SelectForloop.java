package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectForloop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		
		 WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		 Select s= new Select(dropdown);
		 
		 for(int i= 0; i<=4; i++)
		 {Thread.sleep(100);
			 s.selectByIndex(i);
			 Thread.sleep(100);
			 
		 }

	}

}
