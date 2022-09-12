package automation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			
			Dimension d=  new Dimension(200,400);
			driver.manage().window().setSize(d);
			
			Point p = new Point(200, 400);
			driver.manage().window().setPosition(p);
			
			
		}
	
}
