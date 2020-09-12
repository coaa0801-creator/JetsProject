package com.skilldistillery.jets;

import java.text.DecimalFormat;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	
	public void fly() {
		DecimalFormat rnd = new DecimalFormat("##.0");
	System.out.println("I am a " + getClass().getSimpleName() + "but my friends call me a " + getModel() + ". I can travel "
			+ getRange() + " miles at a speed of " + getSpeed() + " miles per hour. That's Mach " + rnd.format(getSpeedInMach())
			+ ". Meaning I can fly for " + rnd.format(getTimeBeforeNoFuel()) + "before I run out of fuel.");


}


	@Override
	public void loadCargo() {
		System.out.println("The cargo is loaded");
	}
		
}
		
