package method.org;

public class Method {

	public  int display(int a ){	
		
		//System.out.println(a);
		
		
		return a ;
	}
	
static  int display(int a,int b ){	
		
		System.out.println(b);
		
		return a ;
	}
	
	
	public static void main(String[] args) {
		
		Method m=  new Method();
			
		m.display(1, 2);
		
		System.out.println(display(4,6));
		
		
	}
	
}
