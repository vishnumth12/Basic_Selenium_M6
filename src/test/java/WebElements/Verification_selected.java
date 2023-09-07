package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_selected {

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
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//find address of radio button
		WebElement radioButton = driver.findElement(By.xpath("//label[text()='Female']"));
		
		if (radioButton.isSelected()) {//isSelected() method is not working properly due to some internal binding issue b/w selinium and java
			System.out.println("if block");
			radioButton.click();
			}
			else {
				System.out.println("else block");
			}
		}
	}
