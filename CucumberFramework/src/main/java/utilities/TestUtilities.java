package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.TestBase;

public class TestUtilities extends TestBase{

	
	public static int PAGE_LOAD_TIMEOUT = 60;
	public static int IMPLICIT_WAIT = 30;
	
	public static void waitForPageLoad() {

	    Wait<WebDriver> wait = new WebDriverWait(driver, 30);
	    wait.until(new Function<WebDriver, Boolean>() {
	        public Boolean apply(WebDriver driver) {
	            System.out.println("Current Window State       : "
	                + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
	            return String
	                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
	                .equals("complete");
	        }
	    });
	}
	
	// connect database
	// getdate
	//
	
	//public static XSSFRow test(XSSFSheet sheet, String colName, String textToFind){
	public ArrayList<String> getData(String colName, String textToFind) throws EncryptedDocumentException, IOException{

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File("\\src\\main\\resources\\TestData.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);
	    DataFormatter dataFormatter = new DataFormatter();
	    for (Row row: sheet) {
       		 for(Cell cell: row) {
	                     String cellValue = dataFormatter.formatCellValue(cell);
	                     if(cellValue.equalsIgnoreCase(textToFind))
	                     {
	                    	 
	                     }
	                     System.out.print(cellValue + "\t");
	                 }
	        	}
	        	//return sheet.getRow(RowNum);
	        
	    
	    //System.out.println("No any row found that contains "+textToFind);
	    return null;
	}

}
