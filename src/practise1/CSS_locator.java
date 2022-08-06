package practise1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class CSS_locator {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshot= RandomString.make(3);
		
		File destination = new File("E:\\practise\\selenium screenshots\\photo" + screenshot + ".png");
		FileHandler.copy(source, destination);
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("mupanekar@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123");
		
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  String r= RandomString.make(2);
		  File dest= new File ("E:\\practise\\selenium screenshots\\test1\\" + r + ".png");
		  Thread.sleep(500);
		  FileHandler.copy(src, dest);
		  
		 driver.findElement(By.cssSelector("button[name=login]")).click();
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
