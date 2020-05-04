package GenericFunctions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static String readExcel(String sheetName, int rownum, int colnum) throws IOException {
		
		//Specifying path
		File src = new File("C:\\IntelliJ\\WorkSpace\\MultiJourney\\Test8V8D.xlsx");
		//Making tunnel for this file in byte format
		FileInputStream fis = new FileInputStream(src);
		//Loading excel sheet
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//Specifying Sheet of excel file
		XSSFSheet sheet1=wb.getSheet(sheetName);
		//Specifying Row and column
		String x=sheet1.getRow(rownum).getCell(colnum).getStringCellValue();
		//Closing Excel Sheet
		wb.close();
		//Using or Returning the value
		return x;
		
	}//Closing method readExcel
	
//	--------------------------------------------------------------------------------------------------
	
	public static String readExcelCell(String sheetName, String cell) {

		PropertyConfigurator.configure("log4j.properties");
		//Getting ROW and COLUMN from Cell
		
		int row = Integer.parseInt(cell.substring(1, cell.length()));
		int col = cell.charAt(0);

		try
		{
			File testdata = new File("C:\\IntelliJ\\WorkSpace\\MultiJourney\\Test8V8D.xlsx");
			FileInputStream fis = new FileInputStream(testdata);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			String data = sh.getRow(row-1).getCell(col-65).getStringCellValue();
			wb.close();
			return data;
		}
		catch (Exception e) 
		{
			return e.getMessage();
		}
		
	}//Closing method readExcelCell
	
//	--------------------------------------------------------------------------------------------------
	
	public static void writeExcelCell(String sheetName, String cell, String value) {
		
		PropertyConfigurator.configure("log4j.properties");		
		//Getting ROW and COLUMN from Cell
		int row = cell.charAt(1);
		int col = cell.charAt(0);
 
		try 
		{
//			File testdata = new File("D:\\NV00481641\\ATT\\Automation - Copy\\ADEPT_ProdSanityTest_1.0\\Book1.xlsx");
			File testdata = new File("H:\\Workspace\\Workspace\\Book1.xlsx");
			FileInputStream fis = new FileInputStream(testdata); 
			XSSFWorkbook wb = new XSSFWorkbook(fis); 
			XSSFSheet sh = wb.getSheet(sheetName);
			sh.getRow(row-49).getCell(col-65).setCellValue(value);
			FileOutputStream fout = new FileOutputStream(testdata);
			wb.write(fout);
			wb.close();
		}
		catch (Exception e) 
		{
//			return e.getMessage();
		}
		
		
	}//Closing writeExcelCell method
	
}//Closing Class
