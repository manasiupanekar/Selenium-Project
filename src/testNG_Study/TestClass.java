package testNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
  @Test
  public void method1() throws InterruptedException
  
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
  }
  
  @Test
  public void method2() throws InterruptedException 
  
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
  }
  @Test
  public void method3() throws InterruptedException 
  
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
  }
  
  @Test
  public void method4() throws InterruptedException
  
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
  }
  
  
  
  
  
}
