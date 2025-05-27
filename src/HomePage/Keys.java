package HomePage;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Software/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
        
     // driver.get("https://demo.guru99.com/test/newtours/");
        Actions act=new Actions(driver);
        
    /*  driver.findElement(By.name("userName")).sendKeys("Swathi");
        
        act.click(driver.findElement(By.name("userName")))
        .keyDown(org.openqa.selenium.Keys.CONTROL)
        .sendKeys("a")
        .sendKeys("c")
        .keyUp(org.openqa.selenium.Keys.CONTROL)
        .click(driver.findElement(By.name("password")))
        .keyDown(org.openqa.selenium.Keys.CONTROL)
        .sendKeys("v")
        .keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).click();
        */
        
        driver.get("https://www.facebook.com/");
        
        driver.findElement(By.id("email")).sendKeys("KK@yopmail.com");
        act.click().keyDown(org.openqa.selenium.Keys.CONTROL)
        .sendKeys("a")
        .sendKeys("c")
        .keyUp(org.openqa.selenium.Keys.CONTROL)
        .click(driver.findElement(By.id("pass")))
        .keyDown(org.openqa.selenium.Keys.CONTROL)
        .click().sendKeys("v")
        .keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("name")).click();
        
        
        
}
}