package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingOrgDetails 
{
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement website;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement emp;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phn;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherPhn;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement bAdd;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement bCity;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement bState;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;
	
	public CreatingOrgDetails (WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmp() {
		return emp;
	}

	public WebElement getPhn() {
		return phn;
	}


	public WebElement getOtherPhn() {
		return otherPhn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getbAdd() {
		return bAdd;
	}

	public WebElement getbCity() {
		return bCity;
	}

	public WebElement getbState() {
		return bState;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void  fillOrg(String organi,String wsite,String empl)
	{
		orgName.sendKeys(organi);
		website.sendKeys(wsite);
		emp.sendKeys(empl);
		saveBtn.click();
	}
	public void  fillOrg(String organi,String wsite,String empl,String phon,String ophone,String mailId)
	{
		orgName.sendKeys(organi);
		website.sendKeys(wsite);
		emp.sendKeys(empl);
		phn.sendKeys(phon);
		otherPhn.sendKeys(ophone);
		email.sendKeys(mailId);
		saveBtn.click();
	}
	
	public void  fillOrg(String organi,String wsite,String billAdd,String billCity,String billsta)
	{
		orgName.sendKeys(organi);
		website.sendKeys(wsite);
		bAdd.sendKeys(billAdd);
		bCity.sendKeys(billCity);
		bState.sendKeys(billsta);
		saveBtn.click();
	}
	
	public void  fillOrg(String organi,String wsite,String phon,String ophone,String mailId,String billAdd,String billCity,String billsta)
	{
		orgName.sendKeys(organi);
		website.sendKeys(wsite);
		phn.sendKeys(phon);
		otherPhn.sendKeys(ophone);
		email.sendKeys(mailId);
		bAdd.sendKeys(billAdd);
		bCity.sendKeys(billCity);
		bState.sendKeys(billsta);
		saveBtn.click();
	}
	
	
}
