package com.skilldistillery.jets;

import java.text.DecimalFormat;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	
	@Override
	public String toString() {
		return "\nCargo Plane : " + getModel() + "\n\t\tMax Speed : " + getSpeed() + " mph\n\t\tRange : " + getRange()
		+ " miles\n\t\tPrice : " + getPrice() + " US Dollars";

	}

@Override
	public void fly() {
		DecimalFormat rnd = new DecimalFormat("##.0");
//	 String cpFly = super.fly();  
			System.out.println("Cargo Plane taking off... Model " + getModel() + ", can travel "
			+ getRange() + " miles at a speed of " + getSpeed() + " miles per hour. That's Mach " + rnd.format(getSpeedInMach())
			+ ". Meaning this " + getModel() + " can fly for " + getHoursBeforeNoFuel() + " hours and " + getMinutesBeforeNoFuel() + " minutes before it runs out of fuel.");
//return cpFly;

}


	@Override
	public void loadCargo() {
		System.out.println("The cargo is loading....");
	}
		
}
		
