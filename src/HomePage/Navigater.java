package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigater {
	
//	======================Navigation methods of web driver=============================

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver Driver= new ChromeDriver();
        
//        Driver.get("https://www.google.com/");
        
        Driver.navigate().to("https://www.google.com/");
        
        Driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);
        
        Driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Redirect Back Done");
        
        Driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println("Forward Done");
        
        Driver.navigate().refresh();
        Thread.sleep(1000);
        System.out.println("Refresh Done");
        
        Driver.quit();
	
	}

}
