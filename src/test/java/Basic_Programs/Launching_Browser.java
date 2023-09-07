package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {

	public static void main(String[] args) throws Throwable {
		
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//get(); enters the url into the browser which is already open
		driver.get("https://www.facebook.com/");
		//get the title of the web page
		System.out.println(driver.getTitle());
		//printing the current url
		System.out.println(driver.getCurrentUrl());
		//waits for 4 sec
	    Thread.sleep(4000);
		//enter the url into the browser and navigating from one website to another
		driver.navigate().to("https://www.amazon.in/");
		//waits for 4 sec
	    Thread.sleep(4000);
		//navigation to back page
		driver.navigate().back();
		//waits for 4 sec
	    Thread.sleep(4000);
		//navigation to front page
	    driver.navigate().forward();
	    //refresh page
	    driver.navigate().refresh();
	    //waits for 4 sec
	    Thread.sleep(4000);
	    //closes browser window
		driver.close();
	}
}
