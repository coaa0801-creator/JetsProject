package com.skilldistillery.jets;

import java.text.DecimalFormat;

public class PassengerPlane extends Jet implements PassengerFlight, CargoCarrier {

	public PassengerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	@Override
	public void fly() {
		DecimalFormat rnd = new DecimalFormat("##0.0");
		System.out.println("\nPassenger Plane taking off... \n\tModel " + getModel() + ", can travel "
				+ getRange() + " miles at a speed of " + getSpeed() + " miles per hour. That's Mach " + rnd.format(getSpeedInMach())
				+ ". \n\tMeaning this " + getModel() + " can fly for " + getHoursBeforeNoFuel() + " hours and " + getMinutesBeforeNoFuel() + " minutes before it runs out of fuel.");
//return ppFly;
		
	}
	@Override
	public void PrepPassengers() {
		System.out.println("Once you've found your seat, please direct your attention to the seatback pocket in front of you for you safety procedures.");
		
	}
	@Override
	public void loadCargo() {
		System.out.println(getModel() +"... The passengers are loading into the fuselage. Once everyone is seated, we will get going.");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "\n\nPassenger Plane : " + getModel() + "\n\t\tMax Speed : " + getSpeed() + " mph\n\t\tRange : " + getRange()
				+ " miles\n\t\tPrice : " + getPrice() + " US Dollars";
	}

}
