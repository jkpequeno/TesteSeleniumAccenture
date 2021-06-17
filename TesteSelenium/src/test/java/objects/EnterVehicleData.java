package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData {
	
	static String dateOfManufacture = "06/16/2021";
	static String numberOfSeats = "5";
	static String numberOfSeatsDrive = "2";
	static String make = "Toyota";
	static String model = "Scooter";
	static String rightHandDrive = "Yes";
	static String fuelType = "Electric Power";
	static String cylinderCapacity = "101.05";
	static String enginePerformance = "25.4";
	static String payload = "400.25";
	static String totalWeight = "25000.5";
	static String listPrice = "12450.00";
	static String annualMileage = "138.58";
	static String licensePlateNumber = "6546546";
	
	static WebDriver navigator;

	static String setup() {

		navigator = OpenDriver.open();
		
		return navigator.getTitle();

	}

	static void enterMake() {

		String newMake = make;
		WebElement findMake = navigator.findElement(By.id("make"));
		Select select = new Select(findMake);
		select.selectByVisibleText(newMake);

	}

	static void enterModel() {

		String newModel = model;
		WebElement findModel = navigator.findElement(By.id("model"));
		Select select = new Select(findModel);
		select.selectByVisibleText(newModel);

	}

	static void enterCylinderCapacity() {

		WebElement form = navigator.findElement(By.id("cylindercapacity"));
		form.clear();
		form.click();
		form.sendKeys(cylinderCapacity);

	}

	static void enterEnginePerformance() {

		WebElement form = navigator.findElement(By.id("engineperformance"));
		form.clear();
		form.click();
		form.sendKeys(enginePerformance);

	}

	static void enterDateOfManufacture() {

		WebElement form = navigator.findElement(By.id("dateofmanufacture"));
		form.clear();
		form.click();
		form.sendKeys(dateOfManufacture);

	}
	
	static void enterNumberOfSeats() {

		String newNumberOfSeats = numberOfSeats;
		WebElement findSeats = navigator.findElement(By.id("numberofseats"));
		Select select = new Select(findSeats);
		select.selectByVisibleText(newNumberOfSeats);

	}
	
	static void enterRightHandDrive() {
		
		String select = "righthanddrive" + rightHandDrive;
		WebElement findRightHandDrive = navigator.findElement(By.id(select));
		findRightHandDrive.getText();
		
	}

	static void enterNumberOfSeatsDrive() {

		String newNumberOfSeatsDrive = numberOfSeatsDrive;
		WebElement findSeatsDrive = navigator.findElement(By.id("numberofseatsmotorcycle"));
		Select select = new Select(findSeatsDrive);
		select.selectByVisibleText(newNumberOfSeatsDrive);

	}
	
	static void enterFuelType() {

		String newFuelType = fuelType;
		WebElement findFuelType = navigator.findElement(By.id("fuel"));
		Select select = new Select(findFuelType);
		select.selectByVisibleText(newFuelType);

	}
	
	static void enterPayload() {

		WebElement form = navigator.findElement(By.id("payload"));
		form.clear();
		form.click();
		form.sendKeys(payload);

	}
	
	static void enterTotalWeight() {

		WebElement form = navigator.findElement(By.id("totalweight"));
		form.clear();
		form.click();
		form.sendKeys(totalWeight);

	}
	
	static void enterListPrice() {

		WebElement form = navigator.findElement(By.id("listprice"));
		form.clear();
		form.click();
		form.sendKeys(listPrice);

	}
	
	static void enterLicensePlateNumber() {

		WebElement form = navigator.findElement(By.id("licenseplatenumber"));
		form.clear();
		form.click();
		form.sendKeys(licensePlateNumber);

	}
	
	static void enterAnnualMileage() {

		WebElement form = navigator.findElement(By.id("annualmileage"));
		form.clear();
		form.click();
		form.sendKeys(annualMileage);

	}
	
	public static WebDriver pressNextVeh() {

		WebElement button = navigator.findElement(By.id("nextenterinsurantdata"));
		button.click();
		
		return navigator;

	}

}
