package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tag_Name {

	public static void main(String[] args) {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//get(); enters the url into the browser which is already open
		driver.get("https://www.facebook.com/");
		//list all the links in the web page (using findElements())
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement b: allLinks) {
		System.out.println(b.getText());	
	}
  }
}
