package bike.org;

public class Ktm implements BikeInformation,RoyalEnfield {



@Override
public void cost() {
 System.out.println("Cost is 3lakhs");
}


@Override
public void speed() {
	
	System.out.println("Maximum speed is 150km");
}

public void rpm() {
	
	System.out.println("Maximum Rpm is 1500km");
	
}

public static void main (String[] args) {
	
	Ktm k= new Ktm();
	
k.rpm();

k.speed();

k.mileage();
	
	
}


@Override
public void mileage() {

	System.out.println("45 Kms");
	
}


@Override
public void tyres() {
	
	System.out.println("Tubles tyres");
}
  


}
