package fixtures;

import java.util.HashMap;

public class Door extends Fixture {
	protected HashMap<String, Room> exits;
	protected boolean isOpen;
	
	//for doors, shortDesciption will contain a message for when doors are examined
	//and longDescription will contain a message for when they are opened
	public Door(String name, String examineMessage, String openMessage) {
		super(name, examineMessage, openMessage);
		this.exits = new HashMap<String, Room>();
		isOpen = false; // doors are closed by default
	}
	
	//Opens door or prints out message if already open
	public void open() {
		if(isOpen) {
			System.out.println("\n" + "The door is already open.");
		}
		else {
			System.out.println("\n" + longDescription);
			isOpen = true;
		}
	}
	
	public void examine() {
		System.out.println("\n" + shortDescription);
	}
}
