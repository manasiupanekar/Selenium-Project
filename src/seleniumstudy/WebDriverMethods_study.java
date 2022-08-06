package seleniumstudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class WebDriverMethods_study {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.nobroker.in/");
		Thread.sleep(500);
	     
		 File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destination = new File("E:\\practise\\selenium screenshots\\nobroker.png");
		 FileHandler.copy(source, destination);
		 
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(100);
	      
	      File source1 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      String random =  RandomString.make(3);
	      File destination1= new File("E:\\practise\\selenium screenshots\\Youtube" +random+ ".png");
	      FileHandler.copy(source1, destination1);
	      
	driver.navigate().back();
	Thread.sleep(3000);
	        
          File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          String s= RandomString.make(2);
          File dest= new File("E:\\practise\\selenium screenshots\\xyz" + s+ ".png");
          FileHandler.copy(src, dest);
          
          String ss= driver.getTitle();
          System.out.println(ss);
          
          driver.navigate().forward();
          Thread.sleep(3000);
          
          
         File sc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         String sss= RandomString.make(4);
         File f= new File("E:\\practise\\selenium screenshots\\fgh" + sss+ ".png");
         FileHandler.copy(sc, f);
         
         
         
         
         
         
          
          
          
          	
          
	      
	      
	      
	      
	     
		 
		
	}

}
