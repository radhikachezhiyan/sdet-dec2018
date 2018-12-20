package POM_FMHerndonSMJ.com.fm.pageobjectmodel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverScript {
	
	WebDriver driver;
	String ItemToSearch = "Echo";
	
	@BeforeTest
	public void setUp(){
		System.out.println("Browser gets prepared here and will navigate to the AUT");
		
		String AUT = "http://sdettraining.com/online/";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(AUT);
	}

	@Test
	public void tc_End2EndShoppingCartTest(){
		System.out.println("Step 1: Search Class/Page Object will get called");
		Search sp = new Search();
		sp.SearchItem(driver, ItemToSearch);
		
		AddToCart ac = new AddToCart();
		ac.AddItemToCar(driver);
		
		ModifyCart mc = new ModifyCart();
		mc.ModifyingCartItem(driver);
		
		CheckOut co = new CheckOut();
		co.CheckOutCart(driver);
		
		OrderConfirmation oc = new OrderConfirmation();
		oc.OrderConfirmMessage(driver);
		
		System.out.println("Step 2: AddToCart Class/Page Object will get called");
		System.out.println("Step 3: ModifyCart Class/Page Object will get called");
		System.out.println("Step 4: CheckOut Class/Page Object will get called");
		System.out.println("Step 5: OrderConfirmation Class/Page Object will get called");
		System.out.println("Step 6: Verify that order has been placed code will get executed");
	}
	
	@AfterTest
	public void tearDown(){
		System.out.println("Browser will get closed");
		//driver.quit();
	}
}
