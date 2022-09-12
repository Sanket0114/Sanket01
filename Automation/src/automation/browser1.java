package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser1 {
	public class browser {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\JAVA\\\\chromedriver_win32\\\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			
			
			driver.navigate().to("https://meet.google.com/?hs=197");
			Thread.sleep(2000);
			
			driver.manage().window().minimize();
			Thread.sleep(2000);
			
			//driver.quit();

			
			
		}
		}
}
