package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Samsung {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\JAVA\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 
	String exp = "samsung s22";
	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Samsung");
	Thread.sleep(2000);
	
	List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	for(WebElement option:allOptions)
		{
		String xyz = option.getText();
		if(xyz.equals(exp)) {
			option.click();
			break;}	
		}
	
	Thread.sleep(5000);

	driver.quit();
	

	}
}
