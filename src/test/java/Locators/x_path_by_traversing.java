//package Locators;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class x_path_by_traversing {
//
//		public class xpath_Traversing {public static void main(String[] args) {
//			
//			
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung phone");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		WebElement value =
//		driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M13 (Aqua Green, 4GB, 64GB Storage)')]/../../../../../..//span[@class='a-price-whole']"));
//		System.out.println(value.getText());
//		//p[text()='6E 5218']/../../../..//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterSmViewPrice'] 
//		}
//
//	}
//
//}
