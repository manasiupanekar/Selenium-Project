package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassAmazonPrime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg1wXH5gjekGxXDmZhFs0B5EhZgn_DZFXtT_EZh6RNfgvAAAAAQAAAABi5fG0cmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2F%3Fref_%253Ddvm_pds_amz_in_as_s_g_138&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=260-6959713-2830610&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		AmazonPrimeLoginPage a= new AmazonPrimeLoginPage(driver);
		a.sendEmail();
		a.sendPwd();
		a.clickSigninButton();
	}

}
