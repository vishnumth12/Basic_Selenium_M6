package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_Link_Partial_linktext {

	public static void main(String[] args) throws Throwable{
		/// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//get(); enters the url into the browser which is already open
		driver.get("https://www.facebook.com/");
		//fetching the address of email text field
		driver.findElement(By.id("email")).sendKeys("mac");
		//waits for 4 sec
		Thread.sleep(4000);
		//address of password
		driver.findElement(By.name("pass")).sendKeys("macpwd");
		//waits for 4 sec
		Thread.sleep(4000);
		//address of link using link text()
		driver.findElement(By.linkText("Forgotten password?")).click();
		//waits for 4 sec
		Thread.sleep(4000);
		//address of link using partial link text
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//address of forgot password
		driver.findElement(By.id("identify_email")).sendKeys("macintosh@mac.com");
		//waits for 4 sec
		Thread.sleep(4000);
		driver.quit();
		
	}

}
