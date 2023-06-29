package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInformationPage 
{
	private WebElement driver;
	
    @FindBy(xpath="//span[@class='dvHeaderText']") private WebElement conInfoTxt;
    
    public ContactsInformationPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String getConInfoTxt() 
	{
		String conHeadder = conInfoTxt.getText();
		return conHeadder;
	} 
    
}
