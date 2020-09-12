package com.skilldistillery.jets;

import java.text.DecimalFormat;

public class PassengerPlane extends Jet implements PassengerFlight, CargoCarrier {

	public PassengerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	@Override
	public String fly() {
		DecimalFormat rnd = new DecimalFormat("##.0");
		String ppFly = "I am a " + getClass().getSimpleName() + "but my friends call me a " + getModel() + ". I can travel "
				+ getRange() + " miles at a speed of " + getSpeed() + " miles per hour. That's Mach " + rnd.format(getSpeedInMach())
				+ ". Meaning I can fly for " + rnd.format(getTimeBeforeNoFuel()) + "before I run out of fuel.";
return ppFly;
		
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
	@Override
	public String toString() {
		return "\nPassenger Plane : " + getModel() + "\n\t\tax Speed : " + getSpeed() + "mph\n\t\tRange : " + getRange()
				+ "\n\t\tPrice : " + getPrice() + " US Dollars";
	}

}
