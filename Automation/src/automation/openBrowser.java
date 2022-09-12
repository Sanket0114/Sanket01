package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//1.get
		driver.get("https://www.amazon.in/");
		
		//2.close current tab
		//driver.close();
		
		//3.Close all the tabs 
		//driver.quit();

	
		//4.getTitle
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		//5.getCurrentUrl
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//7.minimize
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
	}

}
