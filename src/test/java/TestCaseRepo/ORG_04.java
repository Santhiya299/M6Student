package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchSingleData;
import genricLibOrUtility.JavaLibrary;
import objectRepository.ClickCreateOrgButton;
import objectRepository.CreatingOrgDetails;
import objectRepository.HomePage;

public class ORG_04 extends BaseClass
{
	@Test
	public void org_04() throws Exception
	{
		JavaLibrary jl = new JavaLibrary();
		int num = jl.genarateRandomNum(1000);
		FetchSingleData sd=new FetchSingleData();
		String ORGNME = sd.fetchSingleData("Organization", 14, 1);
		String WSITE = sd.fetchSingleData("Organization", 14, 2);
		String PHN = sd.fetchSingleData("Organization", 14, 3);
		String OPHN= sd.fetchSingleData("Organization", 14, 4);
		String EMAIL= sd.fetchSingleData("Organization", 14, 5);
		String BILLADD= sd.fetchSingleData("Organization", 14, 6);
		String BILLCITY= sd.fetchSingleData("Organization", 14, 7);
		String BILLSTATE= sd.fetchSingleData("Organization", 14, 8);
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOrg();
		 ClickCreateOrgButton orgBtn=new ClickCreateOrgButton(driver);
		orgBtn.clickOrg();
		CreatingOrgDetails orgfill=new CreatingOrgDetails(driver);
		orgfill.fillOrg(ORGNME+num, WSITE, PHN, OPHN, EMAIL, BILLADD, BILLCITY, BILLSTATE);
		Thread.sleep(3000);
		
	}
}
