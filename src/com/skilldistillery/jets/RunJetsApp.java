package com.skilldistillery.jets;


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
		run.MenuSwitch();
		run.Goodbye();

	}

	private void MenuSwitch() {
		airfield.parseFromTextFile();
		boolean keepGoing = true;
		whatChoice();
		while (keepGoing) {
			String userInput = kb.nextLine();
			userInput = userInput.toLowerCase();
			switch (userInput) {
			case "1": case "print fleet": case "print": case "all": case "print all":
				System.out.println(airfield.getAllplanes());
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "2": case "all fly":
				airfield.allFly();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "3": case "fastest":
				airfield.fastestJet();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "4": case "range":
				airfield.longestRange();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "5": case "load":
				airfield.loadPlanes();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "6" : case"fight":
				airfield.dogFight();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "7":case "add":
				airfield.addAJet();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "8": case "remove":
				airfield.printJetListForUserRemove();
				airfield.removeJet();
				keepGoing = mainOrQuit(keepGoing);
				break;
			case "9": case "search":
				String menu = airfield.search();
				if (menu.equals("Main Menu")) {
				printMainMenu();
				break;}
				if (menu.equals("QUIT")) {
					keepGoing = false;
					break;
				}
					
			case "10": case "quit":
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
		quit = quit.toLowerCase();
		if (quit.equals("2") || quit.equals("quit")) {
			keepGoing = false;
		}
		else if (quit.equals("1") || quit.equals("main")) {
			printMainMenu();
			whatChoice();
		}		else { 
				System.out.println("Sorry, didn't recognize that. Here's the Main Menu");
				printMainMenu();
				whatChoice();
		}
		
		return keepGoing;
		
	}

	private void printMainMenu() {
		System.out.println(menuPlane((int)(Math.random() * 9)));
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

	private String menuPlane(int index) {
		String[] planeArt = new String [9];
		planeArt[0] = "                     __|__\n\t    __|__ *---o0o---* __|__\n   __|__ *---o0o---*       *---o0o---*\n*---o0o---*";
		planeArt[1] = "----|------------|-----------|----\n" + 
				"    |        --/ - \\--       |\n" + 
				"   -|---------|  o  |--------|-\n" + 
				"              /\\ _ /\\\n" + 
				"           []/       \\[]\n";
		planeArt[2] = "\t\t __\n" + 
				"\t\t \\  \\     _ _\n" + 
				"\t\t  \\**\\ ___\\/ \\\n" + 
				"\t\tX*#####*+^^\\_\\\n" + 
				"\t\t  o/\\  \\\n" + 
				"\t\t     \\__\\";
		planeArt[3] = " .-.    _,  .-.  ,_    .-.\n" + 
				"'-._'--'  \\_| |_/  '--'_.-'\n" + 
				"    '-._  \\ | | /  _.-'\n" + 
				"        `-.^| |^.-'\n" + 
				"           `\\=/`\n" + 
				"             `";
		planeArt[4] = "            ____\n" + 
				"  |        | ___\\          /~~~|\n" + 
				" _:_______|/'(..)`\\_______/  | |\n" + 
				"<_|``````  \\__~~__/  USAF ___|_|\n" + 
				"  :\\_____(=========,(*),--\\__|_/\n" + 
				"  |       \\       /---'\n" + 
				"           | (*) /\n" + 
				"           |____/";
		planeArt[5] = "            ______\n" + 
				"            _\\ _~-\\___\n" + 
				"    =  = ==(____AA____D\n" + 
				"                \\_____\\___________________,-~~~~~~~`-.._\n" + 
				"                /     o O o o o o O O o o o o o o O o  |\\_\n" + 
				"                `~-.__        ___..----..                  )\n" + 
				"                      `---~~\\___________/------------`````\n" + 
				"                      =  ===(_________D\n";
		planeArt[6] = "  ___\n" + 
				" |   \\\n" + 
				" |    \\                   ___\n" + 
				" |_____\\______________.-'`   `'-.,___\n" + 
				"/| _____     _________            ___>---\n" + 
				"\\|___________________________,.-'`\n" + 
				"          `'-.,__________)\n";
		planeArt[7] = "                    ,.\n" + 
				"                ___( |___\n" + 
				"                `--- \\---'\n" + 
				"                    | \\\n" + 
				"                    \\  \\\n" + 
				"   __________________\\  \\___________________\n" + 
				"   \\                     \\                   \\\n" + 
				"    ------------------    \\-------------------\n" + 
				"                 (\\)   \\   \\ (\\)\n" + 
				"                        \\ ' \\\n" + 
				"                        :`(.)-'\n" + 
				"                        ` ; `,";
		planeArt[8] = "                             |\n" + 
				"                       --====|====--\n" + 
				"                             |  \n" + 
				"\n" + 
				"                         .-\"\"\"\"\"-. \n" + 
				"                       .'_________'. \n" + 
				"                      /_/_|__|__|_\\_\\\n" + 
				"                     ;'-._       _.-';\n" + 
				",--------------------|    `-. .-'    |--------------------,\n" + 
				" ``\"\"--..__    ___   ;       '       ;   ___    __..--\"\"``\n" + 
				"           `\"-// \\\\.._\\             /_..// \\\\-\"`\n" + 
				"              \\\\_//    '._       _.'    \\\\_//\n" + 
				"               `\"`        ``---``        `\"`";
		
			String menuReturnArt = planeArt[index];
			return menuReturnArt;

		
		
		
		
	}
}
