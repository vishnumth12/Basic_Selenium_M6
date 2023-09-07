package Autosuggestions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {

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
		//wait for 4 sec
		Thread.sleep(4000);
		//address of the list
		List<WebElement> allListsElements= driver.findElements(By.xpath("//li[@data-view-type='1']"));
		
		for (WebElement webElement : allListsElements) {
			System.out.println(webElement.getText());
		}
	}
}
