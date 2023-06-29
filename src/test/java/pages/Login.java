package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login 
{
	private WebDriver driver;
    
	@FindBy(xpath="//input[@name='user_name']") private WebElement uName;
	@FindBy(xpath="//input[@name='user_password']") private WebElement uPass;
	@FindBy(xpath="//input[@type='submit']") private WebElement loginBtn;
	
	public Login(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void getuName() 
	{
		uName.sendKeys("admin");
		
	}

	public WebElement getuPass()
	{
		uPass.sendKeys("admin");
		return uPass;
	}

	public void getLoginBtn()
    {
		loginBtn.click();
		
	}

}
