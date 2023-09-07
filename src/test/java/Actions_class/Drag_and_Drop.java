package Actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {

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
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		//wait for 3 sec
		Thread.sleep(3000);
		//fetching and storing address of Block 1 webelement and address of Block 4 webelement
		WebElement ele1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement ele2 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		//create and object for Actions class
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}

}
