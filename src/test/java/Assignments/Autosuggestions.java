package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestions {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//waits for 4 sec
		Thread.sleep(4000);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://www.google.com/");
		//fetch address of search bar and insert text
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("settings");
		//waits for 4 sec
		Thread.sleep(4000);
		//address of first auto suggest option
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']"));//prefer to use li tag //li[@data-view-type='1']" over ul tag
		
		for (WebElement webElement : autosuggestions) {
			System.out.println(webElement.getText());
		}
	}
}
