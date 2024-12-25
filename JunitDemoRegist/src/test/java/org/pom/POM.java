package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class POM extends BaseClass {
	
	public POM(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	private WebElement firstname;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	
	

	

	@FindBy(id="userEmail")
	private WebElement userEmail;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement genderMale;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement genderFemale;
	
	
	@FindBys({@FindBy(id="userNumber")})
	private WebElement mobileNumber;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dateOfBirth;
	

	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement year;
	
	@FindBy(id="subjectsContainer")
	private WebElement Subjects;
	
	@FindBy(xpath="(//input[@class='custom-control-input'])[4]")
	private WebElement hobbySports;
	
	
	@FindBy(id="hobbies-checkbox-2")
	private WebElement hobbyReading;
	
	@FindBys({@FindBy(xpath="//div[contains(@Class,'datepicker__day--0')]")})
	private List<WebElement> dates;
	
	
	@FindBy(id="uploadPicture")
	private WebElement upload;
	


	public WebElement getUpload() {
		return upload;
	}


	public List<WebElement> getDates() {
		return dates;
	}

	@FindBy(xpath="//label[text()='Music']")
	private WebElement hobbyMusic;
	
	@FindBy(id="currentAddress")
	private WebElement currentAddress;
	
	@FindBy(xpath="//div[text()='Select State']")
	private WebElement selectState;
	
	
	@FindBys({@FindBy(xpath="//div[contains(@id,'react-select-3-option')]")})
	private List<WebElement> States;
	
	@FindBy(xpath="//div[text()='Select City']")
	private WebElement selectCity;
	
	
	@FindBys({@FindBy(xpath="//div[contains(@id,'react-select-4-option')]")})
	private List<WebElement> City;
	
	
	@FindBy(id="submit")
	private WebElement submit;


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getUserEmail() {
		return userEmail;
	}


	public WebElement getGenderMale() {
		return genderMale;
	}


	public WebElement getGenderFemale() {
		return genderFemale;
	}


	public WebElement getMobileNumber() {
		return mobileNumber;
	}


	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getSubjects() {
		return Subjects;
	}


	public WebElement getHobbySports() {
		return hobbySports;
	}


	public WebElement getHobbyReading() {
		return hobbyReading;
	}


	public WebElement getHobbyMusic() {
		return hobbyMusic;
	}


	public WebElement getCurrentAddress() {
		return currentAddress;
	}


	public WebElement getSelectState() {
		return selectState;
	}


	public List<WebElement> getStates() {
		return States;
	}


	public WebElement getSelectCity() {
		return selectCity;
	}


	public List<WebElement> getCity() {
		return City;
	}


	public WebElement getSubmit() {
		return submit;
	}
	
	

}
