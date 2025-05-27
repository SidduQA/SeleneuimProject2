package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        WebElement img =driver.findElement(By.xpath(("//*[@id=\"content\"]/div/div/div/div[1]/div/img")));
        
        System.out.println(img.isDisplayed());
        
        System.out.println(img.isEnabled());
        
        System.out.println(img.isSelected());
        
//        driver.quit();
        
        
        WebElement unm=driver.findElement(By.id("email"));
        unm.sendKeys("Welcome");
        Thread.sleep(2000);
        unm.clear();
        
        Thread.sleep(1000);
        unm.sendKeys("WelCome Back");
        
        
	}

}
