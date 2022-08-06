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

public class ScreenshotStudy {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		
		//storing into variable ts
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("E:\\practise\\selenium screenshots\\variable.png");
		FileHandler.copy(src, dest);
		
		
		//direclty taking screenshot of full page
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1= new File("E:\\practise\\selenium screenshots\\fullpage.png");
		FileHandler.copy(scr1, dest1);
		
		//multiple screenshot
		File Sr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random= RandomString.make(3);
		File det= new File("E:\\practise\\selenium screenshots\\multiple." +random+ "png");
		FileHandler.copy(Sr, det);
		
		
		//screenshot of webelement
		 WebElement srcc = driver.findElement(By.xpath("//img[@alt='Google']"));
		 File screenshot = srcc.getScreenshotAs(OutputType.FILE);
		 File desss = new File("E:\\practise\\selenium screenshots\\webelement.png");
		 FileHandler.copy(screenshot, desss);
		 
		 //screenshot webelement multiple
		WebElement pg =driver.findElement(By.xpath(("//center)[2]")));
		File s=pg.getScreenshotAs(OutputType.FILE);
		String r= RandomString.make(2)	;
		File d= new File ("E:\\practise\\selenium screenshots\\webelementmuliple" + r+ ".png");
		FileHandler.copy(s, d);
		
		 
		 
		
		
		

	}

}
