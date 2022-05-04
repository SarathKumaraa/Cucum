package cucumExample;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pages.LoginPage;



import io.cucumber.java.en.*;

public class Login extends BaseClass  {
	
	
	LoginPage lp = new LoginPage();
	
	
	@Given("The user has to be in facebook login page")
	public void the_user_has_to_be_in_facebook_login_page() {
		
		launchBrowser();
		getUrl("https://www.facebook.com/");
		waitAll();
	    
	}

	@When("The user has to fill username and password")
	public void the_user_has_to_fill_username_and_password() {
		LoginPage lp = new LoginPage();
		sendkeys(lp.getUsernameBox(), "Sarath");
		sendkeys(lp.getPasswordBox(), "12345");
	    
	}

	@When("The user should click login button")
	public void the_user_should_click_login_button() {
		LoginPage lp = new LoginPage();
		click(lp.getLoginBtn());
	    
	}

	@Then("The user navigate to invalid login page")
	public void the_user_navigate_to_invalid_login_page() {
		LoginPage lp = new LoginPage();
	Assert.assertTrue(lp.getForgetPassText().isDisplayed())	;
	
		
	    
	}
	
	
	
}
