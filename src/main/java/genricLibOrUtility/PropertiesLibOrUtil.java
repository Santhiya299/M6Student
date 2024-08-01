package genricLibOrUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesLibOrUtil 
{
	public String getDataFromProperty(String data) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.PropertiesPath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String info=pobj.getProperty(data);
		return info;
		
		
	}
}
