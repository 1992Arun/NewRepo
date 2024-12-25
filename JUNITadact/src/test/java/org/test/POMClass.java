package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass extends BaseClass {
	
	POMClass(){
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//td[@class='login_register']")
	private WebElement newRegister;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="re_password")
	private WebElement confirmpassword;
	
	
	public WebElement getNewRegister() {
		return newRegister;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTermsCondition() {
		return termsCondition;
	}

	public WebElement getRegister() {
		return register;
	}


	@FindBy(id="full_name")
	private WebElement fullName;
	
	
	@FindBy(id="email_add")
	private WebElement email;
	
	@FindBy(id="tnc_box")
	private WebElement termsCondition;
	
	@FindBy(id="Submit")
	private WebElement register;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
