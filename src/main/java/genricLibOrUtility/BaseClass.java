package genricLibOrUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass
{
	public static WebDriver driver=null;
	SeleniumUtility sel=new SeleniumUtility();
	PropertiesLibOrUtil prop=new PropertiesLibOrUtil();
	@BeforeSuite(alwaysRun=true)
	
	public void createDbConnection()
	{
		System.out.println("DBCONNECTION OPENED SUCCESSFULLY....");

	}
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		sel.implicitWait(driver, 10);
		sel.maximizeWindow(driver);
		String URL=prop.getDataFromProperty("url");
		driver.get(URL);
		System.out.println("BROWSER LAUNCHED SUCCESSFULLY..");
	}
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		prop=new PropertiesLibOrUtil();
		String USERNAME=prop.getDataFromProperty("username");
		String PASSWORD=prop.getDataFromProperty("password");
		lp.loginOperation(USERNAME,PASSWORD);
		System.out.println("lOGIN SUCCESSFULL");
	}
	@AfterMethod(alwaysRun=true)
	public void logoutOperation()
	{
		HomePage hp=new HomePage(driver);
		hp.clickLogout(driver);
		System.out.println("LOGOUT SUCCESSFULLY..");
		
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
		System.out.println("BROWSER SUCCESSFULLY");
	}
	@AfterSuite(alwaysRun=true)
	public void closeDbConnection()
	{
		System.out.println("DBCONNECTION CLOSED SUCCESSFULLY..");
	}
}

	






















