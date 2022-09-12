package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class functions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		//driver.close();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
		
	}

}

