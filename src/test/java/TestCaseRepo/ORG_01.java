package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchSingleData;
import genricLibOrUtility.JavaLibrary;
import objectRepository.ClickCreateOrgButton;
import objectRepository.ClickLeadButton;
import objectRepository.CreatingOrgDetails;
import objectRepository.HomePage;

public class ORG_01 extends BaseClass
{
	@Test(groups= {"sanity"})
	public void le_04() throws Exception
	{
		JavaLibrary jl = new JavaLibrary();
		int num = jl.genarateRandomNum(1000);
		FetchSingleData sd=new FetchSingleData();
		String ORGNME = sd.fetchSingleData("Organization", 2, 1);
		String WSITE = sd.fetchSingleData("Organization", 2, 2);
		String EMPS = sd.fetchSingleData("Organization", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOrg();
		 ClickCreateOrgButton orgBtn=new ClickCreateOrgButton(driver);
		orgBtn.clickOrg();
		CreatingOrgDetails orgfill=new CreatingOrgDetails(driver);
		orgfill.fillOrg(ORGNME+num, WSITE, EMPS);
		
		Thread.sleep(3000);
	}
}
