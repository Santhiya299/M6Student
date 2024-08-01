package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchSingleData;
import genricLibOrUtility.JavaLibrary;
import objectRepository.ClickCreateOrgButton;
import objectRepository.CreatingOrgDetails;
import objectRepository.HomePage;

public class ORG_03 extends BaseClass
{
	@Test
	public void org_03() throws Exception
	{
		JavaLibrary jl = new JavaLibrary();
		int num = jl.genarateRandomNum(1000);
		FetchSingleData sd=new FetchSingleData();
		String ORGNME = sd.fetchSingleData("Organization", 10, 1);
		String WSITE = sd.fetchSingleData("Organization", 10, 2);
		String BILLADD = sd.fetchSingleData("Organization", 10, 3);
		String BILLCITY= sd.fetchSingleData("Organization", 10, 4);
		String BILLSTATE= sd.fetchSingleData("Organization", 10, 5);
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOrg();
		 ClickCreateOrgButton orgBtn=new ClickCreateOrgButton(driver);
		orgBtn.clickOrg();
		CreatingOrgDetails orgfill=new CreatingOrgDetails(driver);
		orgfill.fillOrg(ORGNME+num, WSITE, BILLADD, BILLCITY, BILLSTATE);	
	
	}
}
