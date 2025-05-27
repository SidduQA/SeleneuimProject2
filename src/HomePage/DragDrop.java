package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver_win/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
        
        driver.get("https://demoqa.com/droppable");
        Actions act=new Actions(driver);
        
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement dest=driver.findElement(By.id("droppable"));
        
        act.dragAndDrop(src, dest).perform();
        
        if(dest.getText().matches("Dropped!")) {
        	System.out.println("Sucessfully Droped");
        }
        else {
        	System.out.println("Unsucessfull");
        }

	}

}
