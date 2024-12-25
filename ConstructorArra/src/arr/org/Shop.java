package arr.org;

public class Shop {
	
	private String shopName;
	private String[] items;
	
	public Shop(String shopName, String[] items) {
		
		this.shopName=shopName;
		this.items=items;
		
		
	}
	
	public void sales() {
		
		System.out.println("Shop Name: "+shopName);
		
		System.out.println("Items: ");
		
		for(String item: items) {
			
			System.out.println(item);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String[] it = {"Tomoto", "Onion", "Brinjal"};
		
		Shop s = new Shop("Vegies", it);
		
		s.sales();
		
	}

}
