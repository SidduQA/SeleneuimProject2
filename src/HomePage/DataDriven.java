package HomePage;

import java.io.File;
import java.io.IOException;

import javax.swing.text.BadLocationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public static void main(String[] args) throws BadLocationException, IOException, InterruptedException, BiffException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement unm=driver.findElement(By.id("email"));
		WebElement pwd=driver.findElement(By.id("pass"));
		Workbook wb=Workbook.getWorkbook(new File("C:\\Users\\hp\\OneDrive\\Documents\\Book1.xls"));
        Sheet sh=wb.getSheet("Sheet1");

		
        	
        
         for (int i=1;i<sh.getRows();i++) {
        	
        	unm.sendKeys(sh.getCell(0, i).getContents());
        	pwd.sendKeys(sh.getCell(1, i).getContents());
        	
        	Thread.sleep(2000);
        	
        	unm.clear();
        	pwd.clear();
        }
        


	}

}
