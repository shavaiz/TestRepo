package Tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\Users\\ShahvaizSafdar\\Desktop\\Selenium\\UserAccount.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		//HSSFWorkbook wb= new HSSFWorkbook(fis);
		
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
	
	System.out.println("Data from excel is " +data0);
	
		
	}

}
