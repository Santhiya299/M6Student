package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchSingleData;
import objectRepository.ClickLeadButton;
import objectRepository.CreatingLeadDetail;
import objectRepository.HomePage;

public class LE_04 extends BaseClass
{
	@Test
	public void le_04() throws Exception
	{
		FetchSingleData excelUtil = new FetchSingleData();
		 String FNAME = excelUtil.fetchSingleData("Leads", 11, 1);
		 String LNAME = excelUtil.fetchSingleData("Leads", 11, 2);
		 String CNAME = excelUtil.fetchSingleData("Leads", 11, 3);
		 String STR = excelUtil.fetchSingleData("Leads", 11, 4);
		 String POBOX = excelUtil.fetchSingleData("Leads", 11, 5);
		 String PO = excelUtil.fetchSingleData("Leads", 11, 6);
		 String CITY = excelUtil.fetchSingleData("Leads", 11, 7);
		 String ST = excelUtil.fetchSingleData("Leads", 11, 8);
		 String CNTY = excelUtil.fetchSingleData("Leads", 11, 9);
		 
		 HomePage hp =new HomePage(driver);
			hp.clickLeads();
		ClickLeadButton ld = new ClickLeadButton(driver);
			ld.clickLeadBtn();
		CreatingLeadDetail createld = new CreatingLeadDetail(driver);
		createld.createLeads(FNAME, LNAME, CNAME, STR, POBOX, PO, CITY, ST, CNTY);
			System.out.println(" LE_04 Successfull..");
			Thread.sleep(4000);
		 
	}

}
