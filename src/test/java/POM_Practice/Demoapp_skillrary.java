package POM_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_Page_Object_Model.Add_to_cart_page;
import POM_Page_Object_Model.Demoapp_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoapp_skillrary {

	public static void main(String[] args) {
		
		//driver related statement+
		WebDriverManager.chromedriver().setup();
		//for opening the  browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://demoapp.skillrary.com/");
		
		Demoapp_page Dp =  new Demoapp_page(driver);
		Dp.courseWebElement(driver);
		Dp.seleniumTrainingWebElement();

		Add_to_cart_page At =  new Add_to_cart_page(driver);
		At.addItemsSign(driver);
		At.addToCartButton();
		At.alterPopUpAccept(driver);
		At.cartIcon();
		At.cart() ;
	}

}
