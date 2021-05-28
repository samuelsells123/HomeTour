package fixtures;

import java.util.HashMap;

public class TrapDoor extends Door {
	protected boolean isTrapped;
	protected String trapMessage;
	
	//TrapDoors are like Doors except the player will have to examine them
	//to disable their trap, which leads to a different message when opened.
	public TrapDoor(String name, String examineMessage, String openMessage, String trapMessage) {
		super(name, examineMessage, openMessage);
		this.trapMessage = trapMessage;
		this.exits = new HashMap<String, Room>();
	}
	
	//Opens the trap door. If the trap has not been disabled, a different
	//sequence of events will result from opening the door.
	public void open() {
		if(isTrapped)
			System.out.println("\n" + trapMessage);
		else if(isOpen)
			System.out.println("\n" + "The door is already open.");
		else {
			System.out.println("\n" + longDescription);
			isOpen = true;
		}
	}
	
	public void examine() {
		System.out.println("\n" + shortDescription);
		isTrapped = false;
	}
}