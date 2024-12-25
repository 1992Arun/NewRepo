package arrayo.org;

public class ArrayOfObjects extends Product {
	
	public static void main(String[] args) {
		
		
		
		ArrayOfObjects p1 = new ArrayOfObjects();
		p1.id= 2323;
		p1.name="Arun";
		ArrayOfObjects p2 = new ArrayOfObjects();
		p2.id= 9723;
		p2.name="Anand";
		ArrayOfObjects p3 = new ArrayOfObjects();
		p3.id= 8082;
		p3.name="Kevin";
		ArrayOfObjects p4 = new ArrayOfObjects();
		p4.id= 1812;
		p4.name="Avi";
		
		System.out.println(p1);
	
		ArrayOfObjects obj[] = new ArrayOfObjects[4];
		
		obj[0]= p1;
		obj[1]= p2;
		obj[2]= p3;
		obj[3]= p4;
		
		for(int i=0; i<obj.length;i++) {
			
			System.out.println(obj[i].id);
			
			
		}
		

		
	
	
	}
	
	


}


 



	 
