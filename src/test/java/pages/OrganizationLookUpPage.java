package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationLookUpPage 
{
	private WebElement driver;
	
	@FindBy(xpath="//img[@title='Create Organization...']") private WebElement lookUp;
	
	public OrganizationLookUpPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLookUp() 
	{
		lookUp.click();
		return lookUp;
	}

	
}
