package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchMultipleData;
import genricLibOrUtility.FetchSingleData;
import objectRepository.ClickLeadButton;
import objectRepository.CreatingLeadDetail;
import objectRepository.HomePage;

public class LE_02 extends BaseClass
{
	@Test(groups= {"smoke"})
	public void le_02() throws Exception
	{
		FetchSingleData excelUtil = new FetchSingleData();
		 String FNAME = excelUtil.fetchSingleData("Leads", 5, 1);
		 String LNAME = excelUtil.fetchSingleData("Leads", 5, 2);
		 String CNAME = excelUtil.fetchSingleData("Leads", 5, 3);
		 String PAME = excelUtil.fetchSingleData("Leads", 5, 4);
		 String TITLENAME = excelUtil.fetchSingleData("Leads", 5, 5);
		 String PHONAME = excelUtil.fetchSingleData("Leads", 5, 6);
		 String EMAIL = excelUtil.fetchSingleData("Leads", 5, 7);
		 String NOOFEMP = excelUtil.fetchSingleData("Leads", 5, 8);
		 String STREET = excelUtil.fetchSingleData("Leads", 5, 9);
		 String POBOX= excelUtil.fetchSingleData("Leads", 5, 10);
		 String POCODE= excelUtil.fetchSingleData("Leads", 5, 11);
		 String CITY = excelUtil.fetchSingleData("Leads", 5, 12);
		 String COUNTRY = excelUtil.fetchSingleData("Leads", 5, 13);
		 String STATE = excelUtil.fetchSingleData("Leads", 5, 14);
		
		 HomePage hp =new HomePage(driver);
			hp.clickLeads();
		ClickLeadButton ld = new ClickLeadButton(driver);
			ld.clickLeadBtn();
		CreatingLeadDetail createld = new CreatingLeadDetail(driver);
			createld.createLeads(FNAME, LNAME, PAME, TITLENAME, PHONAME, PHONAME, EMAIL, NOOFEMP, STREET, POBOX, POCODE, CITY, STATE, COUNTRY);
			System.out.println(" LE_02 Successfull..");
	}
}
