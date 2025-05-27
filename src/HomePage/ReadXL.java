package HomePage;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXL {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		
		Workbook wb=Workbook.getWorkbook(new File("C:\\Users\\hp\\OneDrive\\Documents\\Book1.xls"));
        Sheet sh=wb.getSheet("Sheet1");
        
        int rows=sh.getRows();
        int cols=sh.getColumns();
        for (int i=0; i<rows;i++) {
        	for (int j=0;j<cols;j++) {
        		System.out.println(sh.getCell(j, i).getContents()+"\t");
        	}
        	System.out.println();
        }

	}
}
