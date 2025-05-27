package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		
		WebElement unm=driver.findElement(By.id("email"));
		unm.sendKeys("A1@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("test");
		
		driver.findElement(By.name("login")).click();
	

	}

}
