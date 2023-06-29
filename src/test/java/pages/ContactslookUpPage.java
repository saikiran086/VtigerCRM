package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactslookUpPage 
{
	private WebElement driver;
	
	@FindBy(xpath="//img[@title='Create Contact...']") private WebElement contactLookUp;
	
	public ContactslookUpPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactLookUp() 
	{
		contactLookUp.click();
		return contactLookUp;
	}
	
}
