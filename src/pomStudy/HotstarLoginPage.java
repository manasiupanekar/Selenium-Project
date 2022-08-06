package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotstarLoginPage 
{
@FindBy(id="phoneNo") private WebElement phonenumber;

public HotstarLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}

public void send_phonenumber()
{
phonenumber.sendKeys("123");	
}
	
	
}
