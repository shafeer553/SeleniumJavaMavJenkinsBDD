

package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSample {
	
	  
	public static void main(String[] args){
		
		try {
			File srcExcel = new File("C:\\MAINTENANCE\\LOGS\\DT_GEMA_Details.xlsx");
			FileInputStream fis = new FileInputStream(srcExcel);
			XSSFWorkbook excelWorkBook = new XSSFWorkbook(fis);
			XSSFSheet excelSheet = excelWorkBook.getSheet("Global");
			
			int rowCnt = excelSheet.getLastRowNum();
			
			for(int i=1;i<=rowCnt;i++) {
				String firstCellData = excelSheet.getRow(i).getCell(0).getStringCellValue();
				String secondCellData = excelSheet.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(firstCellData +"," +secondCellData );
			}
			excelWorkBook.close();
			
		} catch (Exception e) {
			System.out.println("exception name:" + e.getMessage());
		}
		
		
    

}
	
	
}

