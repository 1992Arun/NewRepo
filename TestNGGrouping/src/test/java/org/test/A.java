package org.test;

import org.testng.annotations.Test;

public class A {
	
	
	@Test(groups="Smoke")
	private void test1() {
		
		System.out.println("Smoke Test");
		
	}


	@Test(groups="Sanity")
	private void test2() {
		
		System.out.println("Sanity Test");
		
	}
	
	
	
	

	@Test(groups="Smoke")
	private void test3() {
		
		System.out.println("Smoke Test");
		
	}
	
	
	

	@Test(groups="Regression")
	private void test4() {
		
		System.out.println("Regression Test");
		
	}
	
	
	

	@Test(groups="Sanity")
	private void test5() {
		
		System.out.println("Sanity Test");
		
	}
	
	
	
	
	

	@Test(groups="Regression")
	private void test6() {
		
		System.out.println("Regression Test");
		
	}
	
	
	

	@Test
	private void test10() {
		
		System.out.println(" Test");
		
	}
	

	@Test(groups="Retest")
	private void test7() {
		
		System.out.println("Retest Test");
		
	}
	
}
