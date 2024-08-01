package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement leads;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement org;
	
	@FindBy(xpath="(//a[text()='Contacts'])[1]")
	private WebElement contact;
	
	@FindBy(xpath="(//span[text()=' Administrator']/../following-sibling::td[@class=\"small\"]/img)[1]")
	private WebElement adminpic;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logout;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getAdminpic() {
		return adminpic;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public void clickLeads()
	{
		leads.click();
	}
	
	public void clickOrg()
	{
		org.click();
	}
	
	public void clickContact()
	{
		contact.click();
	}
	
	public void clickLogout(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(adminpic).perform();
		logout.click();
	}
	
}
