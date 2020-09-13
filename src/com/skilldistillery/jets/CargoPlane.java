package com.skilldistillery.jets;

import java.text.DecimalFormat;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	
	@Override
	public String toString() {
		return "\n\nCargo Plane : " + getModel() + "\n\t\tMax Speed : " + getSpeed() + " mph\n\t\tRange : " + getRange()
		+ " miles\n\t\tPrice : " + getPrice() + " US Dollars";

	}

@Override
	public void fly() {
		DecimalFormat rnd = new DecimalFormat("##0.0");
//	 String cpFly = super.fly();  
			System.out.println("\nCargo Plane taking off... \n\tModel " + getModel() + ", can travel "
			+ getRange() + " miles at a speed of " + getSpeed() + " miles per hour. That's Mach " + rnd.format(getSpeedInMach())
			+ ". \n\tMeaning this " + getModel() + " can fly for " + getHoursBeforeNoFuel() + " hours and " + getMinutesBeforeNoFuel() + " minutes before it runs out of fuel.");
//return cpFly;

}


	@Override
	public void loadCargo() {
		System.out.println(getModel() +"... Loading up, but it might take a while");
	}
		
}
		
