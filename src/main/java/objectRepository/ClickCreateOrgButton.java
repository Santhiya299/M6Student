package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/*
 * This is POM class to Click Create Organization Button
 */
public class ClickCreateOrgButton
{
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createNewOrgBtn;
	
	
	public ClickCreateOrgButton (WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getCreateNewOrgBtn() 
	{
		return createNewOrgBtn;
	}
	/*
	 * This is Business Library to click Organization Button
	 */
	public void clickOrg()
	{
		createNewOrgBtn.click();
	}
	
	
}
