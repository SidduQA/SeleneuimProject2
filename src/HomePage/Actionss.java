package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        Actions act=new Actions(driver);
        
        
        WebElement email=driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("pass"));
        WebElement btn=driver.findElement(By.name("login"));
        int btnx=btn.getLocation().getX();
        int btny=btn.getLocation().getY();
        
        act.moveToElement(email).sendKeys("kk@yopmail.com").build().perform();
        act.moveToElement(password).click().sendKeys("12345").build().perform();
        act.moveToElement(btn).click().build().perform();
        
//        Thread.sleep(3000);
//        driver.quit();

        
	}

}
