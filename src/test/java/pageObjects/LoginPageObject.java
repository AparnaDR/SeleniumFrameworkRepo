package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends BasePage{


	
	
public LoginPageObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	 xpath
	

	@FindBy(xpath="//*[@id=\"user-name\"]") 
	WebElement username;
	

	@FindBy(xpath="//*[@id=\"password\"]") 
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"login-button\"]") 
	WebElement login_button;
	
	@FindBy(xpath="//*[@id=\"login-button\"]") 
	WebElement login_button_test;
	
	@FindBy(xpath="//*[@id=\"login-button\"]") 
	WebElement login_button_test2;
	
	

// methods
	
	public void enter_username(String user) {
		username.sendKeys(user);
		
		
	}
	
	public void enter_password(String pwd) {
		password.sendKeys(pwd);
		
		
	}
	
	public void click_on_loginbutton() {
		login_button.click();
		
		
		
	}

}
