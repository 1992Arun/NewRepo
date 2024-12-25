package counter.org;

public class Configuration {
	
	static String configValue;
	
	
	static {
		
		 configValue= "Default Config Value";
		 
		 System.out.println("Static block executed: configValue initialized");
	}
	
	public static void main(String[] args) {
		
		Configuration con= new Configuration();
		
		
		System.out.println("Config Value: " + configValue);
	}

}
