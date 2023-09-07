package Drop_Downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_Select {
	
		public static void main(String[] args) throws Throwable {
			// driver related statement
			WebDriverManager.firefoxdriver().setup();
			//for opening the firefox browser
			WebDriver driver= new FirefoxDriver();
			//Maximize the browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//get(); enters the google search url into the browser which is already open
			driver.get("https://demoapp.skillrary.com/");
			//wait for 3 sec
			Thread.sleep(3000);
			WebElement dropDown = driver.findElement(By.id("cars"));
			Select s = new Select(dropDown);
			s.selectByIndex(0);
			//wait for 3 sec
			Thread.sleep(3000);
			s.selectByValue("199");
			//wait for 3 sec
			Thread.sleep(3000);
			s.selectByVisibleText("INR 300 - INR 399 ( 1 )");
			//wait for 3 sec
			Thread.sleep(3000);
//			s.deselectByIndex(0);
//			s.deselectByValue("199");
//			s.deselectByVisibleText("INR 300 - INR 399 ( 1 )");

			System.out.println(s.isMultiple());
			List<WebElement> Options = s.getAllSelectedOptions();
			for (WebElement e : Options) {
				System.out.println(e.getText());
				System.out.println(e.getSize());
				//driver.close();
			}
		
		}

}
