package com.skilldistillery.jets;

import java.text.DecimalFormat;

public class PassengerPlane extends Jet implements PassengerFlight, CargoCarrier {

	public PassengerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	@Override
	public void fly() {
		DecimalFormat rnd = new DecimalFormat("##.0");
		System.out.println("I am a " + getClass().getSimpleName() + "but my friends call me a " + getModel() + ". I can travel "
				+ getRange() + " miles at a speed of " + getSpeed() + " miles per hour. That's Mach " + rnd.format(getSpeedInMach())
				+ ". Meaning I can fly for " + rnd.format(getTimeBeforeNoFuel()) + "before I run out of fuel.");

		
	}
	@Override
	public void PrepPassengers() {
		System.out.println("Once you've found your seat, please direct your attention to the seatback pocket in front of you for you safety procedures.");
		
	}
	@Override
	public void loadCargo() {
		System.out.println("The passengers are loading into the fuselage. Once everyone is seated we will get going.");
		// TODO Auto-generated method stub
		
	}

}
