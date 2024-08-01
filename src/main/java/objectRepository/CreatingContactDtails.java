package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingContactDtails 
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lName;
	
	@FindBy(xpath="//input[@name='account_name']")
	private WebElement orgName;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;
	
	 public CreatingContactDtails (WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getOrgName() {
		return orgName;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}

	public void fillDetails(String fnme,String lnme,String oname)
	{
		fName.sendKeys(fnme);
		lName.sendKeys(lnme);
		orgName.sendKeys(oname);
		saveBtn.click();
	}
	
	
}
