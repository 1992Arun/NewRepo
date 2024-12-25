package encap.org;

import java.util.ArrayList;
import java.util.List;

public class Make {
	
	public static void main(String[] args) {
		
		
		Car m = new Car();
		
		m.setCompany_name("Honda");
		m.setMileage(20);
		m.setModel_name("i20");
		
		Car m1 = new Car();
		
		m1.setCompany_name("Suzuki");
		m1.setMileage(24);
		m1.setModel_name("Swift");
		
        Car m2 = new Car();
		
		m2.setCompany_name("BMW");
		m2.setMileage(15);
		m2.setModel_name("E23082");
		
		
		List<Car> arr= new ArrayList();
		
		arr.add(m);
		arr.add(m1);
		arr.add(m2);
		
		for(Car x:arr) {
			
			System.out.println(x.getCompany_name());
			//System.out.println(x.getMileage());
			//System.out.println(x.getModel_name());
			
		}
		
		
		
	}

}
