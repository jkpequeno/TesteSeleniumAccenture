package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuoteData {
	
	static String email = "teste.teste@teste.com";
	static String phone = "+5583945628741";
	static String username = "jkpequeno";
	static String password = "123456789";
	static String confirmPassword = password;
	
	static WebDriver navigator = ProductData.pressNextPro();
	
	public static void enterEmail() {

		WebElement form = navigator.findElement(By.id("email"));
		form.clear();
		form.click();
		form.sendKeys(email);

	}
	
	public static void enterphone() {

		WebElement form = navigator.findElement(By.id("phone"));
		form.clear();
		form.click();
		form.sendKeys(phone);

	}
	
	public static void enterUsername() {

		WebElement form = navigator.findElement(By.id("username"));
		form.clear();
		form.click();
		form.sendKeys(username);

	}
	
	public static void enterPassword() {

		WebElement form = navigator.findElement(By.id("password"));
		form.clear();
		form.click();
		form.sendKeys(password);

	}
	
	public static void enterConfirmPassword() {

		WebElement form = navigator.findElement(By.id("confirmpassword"));
		form.clear();
		form.click();
		form.sendKeys(confirmPassword);

	}
	
	public void pressSend() {

		WebElement button = navigator.findElement(By.id("sendemail"));
		button.click();


	}
	

}