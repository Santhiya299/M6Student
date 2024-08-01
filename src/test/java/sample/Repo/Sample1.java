package sample.Repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;

import genricLibOrUtility.BaseClass;

@Listeners(genricLibOrUtility.ListenersImplementationClass.class)
public class Sample1 extends BaseClass
{
	public void loginOperationCrossCheck()
	{
		driver.findElement(By.xpath("swkdpokfcfol")).click();
	}
}
