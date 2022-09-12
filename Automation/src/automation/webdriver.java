package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//6.maximize
		driver.manage().window().maximize();
		
		//8.navigate(get url)
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		// 9.forward
		driver.navigate().forward();
		
		//10.back
		driver.navigate().back();
		
		//11.refresh
		driver.navigate().refresh();
		
		//12.setSize
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		
		//13.setPosition
		Point p = new Point(200,400);
		driver.manage().window().setPosition(p);
		
		

		}
}
