package Datadrivenfw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldatainsert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileInputStream fis = new FileInputStream("C:\\Users\\Ram\\eclipse-workspace\\Levelup\\Excel\\Seleniunxl.xlsx");
     XSSFWorkbook wbo = new XSSFWorkbook(fis);
     XSSFSheet wso = wbo.getSheet("Sheet1");
     
     Row r; 
     Row p;
     Row a;
     Row j;
     r = wso.createRow(0);
     p = wso.createRow(1);
     a = wso.createRow(2);
     j = wso.createRow(3);

     r.createCell(0).setCellValue("Rajesh");
     p.createCell(0).setCellValue("Nikesh");
     a.createCell(0).setCellValue("Himanth");
     j.createCell(0).setCellValue("P.Rajesh");

     FileOutputStream fos =new FileOutputStream("C:\\Users\\Ram\\eclipse-workspace\\Levelup\\Excel\\Seleniunxl.xlsx");
	wbo.write(fos);
	System.out.println("the data has captured");
	
	}

}
