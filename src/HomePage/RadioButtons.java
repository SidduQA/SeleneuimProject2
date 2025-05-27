package HomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        
        
       List<WebElement>gender= driver.findElements(By.name("sex"));
//       gender.get(0).click();
       
       int gn=gender.size();
       System.out.println(gn);
       
       
       for(WebElement gndr:gender) {
    	   
    	   System.out.println(gndr.getText());
    	   Thread.sleep(1000);
    	   gndr.click();
       }
       
       
       driver.quit();

	}

}
