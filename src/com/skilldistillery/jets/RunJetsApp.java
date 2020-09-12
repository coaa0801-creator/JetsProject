package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunJetsApp {
	static RunJetsApp run = new RunJetsApp();
	private Scanner kb = new Scanner(System.in);
	private Airfield airfield = new Airfield();

	public static void main(String[] args) {
		run.launchApp();

	}

	private void launchApp() {
		run.welcomeUserMenu();
		airfield.parseFromTextFile();
		run.MenuSwitch();
		run.Goodbye();

	}

	private void MenuSwitch() {
		boolean keepGoing = true;
		whatChoice();
		while (keepGoing) {
			String userInput = kb.nextLine();

			switch (userInput) {
			case "1":
				System.out.println(airfield.getAllplanes());
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "2":
				airfield.allFly();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "3":
				airfield.fastestJet();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "4":
				airfield.longestRange();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "5":
				airfield.loadPlanes();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "10":
				keepGoing = false;
				break;

			}

		}

	}
private void Goodbye() {
	System.out.println("                     __|__\n\t    __|__ *---o0o---* __|__\n   __|__ *---o0o---*       *---o0o---*\n*---o0o---*");
	System.out.println("\n<=====================================>");
	System.out.println("|                                     |");
	System.out.println("|                                     |");
	System.out.println("|                GOODBYE              |");
	System.out.println("|                                     |");
	System.out.println("|                                     |");
	System.out.println("<=====================================>");
	System.out.print("\t           _\n" + 
			"\t         -=\\`\\\n" + 
			"\t     |\\ ____\\_\\__\n" + 
			"\t   -=\\c`\"\"\"\"\"\"\" \"`)\n" + 
			"\t      `~~~~~/ /~~`\n" + 
			"\t        -==/ /\n" + 
			"\t          '-'");
	
	
	
}
	
	

	private void whatChoice() {
		System.out.println("\nWhat would you like to do?  ");

	}

	private boolean mainOrQuit(boolean keepGoing) {
		System.out.println("\n<=====================================>");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|             1: MAIN MENU            |");
		System.out.println("|             2: Quit                 |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("<=====================================>");
		whatChoice();
		String quit = kb.next();
		if (quit.equals("2") || quit.equals("quit")) {
			keepGoing = false;
		}else { printMainMenu();
				whatChoice();
		}
		
		return keepGoing;
		
	}

	private void printMainMenu() {
		System.out.println("                     __|__\n\t    __|__ *---o0o---* __|__\n   __|__ *---o0o---*       *---o0o---*\n*---o0o---*");

	System.out.println("\n<=====================================>");
	System.out.println("|                                     |");
	System.out.println("|               MAIN MENU             |");
	System.out.println("|                                     |");
	System.out.println("|   1: List the Fleet                 |");
	System.out.println("|   2: Fly All the Jets               |");
	System.out.println("|   3: View Fastest Jet               |");
	System.out.println("|   4: View Jet with Longest Range    |");
	System.out.println("|   5: Load Jets That Carry Cargo     |");
	System.out.println("|   6: Dogfight!                      |");
	System.out.println("|   7: Add a Jet to the Fleet         |");
	System.out.println("|   8: Remove a Jet from the Fleet    |");
	System.out.println("|   9: Search                         |");
	System.out.println("|  10: Quit                           |");
	System.out.println("|                                     |");
	System.out.println("|                                     |");
	System.out.println("<=====================================>");
		
	}

	private void welcomeUserMenu() {
		System.out.println("                     __|__\n\t    __|__ *---o0o---* __|__\n   __|__ *---o0o---*       *---o0o---*\n*---o0o---*");

		System.out.println("\n  WELCOME TO THE AIRPORT MANAGER APP");
		System.out.println("\n<=====================================>");
		System.out.println("|                                     |");
		System.out.println("|               MAIN MENU             |");
		System.out.println("|                                     |");
		System.out.println("|   1: List the Fleet                 |");
		System.out.println("|   2: Fly All the Jets               |");
		System.out.println("|   3: View Fastest Jet               |");
		System.out.println("|   4: View Jet with Longest Range    |");
		System.out.println("|   5: Load Jets That Carry Cargo     |");
		System.out.println("|   6: Dogfight!                      |");
		System.out.println("|   7: Add a Jet to the Fleet         |");
		System.out.println("|   8: Remove a Jet from the Fleet    |");
		System.out.println("|   9: Search                         |");
		System.out.println("|  10: Quit                           |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("<=====================================>");
	}

}
