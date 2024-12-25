package cons.org;

public class MeatShop {
	
	private String shopName;
	
	private String[] items;
	
	
	public MeatShop(String shopName, String[] items) {
		
		this.shopName= shopName;
		
		this.items= items;
		
		}
	
	public void invoice() {
		
		System.out.println("Shope Name: "+shopName);
		
		System.out.println("Items: ");
		
		for(String item :items) {
			
			System.out.println(item);
			
		}
	}
   
	
	public static void main(String[] args) {
		
		String it[]= {"Chciken","Mutton","Fish"};
		
		
		MeatShop m = new MeatShop("KGF", it);
		
		m.invoice();
		
		
		
		
	}
	
	
}
