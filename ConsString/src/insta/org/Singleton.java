package insta.org;

public class Singleton {
	
	private static Singleton singleInstance  = null;
	
	private Singleton() {
		
		System.out.println("instance has been created");
		
		
	}

    public static Singleton getInstance() {
    	
    	
    	
    	if(singleInstance == null) {
    		
    		singleInstance = new Singleton();
    		
    	}
    	
    	
    	
		return singleInstance;
    	
    	
    	
    }
	
	 public static void main(String[] args) {
		
		 
		 Singleton instance1 = Singleton.getInstance();
		 
		 Singleton instance2 = Singleton.getInstance();
		 
		 
	}

 
}


