package TestCaseRepo;

import org.testng.annotations.Test;

import genricLibOrUtility.BaseClass;
import genricLibOrUtility.FetchSingleData;
import genricLibOrUtility.WriteDataFromExcel;
import objectRepository.ClickLeadButton;
import objectRepository.CreatingLeadDetail;
import objectRepository.HomePage;

public class LE_01 extends BaseClass
{
	@Test(groups={"regression"})
	public void le01Tc() throws Exception 
	{
		
		FetchSingleData excelutil = new FetchSingleData();
		 String FNAME = excelutil.fetchSingleData("Leads", 2, 0);
		 String LNAME = excelutil.fetchSingleData("Leads", 2, 1);
		 String CNAME = excelutil.fetchSingleData("Leads", 2, 2);
		 
		HomePage hp =new HomePage(driver);
		hp.clickLeads();
		ClickLeadButton ld = new ClickLeadButton(driver);
		ld.clickLeadBtn();
		CreatingLeadDetail createld = new CreatingLeadDetail(driver);
		createld.createLeads(FNAME, LNAME, CNAME);
		System.out.println("Successfull..");
		Thread.sleep(3000);
	}
}
