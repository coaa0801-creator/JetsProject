package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.List;

public class Airfield {
	private List<Jet> allplanes = new ArrayList<Jet>();
	
	public Airfield() {
		
	}

	public List<Jet> getAllplanes() {
		return allplanes;
	}

	public void setAllplanes(List<Jet> allplanes) {
		this.allplanes = allplanes;
	}

}
