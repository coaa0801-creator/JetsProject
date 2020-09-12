package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	private double time;
	
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	public void fly() {
		System.out.println("WEEE, I'm Flying");
		
		
	}
	public int getHoursBeforeNoFuel() {
		int hours = (int)getTimealoft();
		return hours;
	}
	public int getMinutesBeforeNoFuel() {
		int minutes = (int) ((getTimealoft() % 1)*60);
	return minutes;
	}
		
		
	public double getTimealoft () {	
		double time = range / speed;
		return time;
	}
	
	
	public double getSpeedInMach() {
		double machSpeed = this.speed / 760;
		
		return machSpeed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	

}
