package Pop_Up;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_pop_up {

	public static void main(String[] args) throws Throwable {
		
		HashMap<String, Integer> contentStrings = new HashMap<>();
		HashMap<String, Object> profile = new HashMap<>();
		HashMap<String, Object> prefs = new HashMap<>();
		
		contentStrings.put("notifications", 0);
		profile.put("manage_default_content_settings", contentStrings);
		prefs.put("profile", profile);
		
		//handling notification pop up in chrome browser
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("preferences", prefs);
		
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the brower
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://www.quikr.com/");
		//wait for 3 sec
		Thread.sleep(3000);
	}
	
}
