package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='inputtext _55r1 _6luy'])[1]")
	private WebElement usernameBox;
	
	@FindBy(xpath = "//input[@class='inputtext _55r1 _6luy _9npi']")
	private WebElement passwordBox;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[2]/div[2]")
	private WebElement forgetPassText;
	
	public WebElement getForgetPassText() {
		return forgetPassText;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUsernameBox() {
		return usernameBox;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}
}

