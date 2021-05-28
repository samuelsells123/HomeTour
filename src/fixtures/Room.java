package fixtures;

import java.util.HashMap;

import game.Dialogue;
import game.Person;

public class Room extends Fixture {
	protected HashMap<String, Room> exits;
	protected Person resident;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new HashMap<String, Room>();
		this.resident = null;
	}
	
	//adder methods
	public void addExit(Room newExit, String Direction) {
		exits.put(Direction, newExit);
	}
	
	public void addResident(String name, Dialogue[] conversation) {
		resident = new Person(name, conversation);
	}
		
	//getter methods
	public HashMap<String, Room> getExits() {
		return exits;
	}
	
	//returns exit in direction specified
	public Room getExit(String direction) {
		return exits.get(direction);
	}
	
	public Person getResident() {
		return resident;
	}
}