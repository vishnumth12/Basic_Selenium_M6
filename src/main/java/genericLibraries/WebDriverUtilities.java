package genericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

		//1.generic method for mouseover
		public void mouseOver(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		}
		//2.generic method for rightclick
		public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		}
		//3.generic method for mouseover
		public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
		}
		//4.generic method for rightclick
		public void dragandDrop(WebDriver driver, WebElement ele1, WebElement ele2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
		}
		//5.generic method foe dropdown
		public void dropDown(WebElement ele, String value) {
			Select s= new Select(ele);
			s.selectByVisibleText(value);
		}	
		//6.generic method to handle a frame
		public void frame(WebDriver driver, String ele) {
			driver.switchTo().frame(ele);
		}
		//7.generic method to shift control back to normal page
		public void frame(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		//8.generic method for implicit wait
		public void implicitWaitMethod(WebDriver driver, int time){
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);		
		}
		//9.generic method for frames
		public void alterPopUpAccept(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		//10.generic method for frames
		public void alterPopUpDismiss(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}
		//11.generic method for frames
		public void parentWindow(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		//12.generic method for frames
		public void childWindow(WebDriver driver) {
			driver.getWindowHandles();
		}
	}

