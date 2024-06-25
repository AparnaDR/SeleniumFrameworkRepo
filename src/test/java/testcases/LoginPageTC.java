package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageObjects.BasePage;
import pageObjects.LoginPageObject;

public class LoginPageTC  extends BaseClass{

@Test
	public void login_tescase() {
		
		LoginPageObject loginPO =  new LoginPageObject(driver);
		loginPO.enter_password("standard_user");
		loginPO.enter_username("secret_sauce");
		loginPO.click_on_loginbutton();
	}


public void login_invalid_tescase() {
	
	LoginPageObject loginPO =  new LoginPageObject(driver);
	loginPO.enter_password("locked_out_user");
	loginPO.enter_username("abcd");
	loginPO.click_on_loginbutton();
}
		
	}


