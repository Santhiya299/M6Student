package sampleLib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genricLibOrUtility.IConstantUtility;

public class FetchSinglDataFromExcel 
{
	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream fis=new FileInputStream("E:\\selenium\\ExcelData\\ExcelProgram.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sample");
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(sh.getRow(2).getCell(2));
		System.out.println(value);
	}
}
