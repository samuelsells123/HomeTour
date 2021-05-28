package fixtures;

public class Room extends Fixture {
	protected Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
		
	public Room[] getExits() {
		return exits;
	}
	
	//returns exit in direction specified
	public Room getExit(String direction) {
		Room exitRoom = exits[3];
		
		switch(direction.toLowerCase()) {
			case "north":
				exitRoom = exits[0];
				break;
			case "east":
				exitRoom = exits[1];
				break;
			case "south":
				exitRoom = exits[2];
				break;
			case "west":
				exitRoom = exits[3];
				break;
		}
		
		return exitRoom;
	}
}