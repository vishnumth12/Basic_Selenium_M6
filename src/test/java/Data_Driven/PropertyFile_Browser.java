package Data_Driven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import java.awt.datatransfer.StringSelection;
public class PropertyFile_Browser {

public static void main(String[] args) throws Throwable {
	
		//create an object for properties class
		Properties p = new Properties();
		
		//creating an object for physical file
		FileInputStream fis = new FileInputStream(".//src/test/resources/Data.properties");
		p.load(fis);
		
		String appURL = p.getProperty("url");
		String User = p.getProperty("username");
		String password = p.getProperty("password");
		String browser = p.getProperty("browser");
		
		WebDriver driver;
		
		if (browser.equals("chrome")) {
			// driver related statement
			WebDriverManager.chromedriver().setup();
			//for opening the Chrome browser
			driver= new ChromeDriver();
		}
		else {
			// driver related statement
			WebDriverManager.firefoxdriver().setup();
			//for opening the Chrome browser
			driver= new FirefoxDriver();
		}

		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appURL);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("User");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
	}
}
