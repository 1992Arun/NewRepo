package org.newpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {


	@BeforeClass
	public void beforeClass() {


		System.out.println("Before class");

	}


	@BeforeMethod

	private void beforeMethod() {

		System.out.println("Before method");
      
		
		
	}
	
	
	@Test()
	private void testMethod() {
		
		System.out.println("first test method");
		
	}

	
	@Test()
	public void testMethod1() {
		
		System.out.println("second test method");
		
	}



	@AfterMethod

	private void afterMethod() {

		System.out.println("Before method");
       

	}


	@AfterClass
	private void afterClass() {

		System.out.println("after class");
	}

}
