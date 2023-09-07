package Pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_pop_up {
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
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		//wait for 3 sec
		Thread.sleep(3000);
		//driver.navigate().refresh();
		//adddress of Add to cart
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//wait for 3 sec
		Thread.sleep(3000);		
		//alert.accept();
		alert.dismiss();				
}
}
