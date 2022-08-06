package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetflixLogin 
{

	@FindBy(name="userLoginId") private WebElement userlogin;
	@FindBy(id="id_password") private WebElement pwd;
	@FindBy(xpath="//button[contains(text(),'Sign In')]") private WebElement signinbutton;
	
	public NetflixLogin (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void send_userlogin()
	{
		userlogin.sendKeys("manasi@gmail.com");
	}
	
	public void send_pwd()
	{
		pwd.sendKeys("123");
	}
	public void click_signinbutton()
	{
		signinbutton.click();
	}
	
}
