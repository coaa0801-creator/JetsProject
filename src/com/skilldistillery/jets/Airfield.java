package com.skilldistillery.jets;

import java.util.ArrayList;

public class Airfield {
	private ArrayList<Jet> allplanes = new ArrayList<Jet>();
	
	public Airfield() {
		
	}

	public ArrayList<Jet> getAllplanes() {
		return allplanes;
	}

	public void setAllplanes(ArrayList<Jet> allplanes) {
		this.allplanes = allplanes;
	}

}
