package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchSingleData;
import objectRepository.ClickLeadButton;
import objectRepository.CreatingLeadDetail;
import objectRepository.HomePage;

public class LE_03 extends BaseClass
{
	@Test(groups= {"regression"})
	public void le_03() throws Exception
	{
		FetchSingleData excelUtil = new FetchSingleData();
		 String FNAME = excelUtil.fetchSingleData("Leads", 8, 1);
		 String LNAME = excelUtil.fetchSingleData("Leads", 8, 2);
		 String CNAME = excelUtil.fetchSingleData("Leads", 8, 3);
		 String PAME = excelUtil.fetchSingleData("Leads", 8, 4);
		 String TITLENAME = excelUtil.fetchSingleData("Leads", 8, 5);
		 String PHONAME = excelUtil.fetchSingleData("Leads", 8, 6);
		 String EMAIL = excelUtil.fetchSingleData("Leads", 8, 7);
		 String NOOFEMP = excelUtil.fetchSingleData("Leads", 5, 8);
		 
		 HomePage hp =new HomePage(driver);
			hp.clickLeads();
		ClickLeadButton ld = new ClickLeadButton(driver);
			ld.clickLeadBtn();
		CreatingLeadDetail createld = new CreatingLeadDetail(driver);
			createld.createLeads(FNAME, LNAME, PAME, TITLENAME, PHONAME, PHONAME, EMAIL, NOOFEMP);
			System.out.println(" LE_03 Successfull..");

		 
	}
}
