package Explanation_Generic_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericLibraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sample_1 {

	public static void main(String[] args) {
		
		WebDriverUtilities utilities = new WebDriverUtilities();
		WebDriverManager.chromedriver().setup();
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//Maximize the brower
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/"); 
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		utilities.dropDown(dropDown, "Baby");	
	}
}
