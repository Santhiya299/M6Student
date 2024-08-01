package sample.Repo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserrtion 
{
	@Test
	public void strictLevelComparison()
	{
		String expectedValue="raja";
		String actualValue="Raja";
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("StrictLevel passed");
	}
	@Test
	public void containsLevelComparison()
	{
		String expected	="raja"	;
		String actual="Maharaja";
		Assert.assertTrue(actual.contains(expected));
		System.out.println("Contains Passed ..");
	}
}
