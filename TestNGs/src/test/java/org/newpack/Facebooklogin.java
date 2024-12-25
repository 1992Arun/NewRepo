package org.newpack;


import org.data.DataProviders;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebooklogin extends BaseClass {
	
	
//	@Parameters({"userName","password"})
	@Test(dataProvider="login",dataProviderClass= DataProviders.class)
	public void login( String user, String pass) throws InterruptedException {
		
		SoftAssert s = new SoftAssert();
		
	//	System.out.println("Login");
		
		browser("Chrome");
		
		String url = getURL("https://www.facebook.com/");
		
		
		String currentURL = getCurrectURL();
		
		boolean equals = url.equals(currentURL);
		
		s.assertTrue(equals);
		
		
		Loginpage l = new Loginpage();
	
		sendKeys(l.getEmail(), user);
		
		String att = getAttribute(l.getEmail());
		
		//s.assertEquals("Inpute is incorrect", "Arun", att);
		
		sendKeys(l.getPass(), pass);
		
		String attr = getAttribute(l.getPass());
		
	//	s.assertEquals("Inpute is incorrect", "1212", attr);
		
		click(l.getLogin());
		
		String error = getCurrectURL();
		
		boolean contains = error.contains("?privacy_mutation_token");
		
		s.assertTrue(contains);
		
		
//		sleep(10);
//		
//		quit();
		
	}
	}


