package study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class A {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	    Thread.sleep(1000);
	   
		File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\practise\\selenium screenshots\\googleHomepage.png");
		FileHandler.copy(source, destination);
		
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination1= new File("E:\\practise\\selenium screenshots\\facebooklogin.png");
		FileHandler.copy(source1, destination1);
		
		driver.navigate().to("https://www.distractify.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(500);
		
		File source2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination2 = new File("E:\\practise\\selenium screenshots\\prx.jpg");
		FileHandler.copy(source2, destination2);
		
		driver.navigate().to("https://twitter.com/");
		driver.manage().window().fullscreen();
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str= RandomString.make(2);
		File dest= new File("E:\\practise\\selenium screenshots\\twitter" + str + ".png");
		FileHandler.copy(src, dest);
		
		
	
		
		
		 
		
		
		
		
		
		
		
		
		
	}

}
