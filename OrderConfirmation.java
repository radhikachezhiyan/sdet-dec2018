package POM_FMHerndonSMJ.com.fm.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmation {

	public void OrderConfirmMessage(WebDriver driver){
		System.out.println("Implement Capture Order Confirm Message functionality here");
		String OrderConfirmationMessage = driver.findElement(By.cssSelector("h2")).getText();
		System.out.println("Here is your Confirmation message: " + OrderConfirmationMessage);
	}
}
