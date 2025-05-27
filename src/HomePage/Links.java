package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		
//		WebElement  terms=driver.findElement(By.linkText("Terms"));
//		terms.click();
		
//		driver.findElement(By.partialLinkText("Te")).click();
		
//		driver.wait(10);
		
//		driver.close();//close parent window
//		driver.quit(); //close parent and child window
		
		
//		======================================XPATH==================================================
		
//		Absoulte XPATH ====>using attributes
//		Relative XPATH ====>based on possition
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sid");
		
	}

}
