package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage
{

	@FindBy(xpath= "//a[contains(text(),'Sign in')]") private WebElement signinbutton;
	


public GoogleHomepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickSigninButton()
{
	signinbutton.click();
}















}