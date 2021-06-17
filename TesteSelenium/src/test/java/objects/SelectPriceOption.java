package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPriceOption {

	static WebDriver navigator = EnterProductData.pressNextPro();

	public static void SelectPrice() {

		WebElement form = navigator.findElement(By.cssSelector("#priceTable>tfoot>tr>th.group>label:nth-child(2)>span"));
		form.click();

	}
	
	public static WebDriver pressNextSel() {

		WebElement button = navigator.findElement(By.id("nextsendquote"));
		button.click();

		return navigator;

	}

}
