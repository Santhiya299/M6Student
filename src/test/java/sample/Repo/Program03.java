package sample.Repo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Program03 
{
	//@Ignore 
	@Test
	public void createUser()
	{
		System.out.println("cu");
	}
	
	@Test(dependsOnMethods= {"createUser"}) //-->if you are giving @Ignore after that  we are using this dependsOnMethods w'll get TesNGException
	public void modifyUser()
	{
		System.out.println("mu");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("du");
	}
}
