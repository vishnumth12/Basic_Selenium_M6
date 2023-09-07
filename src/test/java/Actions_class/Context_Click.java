package Actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Context_Click {

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
		driver.get("https://www.amazon.in/");
		//wait for 3 sec
		Thread.sleep(3000);
		//address of amazon search textfield
		WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//create and object for Actions class
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		//wait for 3 sec
		Thread.sleep(3000);
		//right click on search textfield
		a.contextClick(ele).perform();
	}

}
