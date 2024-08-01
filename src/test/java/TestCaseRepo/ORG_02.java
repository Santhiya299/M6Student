package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchSingleData;
import genricLibOrUtility.JavaLibrary;
import objectRepository.ClickCreateOrgButton;
import objectRepository.CreatingOrgDetails;
import objectRepository.HomePage;

public class ORG_02 extends BaseClass
{
	@Test(groups= {"sanity"})
	public void org_02() throws Exception
	{
		JavaLibrary jl = new JavaLibrary();
		int num = jl.genarateRandomNum(1000);
		FetchSingleData sd=new FetchSingleData();
		String ORGNME = sd.fetchSingleData("Organization", 6, 1);
		String WSITE = sd.fetchSingleData("Organization", 6, 2);
		String EMPS = sd.fetchSingleData("Organization", 6, 3);
		String PHN = sd.fetchSingleData("Organization", 6, 4);
		String OTHPHN = sd.fetchSingleData("Organization", 6, 5);
		String EMAIL = sd.fetchSingleData("Organization", 6, 6);
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOrg();
		 ClickCreateOrgButton orgBtn=new ClickCreateOrgButton(driver);
		orgBtn.clickOrg();
		CreatingOrgDetails orgfill=new CreatingOrgDetails(driver);
		orgfill.fillOrg(ORGNME+num, WSITE, EMPS, PHN, OTHPHN, EMAIL);	
		Thread.sleep(3000);
	}
}
