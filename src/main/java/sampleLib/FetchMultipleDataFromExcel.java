package sampleLib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("E:\\selenium\\ExcelData\\ExcelProgram.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("MultiData");
		DataFormatter df = new DataFormatter();
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			Row r = sh.getRow(i);
		
			for(int j=1;j<=r.getLastCellNum();j++)
			{
				String value=df.formatCellValue(r.getCell(j));
				System.out.println(value);
			}
		}
		
	}
}
