package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
//      driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
      driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();	
      
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//li[@id='p_n_feature_twenty-nine_browse-bin/81332996031']//span[@class='a-list-item']")).click();
      
	}

}
