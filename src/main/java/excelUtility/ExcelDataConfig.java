package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook excelWorkBook;
	XSSFSheet excelSheet;
			
	public ExcelDataConfig(String excelDataPath)
	{		
		try {
			File excelDataFile = new File(excelDataPath);
			FileInputStream fis = new FileInputStream(excelDataFile);
			excelWorkBook = new XSSFWorkbook(fis);
			} 
		
		catch (Exception e) {
			System.out.println("exception Message:" + e.getMessage());
			}		
		
	}
		
	public String getData(String SheetName, int Row, int Col) {
		excelSheet = excelWorkBook.getSheet(SheetName);
		
		return excelSheet.getRow(Row).getCell(Col).getStringCellValue();
		
	}
	
	public XSSFSheet getSheet(String SheetName) {
		
		excelSheet =  excelWorkBook.getSheet(SheetName);
		return excelSheet;
		
	}
	
}
