package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class");
	}
	
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After Class");
	}
	
	
	@BeforeMethod
	private void beforeMethod() {
		
		System.out.println("Before Method");
	}
	
	@AfterMethod
	private void afterMethod() {
		
		System.out.println("after Method");
	}
	
	@Test
	private void test2() {
		
		System.out.println("Test 2");
	}
	
	
	@Test(priority =1)
	private void test3() {
		
		System.out.println("Test 3");
	}
	
	
	@Test(priority =-19)
	private void test1() {
		
		System.out.println("Test 1");
	}
	
	@Test(priority=-5)
	private void test() {
		
		System.out.println("Test ");
	}
	
	@Test(enabled=false, invocationCount=10)
	private void pass() {
		
		System.out.println("pass ");
	}
	
	@Test
	private void aass() {
		
		System.out.println("aass ");
	}

}
