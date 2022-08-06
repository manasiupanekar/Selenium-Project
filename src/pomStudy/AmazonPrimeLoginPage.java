package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrimeLoginPage 
{
	@FindBy(xpath="//input[@name='email']") private WebElement email;
	
	@FindBy(xpath="//input[@name='password']") private WebElement pwd;
	
	@FindBy(xpath="//input[@id='signInSubmit']") private WebElement signinbutton;
	
	
	public AmazonPrimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void sendEmail()
	{
		email.sendKeys("manasi@123");
	}
	
	public void sendPwd()

	{
		pwd.sendKeys("123");
	}
	
	public void clickSigninButton()
	{
		signinbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
