package org.test;

import org.testng.annotations.Test;


public class Facebookregistration extends Loginpage {
	
	
	

	
	@Test(dataProvider ="Registration", dataProviderClass= ReadData.class, priority =1)
	public void test(String first, String last, String date, String month, String year, String gender, String mobile) throws InterruptedException{
	
		
		
		browser("Chrome");
		
		String url = getURL("https://www.facebook.com/");
	
	


	Loginpage l = new Loginpage();


	jClick(l.getNewAccount().get(1));
	

	
	sendKeys(l.getFirstName(),first);
	

	sendKeys(l.getLastName(),last);


	selectByText(l.getBirthday(), date);
	

	selectByIndex(l.getMonth(), month);
	

	selectByText(l.getYear(), year);
	

	
	click(l.getGender().get(1));
	

	sendKeys(l.getMobileNumber(), mobile);
	

	
	sendKeys(l.getNewPassword(), "weuowe03809");
	

	
	click(l.getSignUp().get(0));
	
	sleep(5);
	
	quit();
	

	}
	
	
	

}
