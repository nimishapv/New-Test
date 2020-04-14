package myPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
	
	XSSFSheet sh;
	
	public A() throws IOException {
		FileInputStream f= new FileInputStream("C:\\Users\\Lumi\\Desktop\\Book3.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");
	}

	public double readData(int i, int j) {
		Row r= sh.getRow(i);
		Cell c= r.getCell(j); //Import Cell of apache poi not Table
	double a=c.getNumericCellValue(); //Read integer data and return it as double
		return a;
	}


}
