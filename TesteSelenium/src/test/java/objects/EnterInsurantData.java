package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantData {
	
	static String firstName = "Jennefer";
	static String lastName = "Pequeno";
	static String dateOfBirth = "11/13/1992";
	static String gender = "Female";
	static String streetAdress = "Rua Qualquer";
	static String country = "Brasil";
	static String zipCode = "58000000";
	static String city = "João Pessoa";
	static String occupation = "Employee";
	static String hobbie = "Bungee Jumping";


	static WebDriver navigator = EnterVehicleData.pressNextVeh();

	public static void enterFirstName() {

		WebElement form = navigator.findElement(By.id("firstname"));
		form.clear();
		form.click();
		form.sendKeys(firstName);

	}

	public static void enterLastName() {

		WebElement form = navigator.findElement(By.id("lastName"));
		form.clear();
		form.click();
		form.sendKeys(lastName);

	}

	public static void enterDateOfBirth() {

		WebElement form = navigator.findElement(By.id("birthdate"));
		form.clear();
		form.click();
		form.sendKeys(dateOfBirth);

	}

	public static void enterGender() {

		List<WebElement> findGender = navigator.findElements(By.className("ideal-radio"));

		for (WebElement element : findGender) {
			if (element.getText() == gender) {
				element.click();
			}
		}

	}

	public static void enterStreetAdress() {

		WebElement form = navigator.findElement(By.id("streetadress"));
		form.clear();
		form.click();
		form.sendKeys(streetAdress);

	}

	public static void enterCountry() {

		String newCountry = country;
		WebElement findCountry = navigator.findElement(By.id("country"));
		Select select = new Select(findCountry);
		select.selectByVisibleText(newCountry);

	}

	public static void enterZipCode() {

		WebElement form = navigator.findElement(By.id("zipcode"));
		form.clear();
		form.click();
		form.sendKeys(zipCode);

	}

	public static void enterCity() {

		WebElement form = navigator.findElement(By.id("city"));
		form.clear();
		form.click();
		form.sendKeys(city);

	}

	public static void enterOccupation() {

		String newOccupation = occupation;
		WebElement findOccupation = navigator.findElement(By.id("occupation"));
		Select select = new Select(findOccupation);
		select.selectByVisibleText(newOccupation);

	}

	public static void enterHobbies() {

		List<WebElement> findHobbies = navigator.findElements(By.className("ideal-check"));

		for (WebElement element : findHobbies) {
			if (element.getText() == hobbie) {
				element.click();
			}
		}

	}

	public static WebDriver pressNextIns() {

		WebElement button = navigator.findElement(By.id("nextenterproductdata"));
		button.click();

		return navigator;

	}

}
