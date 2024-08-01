package sampleLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Program1
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("E:\\selenium\\vtiger\\vtigercommondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		
		String URL= pobj.getProperty("url");
		String USERNAME=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password");
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
