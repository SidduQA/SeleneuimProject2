package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements1Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		
//		=====================Methods of the Selenium====================
		String title =driver.getTitle();
	    System.out.println("tittle is =" +title);   //get tittle of the page 
	    System.out.println(driver.getTitle());
	    
	    System.out.println("Current URL Of the Page =" +driver.getCurrentUrl()); //get url of the page 
	    
	   WebElement unm= driver.findElement(By.id("email"));
	   System.out.println(unm.getAttribute("id"));
	   
	   System.out.println(unm.getTagName());
	    
	    driver.quit();
		
	}

}
