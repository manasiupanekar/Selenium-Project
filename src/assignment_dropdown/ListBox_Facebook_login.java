package assignment_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Facebook_login {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Manasi");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("Upanekar");
		
	    driver.findElement(By.name("reg_email__")).sendKeys("8888888888");
	     
	    driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
	    
	    
	     WebElement day = driver.findElement(By.name("birthday_day"));
	     Select s = new Select(day);
	     Thread.sleep(500);
	     
	     s.selectByValue("1");
	     Thread.sleep(500);
	     
	     WebElement month = driver.findElement(By.name("birthday_month"));
	     Select S1 = new Select(month);
	     Thread.sleep(500);
	     
	     S1.selectByVisibleText("Jan");
	     Thread.sleep(500);

	     WebElement year = driver.findElement(By.name("birthday_year"));
	     Select S2 = new Select(year);
	     Thread.sleep(500);
	     
	     S2.selectByVisibleText("2000");
	     Thread.sleep(500);
	     
	     driver.findElement(By.xpath("//input[@value='1']")).click();
	     Thread.sleep(100);
	     
	     driver.findElement(By.name("websubmit")).click();
	     Thread.sleep(100);
	     
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    
		
		
		
		
	}

}
