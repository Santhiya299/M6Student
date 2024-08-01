package genricLibOrUtility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility 
{
	Actions act=null;
	Select s=null;
	Alert alt=null;
	/*
	 * This is method is to maximize the window
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/*
	 * This method is using for implicit Wait
	 */
	public void implicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	/*
	 * This method is used to move the cursor to the particular element 
	 */
	public void moveToAnElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/*
	 * This method is used to right to the element
	 */
	
	public void rightClickOfAnElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/*
	 * This method is used to click the Particular WebElement
	 */
	public void clickAnParticularElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.click(element).perform();
	}
	/*
	 * This method is used to perform scrolling to Particular Element
	 */
	
	public void scrollingToParticularElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/*
	 * This method is used to drag the pointer to x axis or yaxis
	 */
	
	public void  dragPointer(WebDriver driver,WebElement src,int xvalue,int yvalue)
	{
		act=new Actions(driver);
		act.dragAndDropBy(src,xvalue,yvalue).perform();
	}
	
	/*
	 * This method is used to dragging the element to the Particular Position
	 */
	public void  dragAnElementToParticularPosition(WebDriver driver,WebElement src,WebElement desc)
	{
		act=new Actions(driver);
		act.dragAndDrop(src,desc).perform();
	}
	
	/*
	 * This method is used to click and holding the Particular WebElement
	 */
	public void clickAndHoldAnParticularElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	
	/*
	 * This method is used to perform release the Particular Element
	 */
	public void releaseAnElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.release(element).perform();
	}
	
	/*
	 * This Method is used to select an option from Drop down based on index 
	 */
	public void selectAnElementByUsingIndex(WebElement element,int index)
	{
		s=new Select(element);
		s.selectByIndex(index);
	}
	
	/*
	 * This Method is used to select an option from Drop down based on attribute value
	 */
	public void selectAnElementByUsingValue(WebElement element,String attValue)
	{
		s=new Select(element);
		s.selectByValue(attValue);
	}
	
	/*
	 * This Method is used to select an option from Drop down based on VisibleText
	 */
	public void selectAnElementByUsingVisibleText(WebElement element,String visibleText)
	{
		s=new Select(element);
		s.selectByVisibleText(visibleText);
	}
	
	/*
	 * This Method is will give all options 
	 */
	public List<WebElement> getOptionsInDropDown(WebElement element)
	{
		s=new Select(element);
		List<WebElement> value=s.getOptions();
		return value;
	}
	
	/*
	 *This Method is will give all the selected options  
	 */
	public List<WebElement> getSelectedOptionsInDropDown(WebElement element)
	{
		s=new Select(element);
		List<WebElement> values=s.getAllSelectedOptions();
		return values;
	}
	
	/*
	 * This Method is used to de select an option from Drop down based on index 
	 */
	public void deselectAnElementByUsingIndex(WebElement element,int index)
	{
		s=new Select(element);
		s.deselectByIndex(index);
	}
	
	/*
	 * This Method is used to de select an option from Drop down based on Attribute value
	 */
	public void deselectAnElementByUsingValue(WebElement element,String attValue)
	{
		s=new Select(element);
		s.deselectByValue(attValue);
	}
	
	/*
	 * This Method is used to de select an option from Drop down based on Visible Text 
	 */
	public void deselectAnElementByUsingVisibleText(WebElement element,String visibleText)
	{
		s=new Select(element);
		s.deselectByVisibleText(visibleText);
	}
	
	/*
	 *This method used to de select all options 
	 */
	public void deSelectOptions(WebElement element)
	{
		s=new Select(element);
		s.deselectAll();
	}
	
	/*
	 * This method used to accept the Alert popup
	 */
	public void acceptAlert(WebDriver driver)
	{
		alt=driver.switchTo().alert();
		alt.accept();
	}
	
	/*
	 *  This method used to dismiss  the Alert popup
	 */
	public void dismissAlert(WebDriver driver)
	{
		alt=driver.switchTo().alert();
		alt.dismiss();
	}
	
	/*
	 *  This method used to send the message to the Alert popup
	 */
	public void sendKeysToAlert(WebDriver driver,String input)
	{
		alt=driver.switchTo().alert();
		alt.sendKeys(input);
	}
	
	/*
	 *  This method used to fetch message to the Alert popup
	 */
	public String getTextFromAlert(WebDriver driver)
	{
		alt=driver.switchTo().alert();
		String input=alt.getText();
		return input;
	}
	/*
	 * This method will help us to perform Javascript Operation
	 */
	
	public void scrollingOperationUsingJs(WebDriver driver,String value)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(value);
	}
	/*
	 * This Method used to capture the screenshot
	 */
	
	public void takingScreenshot(WebDriver driver,String path) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File desc=new File(path);
		Files.copy(src,desc);
	}
	/*
	 * This method used to do customize click
	 */
	public void customizeclick(WebElement element,int time) throws Exception
	{
		int count=0;
		int reclick=5;
		while(count<=reclick)
		{
			element.click();
			Thread.sleep(time);
			break;
		}
	}
	
	/*
	 * This method used to handle Frame Operation
	 */
	public void frameHandling(WebDriver driver,int value,String nameorid,WebElement frameElement)
	{
		driver.switchTo().frame(value);
		driver.switchTo().frame(nameorid);
		driver.switchTo().frame(frameElement);
	}
	/*
	 * This methos used to handle Window Popup
	 */
	public void windowHandling(WebDriver driver)
	{
		String parentId=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
		
		Iterator<String> itr = allWindow.iterator();
		while(itr.hasNext())
		{
			String values=itr.next();
			String title=driver.switchTo().window(values).getTitle();
			
			if(title.contains(values))
			{
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
