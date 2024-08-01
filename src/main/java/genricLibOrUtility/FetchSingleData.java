package genricLibOrUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/*ExcelUtility*/
public class FetchSingleData
{
	public String fetchSingleData(String sheetName,int rowNum,int cellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		String value=df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
	
		
	}
}
