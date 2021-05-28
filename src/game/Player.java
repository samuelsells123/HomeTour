package game;

import fixtures.Room;

public class Player {
	protected Room currentRoom;
	protected boolean continuePlaying;
	
	public Player(Room startRoom) {
		currentRoom = startRoom;
		continuePlaying = true; //indicates if player has told game to close
	}
	
	public Room getRoom() {
		return currentRoom;
	}
	
	public void setRoom(Room newRoom) {
		currentRoom = newRoom;
	}
	
	public boolean status() {
		return continuePlaying;
	}
	
	public void endGame() {
		continuePlaying = false;
	}
}
