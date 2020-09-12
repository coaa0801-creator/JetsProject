package com.skilldistillery.jets;

import java.text.DecimalFormat;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	public void fly() {
		DecimalFormat rnd = new DecimalFormat("##.0");
	System.out.println("I am a " + getClass().getSimpleName() + "but my friends call me a " + getModel() + ". I can travel "
			+ getRange() + " miles at a speed of " + getSpeed() + " miles per hour. That's Mach " + rnd.format(getSpeedInMach())
			+ ". Meaning I can fly for " + rnd.format(getTimeBeforeNoFuel()) + "before I run out of fuel.");


}
	@Override
	public void fight() {
		callToFight();
		System.out.println("Who is the enemy? I shall destroy them");
		// TODO Auto-generated method stub
		
	}
	
	private String callToFight() {
		return "FighterJet " + getModel() + "I'm fueled and can fight for " + getTimeBeforeNoFuel()
			+ " hours.";
	}
	
}
