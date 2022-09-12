package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigate {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			driver.navigate().to("https://www.facebook.com/login/");
			Thread.sleep(2000); 
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.manage().window().minimize(); 
			
			driver.get("https://www.amazon.in/");
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
	
	}


}
