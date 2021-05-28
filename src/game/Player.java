package game;

import fixtures.Room;

public class Player {
	protected static Room currentRoom;
	protected static boolean continuePlaying;
	
	public Player(Room startRoom) {
		currentRoom = startRoom;
		continuePlaying = true;
	}
	
	public static Room getRoom() {
		return currentRoom;
	}
	
	public void setRoom(Room newRoom) {
		currentRoom = newRoom;
	}
	
	public boolean status() {
		return continuePlaying;
	}
	
	public void endGame() {
		continuePlaying = false;;
	}
}
