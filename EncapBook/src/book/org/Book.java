package book.org;

public class Book {

	private String  title;
	
	private String author;
	
	private int price;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}
	
	float applyDiscount(float discount ){
		
		float payment = price- price*discount/100;
			
		
		
		return payment ;
		
	}
	
	
}
