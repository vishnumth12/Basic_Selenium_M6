package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Enabled {

	public static void main(String[] args) {
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the url into the browser which is already open
		driver.get("https://www.facebook.com/");
		//address of email text field
		WebElement ele= driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("Mac");
		driver.findElement(By.id("pass")).sendKeys("MacPwd");
		WebElement buttonElement = driver.findElement(By.xpath("//button[@name='login']"));
		
		if (buttonElement.isEnabled()) {
			
			System.out.println("is Enabled");
			buttonElement.submit();  //you can also use click(); or submit();
			}
		else {
			System.out.println("is not Enabled");
			
			driver.close();
		}
	}
}
