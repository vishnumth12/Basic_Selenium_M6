package POM_Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login_Page {

	//Declaration
	//Address of email textfield
	@FindBy(id="email")
	private WebElement emailTf;
	
	//Declaration
	//Address of password textfield
	@FindBy(id="pass")
	private WebElement passwordTf;
	
	//Declaration
	//Address of login button
	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginBtn;
	
	
	//Initialization
	public Fb_Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public void emailTextField(String value) {
		emailTf.sendKeys(value);
	}
	public void passwordTextField(String value) {
		passwordTf.sendKeys(value);
	}
	public void loginButton() {
		loginBtn.click();
	}


	//getter and setter method to practice
	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

		
}

