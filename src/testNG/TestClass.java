package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
  @Test
  public void method1() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }
  @Test
  public void method2() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }
  @Test
  public void method3() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.netflix.com/in/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }
  
  
}
