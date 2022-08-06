package prx;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class B {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.bookmyshow.com");
        Thread.sleep(500);
        
       File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File destination = new File("E:\\practise\\selenium screenshots\\bookmyshow.png");
       FileHandler.copy(source, destination);
       
       
       driver.navigate().to("http://www.nobroker.in/");
       Thread.sleep(500);
       File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File destination1 = new File("E:\\practise\\selenium screenshots\\nobroker.png");
       FileHandler.copy(source1, destination1);
       
        
        
             
	}

}
