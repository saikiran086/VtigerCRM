package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationPage 
{
	private WebElement driver;
	
	@FindBy(xpath="//input[@name='accountname']") private WebElement orgNameTxt;
	@FindBy(xpath="//select[@name='industry']") private WebElement industryDPDWN;
	@FindBy(xpath="(//input[@value='  Save  '])[1]") private WebElement saveBtn;

	public CreateOrganizationPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgNameTxt() 
	{
		orgNameTxt.sendKeys("accenture");
		return orgNameTxt;
	}

	public WebElement getIndustryDPDWN() 
	{
		Select s=new Select(industryDPDWN);
		s.selectByValue("Chemicals");
		return industryDPDWN;
	}

	public void getSaveBtn() 
	{
		saveBtn.click();
	}
	
	
}
