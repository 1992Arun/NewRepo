package org.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;


public class Result {

	
	 @Test
	    public void result() {
	    	
		 
		 org.junit.runner.Result r = JUnitCore.runClasses(Adact.class);
	    
	    	System.out.println("Failure Count"+r.getFailureCount());
	    	
	    	System.out.println("Run Count"+r.getRunCount());
	    	
	    	System.out.println("Run Count"+r.getIgnoreCount());
	    	
	    	List<Failure> failures = r.getFailures();
	    	
	    	for(Failure x:failures) {
	    		
	    		System.out.println("Desciption: "+x.getDescription());
	    		System.out.println("Message : "+x.getMessage());	    		
	    		System.out.println("Exception :"+x.getException());
	    	}
	    }
	
}
