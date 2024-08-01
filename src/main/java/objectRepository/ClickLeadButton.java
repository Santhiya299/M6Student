package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickLeadButton 
{
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement leadBtn;
	
	public ClickLeadButton (WebDriver driver)
	{
		PageFactory.initElements( driver ,this);
	}

	public WebElement getLeadBtn() {
		return leadBtn;
	}
	
	public void clickLeadBtn()
	{
		leadBtn.click();
	}
}
