package org.test;

import java.awt.AWTException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.pom.POM;

public class DemoRegistration extends POM {


	@BeforeClass
	public static void beforeClass() {

		browser("Chrome");
	}


	@Test
	public void demo() throws AWTException, InterruptedException {


		POM p = new POM();		

		getURL("https://demoqa.com/automation-practice-form/");

		implicitWait(10);
		
		
		jsendKeys(p.getFirstname(), "Arun");

		jsendKeys(p.getLastName(), "E");

		jsendKeys(p.getUserEmail(), "arunkumar@gmail.com");

		jClick(p.getGenderFemale());

		sendKeys(p.getMobileNumber(), "9500589712");

		jClick(p.getDateOfBirth());

		explicitWait(p.getMonth(), 10);

		selectByText(p.getMonth(), "December");

		selectByText(p.getYear(), "1992");

		clickbytext(p.getDates(), 20);

		sleep(5);
		
	//	upload(p.getUpload());
		
       jClick(p.getHobbySports());
		
			

		sendKeys(p.getCurrentAddress(), "Tindivanam");

		jClick(p.getSelectState());

		jClick(p.getStates().get(0));

		jClick(p.getSelectCity());

		jClick(p.getCity().get(0));

		
//		click(p.getSubjects());
//
//		jsendKeys(p.getSubjects(), "English");
//
//		enterKey();

		
		sleep(10);
		
		

		

		click(p.getSubmit());

	}

    @Ignore
	@Test
	
	public void rest() throws AWTException, InterruptedException {
		
		POM p = new POM();		

		getURL("https://demoqa.com/automation-practice-form");

		implicitWait(10);
		
		explicitWait(p.getSubjects(),10);
		
		
         jClick(p.getHobbyReading());
		
		jClick(p.getHobbySports());

		upload(p.getUpload());


	}


	@AfterClass 
	public static void afterClass() throws InterruptedException {

		
//		sleep(10);
//		
//		quit();
	}









}




