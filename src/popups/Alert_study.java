package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_study {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		

	}

}
