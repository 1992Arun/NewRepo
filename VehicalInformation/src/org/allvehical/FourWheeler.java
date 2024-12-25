package org.allvehical;

import org.india.India;

public class FourWheeler extends India  {
	
	public void car() {
		
		System.out.println("Suziki");
		
	}
	
	public void lorry() {
		
		System.out.println("Layland");
	}

	
	public void bus() {
		
		System.out.println("Volvo");
	}
	
	public static void main(String [] arges) {
		
		FourWheeler F = new FourWheeler();
		
		F.car();
		
		ThreeWheeler T1 = new ThreeWheeler();
		
		T1.auto();
				
		
				
		
	}
}
