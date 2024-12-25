package org.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	
	
	
	@Test(dataProvider="login")
	private void textA1(String user, String pass) {
		
		
		
		System.out.println(user);
		
		System.out.println(pass);
	}
	
	
	@Test
	private void textA2() {
		
		System.out.println("Test A2");
	}
	
	
	@Test
	private void textA3() {
		
		System.out.println("Test A3");
	}
	
	

	@DataProvider(name="login")
	public static String[][] data() {
		
		String[][] obj = {
				
				{"Ajith","2323"},{"Vidamuyarch","1213"}};
			
	return obj;
			
	}
	
	
	
	

}
