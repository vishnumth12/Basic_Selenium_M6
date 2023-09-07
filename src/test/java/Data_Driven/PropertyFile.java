package Data_Driven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {

		public static void main(String[] args) throws Throwable {
			
			//create an object for properties class
			Properties p = new Properties();
			
			//creating an object for physical file
			FileInputStream fis = new FileInputStream(".//src/test/resources/Data.properties");
			p.load(fis);
			String appURL = p.getProperty("url");
			String User = p.getProperty("username");
			String password = p.getProperty("password");
			
			// driver related statement
			WebDriverManager.chromedriver().setup();
			//for opening the Chrome browser
			WebDriver driver= new ChromeDriver();
			//Maximize the browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(appURL);
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("User");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
			//driver.findElement(By.xpath("//button[@value='1']")).click();
			Thread.sleep(3000);
			driver.close();
		}
}
