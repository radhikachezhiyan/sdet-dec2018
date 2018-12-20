package POM_FMHerndonSMJ.com.fm.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	
	public void SearchItem(WebDriver driver, String ItemToSearch){
		
		System.out.println("Implement search functionality here");
		driver.findElement(By.name("txtSearch")).clear();
		driver.findElement(By.name("txtSearch")).sendKeys(ItemToSearch);
		driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
		System.out.println("Executed SearchCatalog Functionality successfully");
	}
}
