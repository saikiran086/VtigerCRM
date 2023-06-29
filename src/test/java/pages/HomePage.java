package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]") private WebElement orglink;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement contactLink;
	@FindBy(xpath="(//a[text()='Opportunities'])[1]") private WebElement opportunities;
	@FindBy(xpath="(//td[@class='genHeaderSmall'])[1]/following-sibling::td[1]") private WebElement administratorImg;
	@FindBy(xpath="//a[text()='Sign Out']") private WebElement signoutLink;

	public HomePage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrglink() 
	{
		orglink.click();
		return orglink;
	}

	public WebElement getContactLink() 
	{
		contactLink.click();
		return contactLink;
	}

	public WebElement getOpportunities() 
	{
		opportunities.click();
		return opportunities;
	}

	public WebElement getAdministratorImg() 
	{
		administratorImg.click();
		return administratorImg;
	}

	public WebElement getSignoutLink() 
	{
		signoutLink.click();
		return signoutLink;
	}
	
	
}
