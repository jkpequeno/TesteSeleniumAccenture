package steps;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import objects.EnterInsurantData;
import objects.EnterProductData;
import objects.EnterVehicleData;
import objects.InsurantData;
import objects.OpenDriver;
import objects.ProductData;
import objects.SelectPriceOption;
import objects.VehicleData;

public class TesteSeleniumSteps {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		driver = OpenDriver.open();

	}

	@Dado("que estou no site tricentis")
	public void que_estou_no_site_tricentis() {

		assertEquals(driver.getCurrentUrl(), "http://sampleapp.tricentis.com/101/app.php");

	}

	@Dado("estou na aba {string}")
	public void estou_na_aba(String string) {

		assertEquals(driver.getTitle(), string);

	}

	@Dado("preencho os dados {string}")
	public void preencho_os_dados(String string) {

		switch (string) {
		case "vehicle":
			VehicleData.start();
		case "insurant":
			InsurantData.start();
		case "product":
			ProductData.start();
		case "price":
			SelectPriceOption.SelectPrice();
		}

	}

	@Dado("clico no botão {string}")
	public void clico_no_botão(String string) {
		
		switch (string) {
		case "vehicle":
			EnterVehicleData.pressNextVeh();
		case "insurant":
			EnterInsurantData.pressNextIns();
		case "product":
			EnterProductData.pressNextPro();
		case "price":
			SelectPriceOption.pressNextSel();
		}

	}

	@Então("devo ir para a {string}")
	public void devo_ir_para_a(String string) {
		
		assertEquals(string, driver.getCurrentUrl());
		
	}

}
