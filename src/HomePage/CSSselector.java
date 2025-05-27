package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	        
	        driver.get("https://www.facebook.com/r.php?entry_point=login");
	        
	        driver.findElement(By.name("firstname")).sendKeys("test");
	        
//	        using sub string 
//	        Types of mechanisms used to match sub-strings 1)Contains (*)  2)Prefix ( ^ )  3)Suffix ( $ )
	        driver.findElement(By.cssSelector("input[name='lastname'][class*='inputtext']")).sendKeys("last");//class has dynamic value it will update every time when user load the page
	         
//	        2) Prefix
	        driver.findElement(By.cssSelector("input[name^='reg_']")).sendKeys("7483424434");
	        
//	        3)Suffix
	        
	        driver.findElement(By.cssSelector("input[id$='step_input']")).sendKeys("pass");
	
	
	}

}
