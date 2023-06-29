package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInformatriomPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='lastname']") private WebElement conLastNameTxt;
	@FindBy(xpath="(//img[@align='absmiddle'])[1]") private WebElement conOrgNametxt;
	@FindBy(xpath="(//input[@type='submit'])[1]") private WebElement conSaveBtn;

	public ContactsInformatriomPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getConLastNameTxt() {
		return conLastNameTxt;
	}

	public WebElement getConOrgName() {
		return conOrgNametxt;
	}

	public WebElement getConSave() {
		return conSaveBtn;
	}
	
	
}
