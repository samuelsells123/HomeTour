package fixtures;

import java.util.HashMap;

public class Room extends Fixture {
	protected HashMap<String, Room> exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new HashMap<String, Room>();
	}
	
	public void addExit(Room newExit, String Direction) {
		exits.put(Direction, newExit);
	}
		
	public HashMap<String, Room> getExits() {
		return exits;
	}
	
	//returns exit in direction specified
	public Room getExit(String direction) {
		return exits.get(direction);
	}
}