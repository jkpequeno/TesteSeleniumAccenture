package objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDriver {
	
	static WebDriver driver;
	
	public static WebDriver open() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jennefer\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
		return driver;
		
	}

}
