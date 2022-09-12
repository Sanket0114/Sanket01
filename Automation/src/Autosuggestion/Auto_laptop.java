package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_laptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\JAVA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String a = "dell laptop price";
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Dell");
		Thread.sleep(2000);
		
		List<WebElement> var = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		for(WebElement dl :var){
		String act = dl.getText();
		if(act.equals(a)) {
			dl.click();
			break;
		}
		}
		
		Thread.sleep(2000);
		driver.quit();
		}
	
	
}
