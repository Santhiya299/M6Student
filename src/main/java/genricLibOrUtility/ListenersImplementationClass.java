package genricLibOrUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementationClass implements ITestListener
{
	SeleniumUtility sel=new SeleniumUtility();

	@Override
	public void onTestStart(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"excecution starts !!");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"exceution pass !!");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder\\"+methodName+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
//		try
//		{
//			sel.takingScreenshot(new ChromeDriver(),".\\ScreenshotFolder\\");
//		}
//		catch(Exception e){
//			
//		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{	
			String methodName = result.getMethod().getMethodName();
			Reporter.log(methodName+"execution Skipped ..");
	}

	

	
	
	
	
}
