package org.newpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;

public class Sample extends BaseClass {
	
	
	
	public static void main(String[] args) throws WebDriverException, IOException, InterruptedException {
		
		browserLaunch("Chrome");
		
		implicitWait(20);
		  
		
		getURL("https://www.facebook.com/");
		
		Loginpage l = new Loginpage();
	
		
		click(l.getNewAccount().get(1));
		
		sendKeys(l.getFirstName(),"Arun");
		
		sendKeys(l.getLastName(),"Kumar");
		
			
		select(l.getBirthday(), "11");
		
		select(l.getMonth(), "Nov");
		
		select(l.getYear(), "2022");
		
		click(l.getGender().get(1));
		
		
		sendKeys(l.getMobileNumber(), "9500323212");
		
		
		sendKeys(l.getNewPassword(), "weuowe03809");
		
		  		
		
	}

	

}
