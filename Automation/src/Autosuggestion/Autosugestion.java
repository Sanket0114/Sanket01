package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\JAVA\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String exp = "realme 9 pro";
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Realme");
		
		Thread.sleep(2000);
	
		List<WebElement> options = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		for(WebElement option:options)
		{
			String act = option.getText();
			if(act.equals(exp)) {
				option.click();
				break;
			}
			
		}
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	

}
