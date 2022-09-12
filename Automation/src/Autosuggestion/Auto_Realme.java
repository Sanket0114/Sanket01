package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Realme {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\JAVA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String exc = "realme c11";
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");
		Thread.sleep(2000);
		
		List<WebElement> abc = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		for(WebElement opt:abc)
		{
			String xy = opt.getText();
			if(xy.equals(exc)) {
				opt.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
