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
	
	
	public static void main(String[] args) {
		run.launchApp();
		
		
		
	}


	private void launchApp() {
		run.welcomeUserMenu();
		run.MenuSwitch();
		
		
		
	}


	private void MenuSwitch() {
		Airfield airfield = new Airfield();
		boolean keepGoing = true;
		
		while (keepGoing) {
		System.out.println("What would you like to do?  ");
		String userInput = kb.nextLine();
		
		switch (userInput) {
		case "1": for (Jet jets : airfield.getAllplanes()) {
			System.out.println(jets);}
			break;
		case "2": 
			airfield.allFly();
			
			
		
		
		
		
		
		}

			}
		
		}
		
		
	





	private void welcomeUserMenu() {
	     System.out.println("                     __|__\n\t    __|__ *---o0o---*\n   __|__ *---o0o---*\n*---o0o---*");
	 
	     System.out.println("\n  WELCOME TO THE AIRPORT MANAGER APP");
	     System.out.println("\n<=====================================>");
	     System.out.println("|                                     |");
		System.out.println("|               MAIN MENU             |");
		System.out.println("|                                     |");
		System.out.println("|   1: List the Fleet                 |");
		System.out.println("|   2: Fly All the Jets               |");
		System.out.println("|   3: View Fastest Jet               |");
		System.out.println("|   4: View Jet with Longest Range    |");
		System.out.println("|   5: Load All Cargo Jets            |");
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
