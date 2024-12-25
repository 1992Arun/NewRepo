package org.base;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;

public class Project extends BaseClass {
	
	public static void main(String[] args) throws WebDriverException, IOException, InterruptedException {

		browserLaunch("chrome");

		getURL("https://www.hdfcbank.com/");

		implicitWait(10);
		
		
		
		
		
		ProjectObjectClass o = new ProjectObjectClass();
		
		  Wait(3);
		
		
		
		// alertaccept();
		
		movetoElement(o.getLogin());
		
		click(o.getNetbanking().get(0));
		
		window(2);
		
		frame(o.getFrame());
		
		click(o.getContinue());
		
		alertaccept();
		
		javascript(o.getCustomerID(), "127912");
				
		click(o.getContinue());
		
		Wait(3);
		
		defaultframe();
		
		javasClick(o.getForgotPass());
		
		takescreeshot();
		
		click(o.getCancel());
		
		
		
	}

}
