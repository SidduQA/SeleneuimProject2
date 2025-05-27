package HomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        
        WebElement day=driver.findElement(By.id("day"));
        
        Select s1=new Select (day);
        
//        s1.selectByIndex(3);
        
//        s1.selectByValue("20");
        
       WebElement month= driver.findElement(By.name("birthday_month"));
        
        Select mnths=new Select(month);
        mnths.selectByVisibleText("Jun");
        System.out.println(month.getAttribute("value"));
        
        WebElement year=driver.findElement(By.id("year"));
        
        Select yr=new Select(year);
        
        yr.selectByIndex(25);
        System.out.println(year.getAttribute("value"));
        
        
//        ============= looping the drop down values ===========================
        
        
     /*   List<WebElement>dd=s1.getOptions();
        System.out.println(dd.size());
        
        for(WebElement allList:dd) {
        	System.out.println(allList.getText());
        	Thread.sleep(500);
        	allList.click();
        }
        */
        
        
        
        List<WebElement>yrs=yr.getOptions();
        System.out.println(yrs.size());
        
        for(WebElement allyears:yrs) {
        	System.out.println(allyears.getText());
        	Thread.sleep(500);
        	allyears.click();
        }
        
        
        
        
        
        
        
       
        
      
        

	}

}
