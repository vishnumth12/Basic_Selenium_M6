package Drop_Downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_Drop_Downs_with_Amazon {
	
		public static void main(String[] args) throws Throwable {
			// driver related statement
			WebDriverManager.chromedriver().setup();
			//for opening the Chrome browser
			WebDriver driver= new ChromeDriver();
			//Maximize the browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//get(); enters the google search url into the browser which is already open
			driver.get("http://www.amazon.in/");
			//wait for 3 sec
			Thread.sleep(3000);
			//address of dropdown
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			//create object for select class
			Select s = new Select(dropdown);
			s.selectByIndex(4);
			//wait for 3 sec
			Thread.sleep(3000);
			s.selectByValue("search-alias=baby");
			//wait for 3 sec
			Thread.sleep(3000);			
			s.selectByVisibleText("Electronics");
			//checking the type of dropdown
			System.out.println(s.isMultiple());
			List<WebElement> allOptions = s.getOptions();
			System.out.println(allOptions.size());
			for (WebElement webElement : allOptions) {
				System.out.println(webElement.getText());
			}
	}

}
