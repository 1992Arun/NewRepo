package org.base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ProjectObjectClass extends Project {
	
	
	ProjectObjectClass() {
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private List <WebElement> alert;
	
	public List<WebElement> getAlert() {
		return alert;
	}


	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;
	
	@FindBys({ @FindBy(xpath="//div[@class='mainTitle']")})
	private List<WebElement> netbanking; 
	
	@FindBy(name="login_page")
	private WebElement frame;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement CustomerID;
	
	@FindBy(xpath="//a[text()='CONTINUE']")
	private WebElement Continue;
	
	@FindBy(id="forgotPassword")
	private WebElement forgotPass;
	
	
	@FindBy(xpath="//a[text()='CANCEL']")
	private WebElement Cancel;


	public WebElement getLogin() {
		return login;
	}


	public List<WebElement> getNetbanking() {
		return netbanking;
	}


	public WebElement getFrame() {
		return frame;
	}


	public WebElement getCustomerID() {
		return CustomerID;
	}


	public WebElement getContinue() {
		return Continue;
	}


	public WebElement getForgotPass() {
		return forgotPass;
	}


	public WebElement getCancel() {
		return Cancel;
	}
	
	

}
