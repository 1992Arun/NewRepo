package car.org;

public class Car {
	
		private String  make;
		private String  model;
		private int year;
		
		public Car() {
			
			make= "null";
			model= "null";
			year= 0000;
			
		}
		
		
		public Car(String make, String model, int year) {
		
			
			
			this.make=(make==null || make.isEmpty())? "Unknown":make;
			this.model=(model==null|| model.isEmpty())? "Unknown":model;
			this.year= (year<0)? 2000: year;
			
			
		}
		
		
		

		public void car() {
			
			System.out.println("Car make: "+make+"\n"+"Car Model: "+model+"\n"+"Year: "+year);
		}
		
		public static void main(String[] args) {
			
			
			Car car= new Car("Wolksvagon","",2022);
			
			car.car();
			
			
		}

}
