package org.computer;

public class Desktop implements AudioSystem {
	
	void desktopModel() {
		
		System.out.println("Levnova");
		
	}

	@Override
	public void softwareResources() {
		
		System.out.println("Google Chrome");
		
	}

	@Override
	public void hardwareResources() {

		System.out.println("2TB Hard disk");
		
	}
	
	public static void main(String[] args) {
	
	Desktop d = new Desktop();
	
	d.desktopModel();
	d.hardwareResources();
	d.softwareResources();
	
	d.RealTech();
	
	
	}

	@Override
	public void hardWareType() {
		
		System.out.println("Seagate");
		
	}

	@Override
	public void RealTech() {
		
		System.out.println("Sony");
		
		
		
	}

}
