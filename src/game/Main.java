package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		RoomManager mng = new RoomManager();
		
		mng.init();
		
		Player keiichi = new Player(mng.start());
		
		System.out.println("Keiichi's Morning" + "\n"
							+ "A Text Adventure By Samuel Sells" + "\n\n"
							+ "Samuel Sells: This is a short text adventure game I made based on Higurashi, " + "\n"
							+ "a visual novel series which I haven't yet finished but is quickly becoming one " + "\n"
							+ "of my favorites. This was created mainly to practice computer science " + "\n"
							+ "concepts, so don't take it very seriously. From here on out, treat the" + "\n"
							+ "narration as coming from the main character, Keiichi, even though it's also" + "\n"
							+ "actually written by me" + "\n\n");
		
		while(keiichi.status()) {
			printRoom(keiichi);
			String[] playerInput = collectInput(scan);
			parse(playerInput, keiichi);
		}
		
		scan.close();
	}
	
	//prints the information for the current room as well as what rooms the player can go to next
	private static void printRoom(Player player) {
		System.out.println("\n" + player.getRoom().getName() + "\n\n"
								+ player.getRoom().getLong() + "\n"
								+ "Exits: ");
		
		printExitOutput(player, "north");
		printExitOutput(player, "east");
		printExitOutput(player, "south");
		printExitOutput(player, "west");
		
		System.out.println("\n");
	}
	
	//function called by printRoom to add exit information to outputString
	private static void printExitOutput(Player player, String direction) {
		if(player.getRoom().getExit(direction) != null)
			System.out.println(direction + ": " + player.getRoom().getExit(direction).getName());
	}

	//collects player's input from the command line
	private static String[] collectInput(Scanner scan) {
		System.out.print("What should I do next? : ");
		scan.useDelimiter("\n");
		String[] userInput = scan.nextLine().split(" ");
		
		String[] returnString = new String[5];
		
		for(int i = 0; i < Math.min(userInput.length, returnString.length); i++) {
			returnString[i] = userInput[i];
		}
		
		return returnString;
	}
	
	//parses player's input and determines what actions to perform
	private static void parse(String[] command, Player player) {
		switch(command[0].toLowerCase()) {
			case "go":
				player.setRoom(player.getRoom().getExit(command[1]));
				break;
			
			/*case "examine":
				break;
			
			case "talk":
				break;
			
			case "open":
				break;*/
			
			case "help":
				help();
				break;
				
			case "exit":
				player.endGame();
				break;
				
			default:
				System.out.println("\n" + "I can't understand what you're telling me to do." + "\n" +
									"Type the word help to get a list of instructions I'll understand");	
		}
	}
	
	//prints a list of command for user
	private static void help() {
		System.out.println("\n" + "Acceptable Commands:" + "\n"
							+ "go <north/south/east/west> - specify a direction to head to another room" + "\n"
							//+ "examine <room/object/person> - examine a room, object, or person more closely" + "\n"
							//+ "talk <Mom/Sensei/Satoko/___> - talk to other characters" + "\n"
							//+ "open <door/___> - open door" + "\n"
							+ "exit - exit game" + "\n");
	}
}
