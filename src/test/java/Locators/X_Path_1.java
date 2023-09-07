package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path_1 {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//get(); enters the url into the browser which is already open
		driver.get("https://www.facebook.com/");
		//address of email text field using xpath attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mac");
		//address of password text field using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("MacPwd");
		//waits for 4 sec
		Thread.sleep(4000);
		//address of create page by xpath text
		//driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		//address of create page by xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'a Page')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'a Page')]")).click();
		
		//xpath by traversing and xpath by group index
		driver.findElement(By.xpath("//span[text()='        OnePlus Nord CE 3 Lite 5G (Pastel Lime, 8GB RAM, 128GB Storage)       ']/../../../../../../../../../..//span[@class='a-price-whole'])[1]")).click();
	}

}
