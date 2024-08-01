package genricLibOrUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaLibrary
{
	/**
	 * This method used to generate random numbers
	 * @param bound
	 * @return
	 */
	public int genarateRandomNum(int bound)
	{
		Random r=new Random();
		int num=r.nextInt(bound);
		return num;
	}
	/**
	 * Thisis a genric method is used to handle Calendar 
	 * @param formate
	 * @return
	 */
	public String calenderHandling(String formate)
	{
		Calendar cal = Calendar.getInstance();
		 Date d = cal.getTime();
		 SimpleDateFormat sdf = new SimpleDateFormat(formate);
		 String ff = sdf.format(d);
		 return ff;
	}
}
