package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlerts2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	       
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        
        driver.get("https://demoqa.com/alerts");
        
//        driver.findElement(By.id("alertButton")).click();
        WebElement btn=driver.findElement(By.id("confirmButton"));
        System.out.println(btn.getText());
        btn.click();
        
        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        
        
	}

}
