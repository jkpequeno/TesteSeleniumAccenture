package steps;

//import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
/*import io.cucumber.java.pt.Então;
/*import objects.InsurantData;
import objects.ProductData;
import objects.SelectPriceOption;
import objects.StartInsurant;
import objects.StartProduct;
import objects.StartVehicle;
import objects.VehicleData;*/

public class TesteSeleniumSteps {

	WebDriver driver;

	
	@Dado("que estou no site tricentis") 
	public void que_estou_no_site_tricentis() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jennefer\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
	}

	/*@Dado("que estou no site tricentis")
	public void que_estou_no_site_tricentis() {

		assertEquals(driver.getCurrentUrl(), "sampleapp.tricentis.com/101/app.php");

	}

	/*@Dado("estou na aba {string}")
	public void estou_na_aba(String string) {

		assertEquals(driver.getTitle(), string);

	}

	@Dado("preencho os dados {string}")
	public void preencho_os_dados(String string) {

		if (string == "vehicle") {

			StartVehicle.start();

		} else if (string == "insurant") {

			StartInsurant.start();

		} else if (string == "product") {

			StartProduct.start();

		} else if (string == "price") {

			SelectPriceOption.SelectPrice();

		}

	}

	@Dado("clico no botão {string}")
	public void clico_no_botão(String string) {

		if (string == "vehicle") {

			VehicleData.pressNextVeh();

		} else if (string == "insurant") {

			InsurantData.pressNextIns();

		} else if (string == "product") {

			ProductData.pressNextPro();

		} else if (string == "price") {

			SelectPriceOption.pressNextSel();

		}

	}

	@Então("devo ir para a {string}")
	public void devo_ir_para_a(String string) {

		assertEquals(string, driver.getCurrentUrl());

	}
	
	@Então ("devo ver o titulo da página")
	public void teste() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}*/

}