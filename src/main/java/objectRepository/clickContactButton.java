package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickContactButton 
{
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement clickConBtn;
	
	public clickContactButton(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getClickConBtn() {
		return clickConBtn;
	}
	
	public void clickBtn()
	{
		clickConBtn.click();
	}
}
