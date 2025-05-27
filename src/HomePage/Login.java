package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\FirefoxDriver\\Firfox Driver\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
	
		Thread.sleep(2000);
		
		driver.close();
	}
}