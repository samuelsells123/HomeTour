package game;

import fixtures.Room;

public class RoomManager {
	protected Room startingRoom;
	protected Room[] rooms;
	
	//creates all rooms needed for game
	public void init() {
		rooms = new Room[10];
		
	    Room bedroom = new Room (
			"Bedroom",
			"My Bedroom",
			"Not much to talk about here. I've got my bed, a small desk," + "\n"
			+ "and my school uniform hanging on a rack in the corner of" + "\n"
			+ "the room. The morning sun shines through the window, urging" + "\n"
			+ "me to hurry and get prepared for school, so I yank my uniform" + "\n"
			+ "off the rack and get changed." + "\n");
	    
	    this.rooms[0] = bedroom;
	    this.startingRoom = bedroom;
	    
	    Room homeHall = new Room (
			"Hallway",
			"Upstairs Hallway",
			"This is the hallway connecting all the rooms on the second floor of my" + "\n"
			+ "family's house. My room is on the east side of the house, along with" + "\n"
			+ "the stairs to the first floor. Further down the hall are my parents'" + "\n"
			+ "bedroom and my father's studio, but I really shouldn't be poking" + "\n"
			+ "around in either." + "\n");
	    this.rooms[1] = homeHall;
	    
	    Room centerHouse = new Room (
			"Stairs",
			"Bottom of the stairs",
			"Now that I'm on the first floor, the kitchen and dining room are in front" + "\n"
			+ "of me, the living room is to my right, and the entranceway is to my left." + "\n"
			+ "My mom and dad are already eating breakfast at the dining table. I should" + "\n"
			+ "probably eat some breakfast and grab my lunch before I head out." + "\n");
	    this.rooms[2] = centerHouse;
	    
	    Room livingRoom = new Room (
			"Living Room",
			"The Living Room",
			"My family's living room has a large coffee table with an equally large couch" + "\n"
			+ "in front of it. I often watch TV here before I go to bed, but right now" + "\n"
			+ "I should get going before my mom scolds me for wasting time." + "\n");
	    this.rooms[3] = livingRoom;
	    
	    Room diningRoom = new Room (
			"Dining Room",
			"The Dining Room",
			"Breakfast for three sits prepared on the table in front of me. I sit down at" + "\n"
			+ "the table and eat my breakfast, ocasionally chatting with my parents about" + "\n"
			+ "recent goings-on at school. My friends and I are part of a club where we meet" + "\n"
			+ "after school and play board games. The competition can get pretty heated, so I" + "\n"
			+ "always have some new, crazy story to tell." + "\n");
	    this.rooms[4] = diningRoom;
	    
	    Room kitchen = new Room (
			"Kitchen",
			"The Kitchen",
			"My family's kitchen. Though ingredients from this morning's breakfast are " + "\n"
			+ "scattered about, there is still a neatness to the arrangment. I wash my" + "\n"
			+ "plate and utensils in the sink and grab my lunch." + "\n");
		this.rooms[5] = kitchen;
	    
	    Room houseEntrance = new Room (
			"Entranceway",
			"The Entranceway",
			"The entrance to the Maebara household. There is a shoe rack on one side of the" + "\n"
			+ "door and an umbrella stand on the other." + "\n");
	    this.rooms[6] = houseEntrance;
	    
	    //sets exits for all rooms
	    //1st-North, 2nd-East, 3rd-South, 4th-West
	    bedroom.setExits(new Room[]{null, null, null, homeHall});
	    homeHall.setExits(new Room[]{null, bedroom, null, centerHouse});
	    centerHouse.setExits(new Room[]{houseEntrance, diningRoom, livingRoom, homeHall});
	    livingRoom.setExits(new Room[]{centerHouse, diningRoom, null, null});
	    diningRoom.setExits(new Room[]{kitchen, null, livingRoom, centerHouse});
	    kitchen.setExits(new Room[]{null, null, diningRoom, null});
	    houseEntrance.setExits(new Room[]{null, null, centerHouse, null});
	}
	
	public Room start() {
		return startingRoom;
	}
}
