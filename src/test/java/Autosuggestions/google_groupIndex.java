package Autosuggestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google_groupIndex {

	public static void main(String[] args) throws Throwable {
		
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://www.google.com/");
		//address of search text field
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
		//waits for 5 sec
		Thread.sleep(5000);
		//address of the 3rd autosugestion webelement
		WebElement thirdElementposition = driver.findElement(By.xpath("//li[@data-view-type='1'][3]"));
		System.out.println(thirdElementposition.getText());
		
	}

}
