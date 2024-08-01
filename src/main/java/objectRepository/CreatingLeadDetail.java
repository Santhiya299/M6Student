package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingLeadDetail 
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement  email;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement  street;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noofEmp;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement poCode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country ;
	
	@FindBy(xpath="(//input[@name='button'])[3]")
	private WebElement saveBtn;
	
	public CreatingLeadDetail(WebDriver driver)
	{
		PageFactory.initElements( driver,this);;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNoofEmp() {
		return noofEmp;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPoCode() {
		return poCode;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}
	
	public WebElement getSave()
	{
		return saveBtn;
	}
	
	public void createLeads(String fname,String lname,String comp)
	{
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		company.sendKeys(comp);
		saveBtn.click();
		
	}
	public void createLeads(String fname,String lname,String comp,String desgn,String phn,
			String mbl,String mailId,String emp,String stre,String pbox,String pcode,String cty,String sta,String cntry)
	{
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desgn);
		phone.sendKeys(phn);
		mobile.sendKeys(mbl);
		email.sendKeys(mailId);
		noofEmp.sendKeys(emp);
		street.sendKeys(stre);
		poBox.sendKeys(pbox);
		poCode.sendKeys(pcode);
		city.sendKeys(cty);
		state.sendKeys(sta);
		country.sendKeys(cntry);
		saveBtn.click();
		
	}
	public void createLeads(String fname,String lname,String comp,String desgn,String phn,String mbl,String mailId,String emp)
	{
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desgn);
		phone.sendKeys(phn);
		mobile.sendKeys(mbl);
		email.sendKeys(mailId);
		noofEmp.sendKeys(emp);
		saveBtn.click();
	}
	public void createLeads(String fname,String lname,String comp,String stre,String pbox,String pcode,String cty,String sta,String cntry)
	{
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		company.sendKeys(comp);
		street.sendKeys(stre);
		poBox.sendKeys(pbox);
		poCode.sendKeys(pcode);
		city.sendKeys(cty);
		state.sendKeys(sta);
		country.sendKeys(cntry);
		saveBtn.click();
	}
	
}
