package POM_Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtilities;

public class Demoapp_page extends WebDriverUtilities{
	
	//Declaration
	//Address of course webelement
	@FindBy(xpath ="//a[@id='course']")
	private WebElement courseWE;
	
	//Declaration
	//Address of selenium webelement
	@FindBy(xpath ="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumWE;
	
	
	//Initialization
	public Demoapp_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void courseWebElement(WebDriver driver) {
		mouseOver(driver, courseWE);
	}
	public void seleniumTrainingWebElement() {
		seleniumWE.click();
	}
	
	
	public WebElement getCourseWE() {
		return courseWE;
	}
	public void setCourseWE(WebElement courseWE) {
		this.courseWE = courseWE;
	}
	public WebElement getSeleniumWE() {
		return seleniumWE;
	}
	public void setSeleniumWE(WebElement seleniumWE) {
		this.seleniumWE = seleniumWE;
	}
	
}
