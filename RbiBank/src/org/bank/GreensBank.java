package org.bank;

public class GreensBank implements Banks,Finance {

	@Override
	public void savings() {
		
		System.out.println("Greens savings %5");
		
	}
	
	
	public void fixed() {
		
		System.out.println("Greens fixed %9");
	}

	
	public static void main(String[] args) {
		
		
		GreensBank g=new GreensBank();
		
		g.savings();
		g.fixed();
		g.current();
		
		
	
		Banks b= new GreensBank();
		
		b.savings();
		b.current();
		
		Finance f= new GreensBank();
		
		f.goldloan();
	
		
		
	}


	@Override
	public void current() {
		System.out.println("Greens current 3%");
		
	}


	@Override
	public void goldloan() {
		System.out.println("Greens current 7%");
		
	}
}
