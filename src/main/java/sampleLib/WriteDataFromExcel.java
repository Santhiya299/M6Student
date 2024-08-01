package sampleLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genricLibOrUtility.IConstantUtility;

public class WriteDataFromExcel 
{
	public static void main(String[] args) throws Exception
	{
	FileInputStream fis = new FileInputStream(IConstantUtility.excelpath)	;
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sample");
	sh.createRow(9).createCell(1).setCellValue("PapuKutty");
	
	FileOutputStream fos=new FileOutputStream(IConstantUtility.excelpath);
	book.write(fos);
	System.out.println("Pass");
	
	}
}
