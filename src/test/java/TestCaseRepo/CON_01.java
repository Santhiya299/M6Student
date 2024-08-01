package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchSingleData;
import genricLibOrUtility.JavaLibrary;
import objectRepository.ClickCreateOrgButton;
import objectRepository.CreatingContactDtails;
import objectRepository.CreatingOrgDetails;
import objectRepository.HomePage;
import objectRepository.clickContactButton;

public class CON_01 extends BaseClass
{
	@Test(retryAnalyzer=genricLibOrUtility.RetryAnalyzerImplementationClass.class)
	public void con_01() throws Exception
	{
		
		JavaLibrary jl = new JavaLibrary();
		int num = jl.genarateRandomNum(1000);
		FetchSingleData sd=new FetchSingleData();
		String FNAME = sd.fetchSingleData("Contacts", 2, 1);
		String LNAME = sd.fetchSingleData("Contacts", 2, 2);
		String ORGNAME = sd.fetchSingleData("Contacts", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickContact();
		clickContactButton cont = new clickContactButton(driver);
		cont.clickBtn();
		CreatingContactDtails clickcon = new CreatingContactDtails(driver);
		clickcon.fillDetails(FNAME+num, LNAME, ORGNAME);
		Thread.sleep(3000);
	}

}

