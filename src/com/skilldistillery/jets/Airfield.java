package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Airfield {
	private List<Jet> allplanes = new ArrayList<Jet>();
	private Scanner kb = new Scanner(System.in);

	public Airfield() {

	}

	public List<Jet> parseFromTextFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] planes = line.split(",");
				if (planes[0].equals("Cargo Plane")) {
					this.allplanes.add(new CargoPlane(planes[1], Double.parseDouble(planes[2]),
							Integer.parseInt(planes[3]), Long.parseLong(planes[4])));
				}
				if (planes[0].equals("Fighter Jet")) {
					this.allplanes.add(new FighterJet(planes[1], Double.parseDouble(planes[2]),
							Integer.parseInt(planes[3]), Long.parseLong(planes[4])));
				}
				if (planes[0].equals("Passenger Plane")) {
					this.allplanes.add(new PassengerPlane(planes[1], Double.parseDouble(planes[2]),
							Integer.parseInt(planes[3]), Long.parseLong(planes[4])));
				}
			}
		} catch (IOException e) {
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
		System.out.println("Tower to Airfield ---- All jets, prepare for flight!");
		for (Jet jet : allplanes) {
			jet.fly();

		}
	}

	public void loadPlanes() {
		System.out.println("Tower to Airfield --- Any of you out there planning to carry something, load up!");
		for (Jet jet : allplanes) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			} else {
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
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();

			} else {
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
			case "1":
			case "passenger":
				System.out.print("What model is this?");
				String newModel = kb.nextLine();
				System.out.print("In MPH, what is it's top speed?");
				Double newSpeed = kb.nextDouble();
				System.out.print("How many miles can it fly before refueling?");
				int newRange = (int) kb.nextDouble();
				System.out.print("How much does it cost?");
				Long newPrice = kb.nextLong();
				this.allplanes.add(new PassengerPlane(newModel, newSpeed, newRange, newPrice));
				keepGoing = false;
				break;

			case "2":
			case "fighter":
				System.out.print("What model is this?");
				newModel = kb.nextLine();
				System.out.print("In MPH, what is it's top speed?");
				newSpeed = kb.nextDouble();
				System.out.print("How many miles can it fly before refueling?");
				newRange = (int) kb.nextDouble();
				System.out.print("How much does it cost?");
				newPrice = kb.nextLong();
				this.allplanes.add(new FighterJet(newModel, newSpeed, newRange, newPrice));
				keepGoing = false;
				break;

			case "3":
			case "cargo":
				System.out.print("What model is this?");
				newModel = kb.nextLine();
				System.out.print("In MPH, what is it's top speed?");
				newSpeed = kb.nextDouble();
				System.out.print("How many miles can it fly before refueling?");
				newRange = (int) kb.nextDouble();
				System.out.print("How much does it cost?");
				newPrice = kb.nextLong();
				this.allplanes.add(new CargoPlane(newModel, newSpeed, newRange, newPrice));
				keepGoing = false;
				break;

			default:
				System.out.println("Please enter a valid tyoe of Jet");
			}
		}

	}

	public void printJetListForUserRemove() {
		System.out.println("Which Jet would you like to remove from the Fleet?\n");
		int i = 1;
		for (Jet jet : allplanes) {
			System.out.print("Hanger " + i + ": ");
			i++;
			System.out.println(jet.getModel());
		}

	}

	public void removeJet() {
		boolean gotInvalidInput = true;
		int userRemove = hangerToRemove();
		while (gotInvalidInput) {
			if (userRemove == -1) {
				userRemove = hangerToRemove();
			} else {
				gotInvalidInput = false;
				break;
			}
		}

		int i = 1;
		boolean jetRemove = false;
		for (Jet jet : allplanes) {
			if (userRemove == i) {
				jetRemove = true;
				break;
			} else {
				i++;
			}
		}
//	System.out.println(userRemove);
		System.out.println("\nYou have successfully removed airfield parking credentials from " + allplanes.get(i - 1));
		allplanes.remove(i - 1);
	}

	private int hangerToRemove() {
		boolean gotValidInput = false;
//		int invalid = -1;
		int userRemove = -1;
		while (!gotValidInput) {
			try {
				System.out.print("\nPlease enter the hanger number for the Jet you would like to remove: ");
				userRemove = kb.nextInt();
				gotValidInput = true;
				return userRemove;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. ");
				kb.nextLine();
				return userRemove;// Clear input buffer.
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Invalid input. ");
				kb.nextLine();
				return userRemove;// Clear input buffer.
			}
		}
		System.out.println(userRemove);
		return userRemove;

	}

	public String search() {
		String menu = "Main Menu";
//		System.out.println("Ooops, this hasn't been created yet but we're working on it...");
		boolean search = true;
		while (search) {
			searchMenu();
			String searchChoice = kb.nextLine();
			searchChoice = searchChoice.toUpperCase();
			switch (searchChoice) {
			case "NAME":
			case "SEARCH BY NAME":
			case "SEARCH NAME":
			case "BY NAME":
			case "1":
//				kb.nextLine();// clear buffer

				System.out.print("What is the model name of the Jet?   ");
				String searchModel = kb.nextLine();
				for (Jet jet : allplanes) {
					if (allplanes == null) {
						continue;
					}
					String test = jet.getModel();
					if (test.contains(searchModel)) {
						System.out.println(jet.toString());
					}
					if (!test.contains(searchModel)) {
						continue;
					}
				}
				if (!allplanes.toString().contains(searchModel)) {
					System.out.println("There is no Jet that has that model name");

				}
				break;

			case "SPEED":
			case "BY SPEED":
			case "2":
//				kb.nextLine();// clear buffer
	
				System.out.print("What is the minimum Max Speed you are looking for?   ");
				double searchSpeed = kb.nextDouble();
				kb.nextLine();
				System.out.println("The following Jets have at least the Max Speed you are looking for\n");
				for (Jet jet : allplanes) {

					if (jet == null) {
						continue;
					}
					double test = jet.getSpeed();
					if (searchSpeed < test) {
						
						System.out.println(jet.toString());
					}
					else if (test < searchSpeed) {
						continue;}					
					
					else {
						System.out.println("There is no Jet with at least that Max Speed");
					}
				}

				break;
			case "3":
			case "BY RANGE":
			case "RANGE":
//				kb.nextLine();// clear buffer
				System.out.print("What is the minumum Mileage you need this Jet to go?   ");
				int searchRange = kb.nextInt();
				kb.nextLine();
				System.out.println("The following Jets have at least the range you are looking for\n");
				for (Jet jet : allplanes) {
					if (allplanes == null) {
						continue;
					}
					int test = jet.getRange();
					if (test > searchRange) {
						System.out.println(jet.toString());
					}
					else if (test < searchRange) {
						continue;}
					else  {
							System.out.println("There is no Jet that can go at minimum that distance");
					}
				}				

				break;
			case "4":
			case "MAIN MENU":
			case "MENU":
			case "MAIN":
				search = false;
				break;
			case "5":
			case "QUIT":
				search = false;
				menu = "QUIT";
				break;
			default:
				System.out.println("Please enter a valid search option");
			}
		
		}
		return menu;
	}

	private void searchMenu() {
		System.out.println("\n\n\n<================================>");
		System.out.println("|           SEARCH MENU          |");
		System.out.println("|                                |");
		System.out.println("|   1: By Model Name             |");
		System.out.println("|   2: By Speed                  |");
		System.out.println("|   3: By Range                  |");
		System.out.println("|   4: Main Menu                 |");
		System.out.println("|   5: Quit                      |");
		System.out.println("|                                |");
		System.out.println("<================================>");

	}
}
