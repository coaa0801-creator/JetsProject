package com.skilldistillery.jets;

import java.text.DecimalFormat;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public void fly() {
		DecimalFormat rnd = new DecimalFormat("##.0");
System.out.println("Fighter Jet taking off... \n\tModel " + getModel() + ", can travel "
			+ getRange() + " miles at a speed of " + getSpeed() + " miles per hour. That's Mach " + rnd.format(getSpeedInMach())
			+ ". Meaning this " + getModel() + " can fly for " + getHoursBeforeNoFuel() + " hours and " + getMinutesBeforeNoFuel() + " minutes before it runs out of fuel.");

}
	@Override
	public String toString() {
		return "\n\nFighter Jet : " + getModel() + "\n\t\tMax Speed : " + getSpeed() + " mph\n\t\tRange : " + getRange()
		+ " miles\n\t\tPrice : " + getPrice() + " US Dollars";
}
	@Override
	public void fight() {
		callToFight();
		System.out.println("... Who is the enemy? I shall destroy them");
		
	}
	
	private void callToFight() {
		System.out.println("\nFighterJet " + getModel() + " I'm fueled and can fight for " + getHoursBeforeNoFuel()
			+ " hours and " + getMinutesBeforeNoFuel() + " minutes.");
	}
	
}
