package practise1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class LocatorsStudy1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
//		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest= new File("E:\\practise\\selenium screenshots\\photo1.png");
//		FileHandler.copy(Src, dest);
		
//		//id attribute
//		WebElement searchbox = driver.findElement(By.id("search_query_top"));
//		searchbox.sendKeys("Tshirts");
//		
//		//name attribute
//		driver.findElement(By.name("submit_search")).click();
//	
//		
//		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String random= RandomString.make(2);
//		File dest1= new File("E:\\practise\\selenium screenshots\\photo1" + random + ".png");
//		FileHandler.copy(src1, dest1);
		
//		//link text attribute
//		 driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		 
//		File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String randm= RandomString.make(3);
//		File dt= new File("E:\\practise\\selenium screenshots\\Photo" + randm + ".jpg");
//		FileHandler.copy(sr, dt);
//		
//		//partial link attribute
//		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
//		
//		 File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 String r= RandomString.make(4);
//		 File d= new File("E:\\practise\\selenium screenshots\\test1" + r + ".png");
//		 FileHandler.copy(s, d);
		 
//		 int slider= driver.findElements(By.className("homeslider-container")).size();
//		 System.out.println(slider);
		 
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String random= RandomString.make(2);
//		File dest= new File("E:\\practise\\selenium screenshots\\photo"+random+".png");
//		FileHandler.copy(src, dest);
//		
		
		
		
		
		
		
		 
		 

		
		
		
		
		
		
		
		
		

	}

}
