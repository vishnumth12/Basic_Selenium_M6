package Pop_Up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Browser_pop_up {

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
		driver.get("https://www.skillrary.com/");
		String parentString= driver.getWindowHandle();
		//wait for 3 sec
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		//shifting control to child browser window
		Set<String> childSet = driver.getWindowHandles();
		for (String c : childSet) {
			driver.switchTo().window(c);
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter name to continue']")).sendKeys("mac");
		//wait for 3 sec
		Thread.sleep(3000);
		driver.switchTo().window(parentString);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
}
}
