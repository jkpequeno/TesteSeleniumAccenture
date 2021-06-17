package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterProductData {
	
	static String startDate = "08/12/2021";
	static String insuranceSum = "10.000.000,00";
	static String meritRating = "Bonus 7";
	static String damageInsurance = "Partial Coverage";
	static String optionalProducts = "Euro Protection";
	static String courtesyCar = "Yes";
	
	static WebDriver navigator = EnterInsurantData.pressNextIns();
	
	public static void enterStartDate() {

		WebElement form = navigator.findElement(By.id("startDate"));
		form.clear();
		form.click();
		form.sendKeys(startDate);

	}
	
	public static void enterInsuranceSum() {

		String newInsuranceSum = insuranceSum;
		WebElement findInsuranceSum = navigator.findElement(By.id("insurancesum"));
		Select select = new Select(findInsuranceSum);
		select.selectByVisibleText(newInsuranceSum);

	}
	
	public static void enterMeritRating() {

		String newMeritRating = meritRating;
		WebElement findMeritRating = navigator.findElement(By.id("meritrating"));
		Select select = new Select(findMeritRating);
		select.selectByVisibleText(newMeritRating);

	}
	
	public static void enterDamageInsurance() {

		String newDamageInsurance = damageInsurance;
		WebElement findDamageInsurance = navigator.findElement(By.id("damageinsurance"));
		Select select = new Select(findDamageInsurance);
		select.selectByVisibleText(newDamageInsurance);

	}
	
	public static void enterOptionalProducts() {

		List<WebElement> findOptionalProducts = navigator.findElements(By.className("ideal-check"));

		for (WebElement element : findOptionalProducts) {
			if (element.getText() == optionalProducts) {
				element.click();
			}
		}

	}
	
	public static void enterCourtesyCar() {

		String newCourtesyCar = courtesyCar;
		WebElement findCourtesyCar = navigator.findElement(By.id("courtesycar"));
		Select select = new Select(findCourtesyCar);
		select.selectByVisibleText(newCourtesyCar);

	}
	
	public static WebDriver pressNextPro() {

		WebElement button = navigator.findElement(By.id("nextselectpriceoption"));
		button.click();

		return navigator;

	}

}
