package POM_FMHerndonSMJ.com.fm.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModifyCart {
	
	public void ModifyingCartItem(WebDriver driver){
		System.out.println("Implement ModifyingCartItem functionality here");
		driver.findElement(By.name("txtItemQty1")).clear();
	    driver.findElement(By.name("txtItemQty1")).sendKeys("3");
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[2]")).click();
        // next line is clicking on proceed to checkout
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
	}
}
