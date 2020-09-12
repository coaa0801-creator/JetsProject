package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {
	private List<Jet> allplanes = new ArrayList<Jet>();
	
	public Airfield() {
		
	}


		public List<Jet> parseFromTextFile(){
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt")) ) {
			  String line;
			  while ((line = bufIn.readLine()) != null) {
				String [] planes = line.split(",");
				if (planes[0].equals("Cargo Plane")) {
					this.allplanes.add(new CargoPlane(planes[1],Double.parseDouble(planes[2]),Integer.parseInt(planes[3]),Long.parseLong(planes[4])));
				}
				if (planes[0].equals("Fighter Jet")) {
					this.allplanes.add(new FighterJet(planes[1],Double.parseDouble(planes[2]),Integer.parseInt(planes[3]),Long.parseLong(planes[4])));
				}
				if (planes[0].equals("Passenger Plane")) {
					this.allplanes.add(new PassengerPlane(planes[1],Double.parseDouble(planes[2]),Integer.parseInt(planes[3]),Long.parseLong(planes[4])));
				}
			  }
		}
			catch (IOException e) {
			  System.err.println(e);
			}
		return allplanes;
		}
		
		public List<Jet> getAllplanes() {
			parseFromTextFile();
			return allplanes;
		}

		public void setAllplanes(List<Jet> allplanes) {
		this.allplanes = allplanes;
		}

	
		

}
