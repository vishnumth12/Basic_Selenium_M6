package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_Login_Page_by_xpath {

	public static void main(String[] args) {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//get(); enters the gmail login url into the browser which is already open
		driver.get("https://www.google.com/gmail/about/");
		//click on sign in button 
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//address of email text field by xpath attribute
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("Mac");
		//click on next button
		driver.findElement(By.xpath("//span[text()='Next'][1]")).click();
		//address of password text field by xpath attribute
		driver.findElement(By.xpath("//div[@class='OabDMe cXrdqd Y2Zypf']")).sendKeys("MacPwd");
		//click on next button
		//driver.findElement(By.xpath("//span[text()='Next'])")).click();	
		
	}
	
	
}
