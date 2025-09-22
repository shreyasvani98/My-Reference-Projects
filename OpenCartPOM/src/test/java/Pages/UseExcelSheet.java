package Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UseExcelSheet 
{
	public String readFromExcel(String colName) throws IOException
	{
		String pathexcel = System.getProperty("user.dir")+"//src//test//resources//loginExcel.xlsx";
		FileInputStream fin = new FileInputStream(pathexcel);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);	
		XSSFSheet sheet1 = workbook.getSheet("LoginData");
		int rows = sheet1.getLastRowNum();
		String cellVal = null;
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row = sheet1.getRow(i);
			String cellname = row.getCell(0).getStringCellValue();
			
			if(cellname.equalsIgnoreCase(colName))
			{
				cellVal = row.getCell(1).getStringCellValue();
			}
		}
		workbook.close();
		return cellVal;		
	}
}
