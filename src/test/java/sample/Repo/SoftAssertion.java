package sample.Repo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion
{
	@Test
	public void strictLevel()
	{
		String actual="Maharani";
		String expected="rani";
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(actual, expected);
		System.out.println("StrictLevel passed");
		sf.assertAll();
	}
	@Test
	public void containsLevel()
	{
		String actual="Maharani";
		String expected="rani";
		SoftAssert as=new SoftAssert();
		as.assertTrue(actual.contains(expected));
		System.out.println("containsLevel passed");
		as.assertAll();
	}
}
