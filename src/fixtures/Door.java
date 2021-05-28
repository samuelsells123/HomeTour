package fixtures;

import java.util.HashMap;

public class Door extends Fixture {
	protected HashMap<String, Room> exits;
	protected boolean isOpen;
	protected String openMessage;
	
	public Door(String name, String shortDescription, String longDescription, String openMessage) {
		super(name, shortDescription, longDescription);
		this.exits = new HashMap<String, Room>();
		isOpen = false; // doors are closed by default
		this.openMessage = openMessage;
	}
	
	//Opens door or prints out message if already open
	public void open() {
		if(isOpen) {
			System.out.println("\n" + "The door is already open.");
		}
		else {
			System.out.println("\n" + openMessage);
			isOpen = true;
		}
	}
}
