package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
       
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        
        driver.get("https://ksrtc.in/");
        driver.findElement(By.id("submitSearch")).click();
        
        String txt =driver.switchTo().alert().getText();
        
        System.out.println(txt);
        
        if(txt.contentEquals("Please select start place.")){
        	System.out.println("Correct alert appeared............");
        	driver.switchTo().alert().accept();
        }
        else {
        	System.out.println("invalid alert appeared............");
        }
       

	}

}
