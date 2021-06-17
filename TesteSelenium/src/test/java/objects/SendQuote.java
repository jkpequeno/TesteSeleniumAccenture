package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuote {
	
	WebDriver navigator = EnterProductData.pressNextPro();
	
	public void enterEmail() {

		WebElement form = navigator.findElement(By.id("email"));
		form.clear();
		form.click();
		form.sendKeys(SendQuoteData.email);

	}
	
	public void enterphone() {

		WebElement form = navigator.findElement(By.id("phone"));
		form.clear();
		form.click();
		form.sendKeys(SendQuoteData.phone);

	}
	
	public void enterUsername() {

		WebElement form = navigator.findElement(By.id("username"));
		form.clear();
		form.click();
		form.sendKeys(SendQuoteData.username);

	}
	
	public void enterPassword() {

		WebElement form = navigator.findElement(By.id("password"));
		form.clear();
		form.click();
		form.sendKeys(SendQuoteData.password);

	}
	
	public void enterConfirmPassword() {

		WebElement form = navigator.findElement(By.id("confirmpassword"));
		form.clear();
		form.click();
		form.sendKeys(SendQuoteData.confirmPassword);

	}
	
	public void pressSend() {

		WebElement button = navigator.findElement(By.id("sendemail"));
		button.click();


	}
	

}
