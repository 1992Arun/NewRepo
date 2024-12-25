package org.flip;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestReport {
	
	@Test
	public void report() {
		
		Result re = JUnitCore.runClasses(Search.class);
		
	System.out.println(re.getFailureCount());
		
	System.out.println(re.getRunTime());
	System.out.println(re.getRunCount());
	}

}
