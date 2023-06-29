package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrginationInformationPage 
{
	private WebElement driver;
	
	@FindBy(xpath="//span[@class='dvHeaderText']") private WebElement orgInfotxt;
	
	public OrginationInformationPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String getOrgInfotxt() 
	{
		String headding=orgInfotxt.getText();
		return headding;
	}

}
