package org.newpackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Sample {
	
	
	public Loginpage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBys({ @FindBy(xpath="//a[@role='button']")})
	
	private List<WebElement> newAccount;
	
	@FindBys({ @FindBy(name="firstname"), @FindBy(xpath="//input[@name='firstname']") })
	private WebElement firstName;
	
	
	
	@FindAll({ @FindBy(name="lastname"), @FindBy(xpath="//input[@name='Surname']") })
	private WebElement lastName;
	
	@FindBy(id="day")
	private WebElement birthday;
	
	@FindBy(id="month")
	private WebElement month;
	
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBys( { @FindBy(xpath="//label[@class='_58mt']")} )
	private List<WebElement> gender;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobileNumber;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement newPassword;
	
	@FindBy(name="websubmit")
	private WebElement signup;


	public WebElement getSignup() {
		return signup;
	}


	public List<WebElement> getNewAccount() {
		return newAccount;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getBirthday() {
		return birthday;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public List<WebElement> getGender() {
		return gender;
	}


	public WebElement getMobileNumber() {
		return mobileNumber;
	}


	public WebElement getNewPassword() {
		return newPassword;
	}
	
	
	


	
	

}
