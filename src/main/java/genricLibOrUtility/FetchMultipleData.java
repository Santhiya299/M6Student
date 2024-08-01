package genricLibOrUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleData 
{
	public void fetchMultipleData(String sheetName,int firstRowNum,int firstCellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.excelpath);
		Workbook book =WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		for(int i=firstRowNum;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(firstRowNum);
			for(int j=firstCellNum;j<=r.getLastCellNum();i++)
			{
				String value=df.formatCellValue(r.getCell(firstCellNum));
				System.out.println(value);
			}
		}
		
	}
}