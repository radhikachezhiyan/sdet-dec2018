package POM_FMHerndonSMJ.com.fm.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {

	public void AddItemToCar(WebDriver driver){
		System.out.println("Implement AddItemtoCart functionality here");
		driver.findElement(By.xpath("//td[3]/a/img")).click();
	
	}
}
