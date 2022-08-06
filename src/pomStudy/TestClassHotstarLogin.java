package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassHotstarLogin {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hotstar.com/in");
		
		HotstarLoginPage h= new HotstarLoginPage(driver);
		h.send_phonenumber();
		
	}

}
