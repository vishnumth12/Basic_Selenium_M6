package POM_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Page_Object_Model.Fb_Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {

		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the  browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://facebook.com/");
		
		Fb_Login_Page fb_Login =  new Fb_Login_Page(driver);
		fb_Login.emailTextField("mac");
		fb_Login.passwordTextField("macin123");
		fb_Login.loginButton();

	}
}
