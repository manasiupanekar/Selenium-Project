package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.netflix.com/in/Login");
		
		NetflixLogin n=new NetflixLogin(driver);
		n.send_userlogin();
		n.send_pwd();
		n.click_signinbutton();
		

		
	}

}
