package Pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_division_pop_up {
	
	public static void main(String[] args) throws Throwable {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the brower
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://redbus.in/");
		//we have to handle the pop up here but here we are not doing because we have not given any delay
		//address of date webelement
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		//setTimeout(function() {debugger;}, 3000); use inside the console to freeze screen
		//address of date
		WebElement date = driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='26']"));
		System.out.println(date.getText());
		date.click();	
}
}
