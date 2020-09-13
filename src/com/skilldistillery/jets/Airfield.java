package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Airfield {
	private List<Jet> allplanes = new ArrayList<Jet>();
	private Scanner kb = new Scanner(System.in);
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
		
			return allplanes;
		}

		public void setAllplanes(List<Jet> allplanes) {
		this.allplanes = allplanes;
		}

		
		
	public void allFly() {
		System.out.println("All jets, prepare for flight!");
		for (Jet jet : allplanes) {
				jet.fly();
			
		}
	}
		public void loadPlanes() {
			System.out.println("Any of you out there planning to carry something, load up!");
			for (Jet jet : allplanes) {
				if (jet instanceof CargoCarrier){
				((CargoCarrier) jet).loadCargo();
				}else {
					continue;
					}
			
			}
		
		}
	public void longestRange() {
		System.out.println("The jet with the longest range is: ");
		Jet longestRange = allplanes.get(0);
		for (int i = 1; i < allplanes.size(); i++) {
			if (allplanes.get(i).getRange() > longestRange.getRange()) {
				longestRange = allplanes.get(i);
			}
		}
		System.out.println(longestRange);
	}


	public void fastestJet() {
		System.out.println("The jet with the fastest speed is: ");
		Jet fastestSpeed = allplanes.get(0);
		for (int i = 1; i < allplanes.size(); i++) {
			if (allplanes.get(i).getSpeed() > fastestSpeed.getSpeed()) {
				fastestSpeed = allplanes.get(i);
			}
		}
		System.out.println(fastestSpeed);
		
	}


	public void dogFight() {
		System.out.println("It's time for a battle!");
		for (Jet jet : allplanes) {
			if (jet instanceof CombatReady){
				((CombatReady) jet).fight();
				
			}else {
				continue;
			}
			
		}
		
	}


	public void addAJet() {
System.out.println("\n<=====================================>");
System.out.println("|                                     |");
System.out.println("|           What type of jet          |");
System.out.println("|         would you like to Add?      |");
System.out.println("|                                     |");
System.out.println("|          1: Passenger               |");
System.out.println("|          2: Fighter                 |");
System.out.println("|          3: Cargo                   |");
System.out.println("|                                     |");
System.out.println("<=====================================>");
boolean keepGoing = true;
while (keepGoing) {
	String addJet = kb.nextLine();
	addJet = addJet.toLowerCase();
	switch (addJet) {
	case "1": case "passenger":
			System.out.print("What model is this?");
			String newModel = kb.nextLine();
			System.out.print("In MPH, what is it's top speed?");
			Double newSpeed = kb.nextDouble();
			System.out.print("How many miles can it fly before refueling?");
			int newRange = (int)kb.nextDouble();
			System.out.print("How much does it cost?");
			Long newPrice = kb.nextLong();
			this.allplanes.add(new PassengerPlane(newModel, newSpeed, newRange, newPrice));
			keepGoing = false;
			break;
		
		
		
	case "2": case "fighter":
		System.out.print("What model is this?");
		newModel = kb.nextLine();
		System.out.print("In MPH, what is it's top speed?");
		newSpeed = kb.nextDouble();
		System.out.print("How many miles can it fly before refueling?");
		newRange = (int)kb.nextDouble();
		System.out.print("How much does it cost?");
		newPrice = kb.nextLong();
		this.allplanes.add(new FighterJet(newModel, newSpeed, newRange, newPrice));
		keepGoing = false;
		break;
		
		
		
		
		
	case "3": case "cargo":
		System.out.print("What model is this?");
		newModel = kb.nextLine();
		System.out.print("In MPH, what is it's top speed?");
		newSpeed = kb.nextDouble();
		System.out.print("How many miles can it fly before refueling?");
		newRange = (int)kb.nextDouble();
		System.out.print("How much does it cost?");
		newPrice = kb.nextLong();
		this.allplanes.add(new CargoPlane(newModel, newSpeed, newRange, newPrice));
		keepGoing = false;
		break;
		
		
		
		
	default: System.out.println("Please enter a valid tyoe of Jet");	
	}
}



	}
	}
		


