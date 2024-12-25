package org.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Adact extends BaseClass {
	
	
	@BeforeClass
	public static void beforeClass() {


		browser("Chrome");
		
		getURL("https://adactinhotelapp.com/");
		
	}

	
	
	@BeforeMethod
	public void before() {
		
		
	}
	
	
	
	
	@Test()
	public void test() throws InterruptedException {
		
		POMClass p = new POMClass();
		
		click(p.getNewRegister());
			
		Assert.assertTrue("registed button clicked", getCurrectURL().contains("Register.php"));
		
		jsendKeys(p.getUsername(), "1992Arun");
		
		Assert.assertEquals("username incorrect", "1992Arun", getAttribute(p.getUsername()));
		
		jsendKeys(p.getPassword(), "9862762829");
		
		Assert.assertEquals("password incorrect", "9862762829", getAttribute(p.getPassword()));
		
		jsendKeys(p.getConfirmpassword(), "9862762829");
		
		Assert.assertEquals("password incorrect", "9862762829", getAttribute(p.getConfirmpassword()));
		
		jsendKeys(p.getFullName(), "Arunkumar");
		
		Assert.assertEquals("Fullname incorrect", "Arunkumar", getAttribute(p.getFullName()));
		
		jsendKeys(p.getEmail(), "arunaak333@gmail.com");
		
		
		Assert.assertEquals("incorrect email", "arunaak333@gmail.com", getAttribute(p.getEmail()));
		
		sleep(20);
		
		jClick(p.getTermsCondition());
		
		
		Assert.assertTrue("button is not clicked", p.getTermsCondition().isSelected());
		
		jClick(p.getRegister());
			
		
	}	
		
		
		
   
	
	
	

	@AfterClass
	public static void afterClass() {


	//	 quit();
		
	}

	
	
	@AfterMethod
	public void after() {
		
		
	}
	
	
	
	
}
