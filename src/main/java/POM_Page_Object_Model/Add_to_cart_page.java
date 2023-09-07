package POM_Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtilities;

public class Add_to_cart_page extends WebDriverUtilities{

	//Declaration
	//Address of add items webelement
	@FindBy(xpath ="//i[@class='fa fa-plus']")
	private static WebElement addItemsWE;
	
	//Declaration
	//Address of course webelement
	@FindBy(xpath ="//button[@class='btn btn-primary btn-lg btn-flat']")
	private WebElement addToCartWE;
	
	//Declaration
	//Address of cart icon webelement
	@FindBy(xpath ="//i[@class='fa fa-shopping-cart']")
	private WebElement cartIconWE;
	
	//Declaration
	//Address of cart webelement
	@FindBy(xpath ="//A[text()='Go to Cart']")
	private WebElement cartWE;
	
	
	//Initialization
	public Add_to_cart_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public void addItemsSign(WebDriver driver) {
		doubleClick(driver, addItemsWE);
	}
	public void addToCartButton() {
		addToCartWE.click();
	}
	public void cartIcon() {
		cartIconWE.click();
	}
	public void cart() {
		cartWE.click();
	}
	
	
	public WebElement getAddItemsWE() {
		return addItemsWE;
	}
	public void setAddItemsWE(WebElement addItemsWE) {
		this.addItemsWE = addItemsWE;
	}
	public WebElement getAddToCartWE() {
		return addToCartWE;
	}
	public void setAddToCartWE(WebElement addToCartWE) {
		this.addToCartWE = addToCartWE;
	}
}
