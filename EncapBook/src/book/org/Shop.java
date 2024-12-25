package book.org;

public class Shop {
	
	public static void main(String[] args) {
		
	
	
	Book b= new Book();
	
	
	b.setAuthor("Dostyowsky");
	
	b.setPrice(340);
	
	b.setTitle("Idiot");
	
	System.out.println(b.applyDiscount(20));
	
	
	Book b1= new Book();
	
    b1.setAuthor("Tolstoy");
	
	b1.setPrice(250);
	
	b1.setTitle("War and peace");
	
	
	
	
	
	System.out.println(b1.applyDiscount(12));
	
	
	
	
}}