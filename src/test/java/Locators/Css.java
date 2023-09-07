package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css {

	public static void main(String[] args) {
				// driver related statement
				WebDriverManager.chromedriver().setup();
				//for opening the Chrome browser
				WebDriver driver= new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//get(); enters the url into the browser which is already open
				driver.get("https://www.facebook.com/");
				//fetching web element address using css
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mac");

	}

}

