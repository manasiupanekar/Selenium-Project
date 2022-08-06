package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
       driver.get("https://vctcpune.com/");
       driver.get("https://in.sugarcosmetics.com/");
       
       Thread.sleep(100);
       driver.close();
       
       driver.manage().window().minimize();
       Thread.sleep(75);
       driver.manage().window().maximize();
       
       driver.navigate().to("https://in.sugarcosmetics.com/");
       Thread.sleep(100);
       
       driver.navigate().back();
       Thread.sleep(300);
       
       driver.navigate().forward();
       Thread.sleep(300);
       
       driver.navigate().refresh();
       
       String title= driver.getTitle();
       System.out.println(title);
       
       driver.quit();
        
        
	}

}
