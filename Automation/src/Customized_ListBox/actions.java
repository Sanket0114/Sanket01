package Customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\JAVA\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000); 
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(4000);
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Actions act = new Actions(driver);
	act.click(year).perform();
	
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(3000);
	driver.quit();

}

}
