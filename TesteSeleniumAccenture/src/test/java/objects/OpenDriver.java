package objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDriver {
	
	static WebDriver navigator;
	
	public static WebDriver open() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jennefer\\Desktop\\chromedriver.exe");
		navigator = new ChromeDriver();
		navigator.manage().window().maximize();
		navigator.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navigator.get("http://sampleapp.tricentis.com/101/app.php");
		
		
		return navigator;
		
	}

}