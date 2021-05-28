package game;

import fixtures.Room;
//import fixtures.Door;

public class RoomManager {
	protected Room startingRoom;
	
	//creates all rooms and other objects needed for game
	public void init() {
	    Room bedroom = new Room (
			"Bedroom",
			"My Bedroom",
			"Not much to talk about here. I've got my bed, a small desk, and my school" + "\n"
			+ "uniform hanging on a rack in the corner of the room. The morning sun shines" + "\n"
			+ "through the window, urging me to hurry and get prepared for school, so I yank" + "\n"
			+ "my uniform off the rack and get changed." + "\n");
	    
	    this.startingRoom = bedroom;
	    
	    Room homeHall = new Room (
			"Hallway",
			"Upstairs Hallway",
			"This is the hallway connecting all the rooms on the second floor of my" + "\n"
			+ "family's house. My room is on the east side of the house, along with" + "\n"
			+ "the stairs to the first floor. Further down the hall are my parents'" + "\n"
			+ "bedroom and my father's studio, but I really shouldn't be poking" + "\n"
			+ "around in either." + "\n");
	    
	    Room centerHouse = new Room (
			"1st-floor Center",
			"Center of the 1st Floor",
			"I'm on the first floor, the kitchen and dining room are in front of me," + "\n"
			+ "the living room is to my right, and the entranceway is to my left." + "\n"
			+ "My mom and dad would usually be eating breakfast at the dining table" + "\n"
			+ " around this time, but they're away on business today. I can go without" + "\n"
			+ "breakfast for today, but I should grab the lunch my mom prepared from the" + "\n"
			+ "fridge before I head out." + "\n");
	    
	    Room livingRoom = new Room (
			"Living Room",
			"The Living Room",
			"My family's living room has a large coffee table with an equally large couch" + "\n"
			+ "in front of it. I often watch TV here before I go to bed, but right now" + "\n"
			+ "I should get going before I end up being late to school." + "\n");
	    
	    Room diningRoom = new Room (
			"Dining Room",
			"The Dining Room",
			"Usually, there would be Breakfast for three prepared on the table in front of" + "\n"
			+ "me. I would sit down at the table and eat my breakfast, chatting with my parents" + "\n"
			+ "about recent goings-on at school. My friends and I are part of a club where we" + "\n"
			+ "meet after school and play board games and such. The competition can get pretty" + "\n"
			+ "heated, so I almost always have some new, crazy story to tell at dinner." + "\n");
	    
	    Room kitchen = new Room (
			"Kitchen",
			"The Kitchen",
			"My family's kitchen. Usually the counters would be cluttered with preparations for" + "\n"
			+ "breakfast. Today, however, they're neat and tidy, as my mom likes to keep them" + "\n"
			+ "when the kitchen's not in use." + "\n");
	    
	    Room houseEntrance = new Room (
			"Entranceway",
			"The Entranceway",
			"The entrance to the Maebara household. There is a shoe rack on one side of the" + "\n"
			+ "door and an umbrella stand on the other." + "\n");
	    
	    Room outsideHouse = new Room(
    		"Home Entrance",
    		"Outside My House",
    		"Empty fields stretch out before me, ocasionally dotted by other households." + "\n"
    		+ "A gravel road runs past my house to the spot where I meet up with Rena and" + "\n"
    		+ "Mion as we walk to school. I should probably hurry to meet up with them." + "\n");
	    
	    Room meetupSpot = new Room(
    		"Meetup Spot",
    		"Our Meetup Spot",
    		"I meet up with Rena and Mion, and we walk on toward's school together," + "\n"
    		+ "joking around all the while." + "\n");
	    
	    Room schoolEntrance = new Room(
    		"School Entrance",
    		"In Front of the School Grounds",
    		"The school we attend is actually a building built for the forestry service," + "\n"
    		+ "only used as a school for the small amount of students that attend here" + "\n"
			+ "in the countryside." + "\n");
	    
	    Room schoolHall = new Room(
    		"School Hallway",
    		"The School's Hallway",
    		"This is the school's main hallway, with doors to our classroom, the teachers'" + "\n"
    		+ "office, and a single-person bathroom" + "\n");
	    
	    Room classroom = new Room(
    		"Classroom",
    		"The Classroom",
    		"The only classroom in our school. Because of the small amount of students that" + "\n"
    		+ "this deep in the countryside, kids from all grades are all packed into this" + "\n"
    		+ "one classroom. Because there's not many kids around my age, I usually end" + "\n"
    		+ "up doing self study and helping the younger kids with their schoolwork." + "\n");
	    
	    Room teachersOffice = new Room(
    		"Teacher's Office",
    		"Ms. Chie's Office",
    		"An office with two desks in it, one for our teacher and the other for the" + "\n"
    		+ "principal. They're the school's only employees, since less than a couple" + "\n"
			+ "dozen students are enrolled." + "\n");
	    
	    Room bathroom = new Room(
    		"Bathroom",
    		"The School Bathroom",
    		"A single-person bathroom. This is the only one in the school." + "\n");
	    
	    //Door bedroomDoor = new Door("","","");
	    //Door houseEntryDoor = new Door("","","");
	    //Door schoolEntryDoor = new Door("","","");
	    //Door officeDoor = new Door("","","");
	    //Door bathroomDoor = new Door("","","");
	    //TrapDoor classDoor = new TrapDoor("","","","");
	    
	    //strings to make adding exits easier
	    String n = "north";
	    String e = "east";
	    String s = "south";
	    String w = "west";
	    
	    //sets exits for all rooms
	    bedroom.addExit(homeHall, w);
	    
	    homeHall.addExit(bedroom, e);
	    homeHall.addExit(centerHouse, w);
	    
	    centerHouse.addExit(livingRoom, n);
	    centerHouse.addExit(homeHall, e);
	    centerHouse.addExit(houseEntrance, s);
	    centerHouse.addExit(diningRoom, w);

	    livingRoom.addExit(centerHouse, s);
	    livingRoom.addExit(diningRoom, w);
	    
	    diningRoom.addExit(livingRoom, n);
	    diningRoom.addExit(centerHouse, e);
	    diningRoom.addExit(kitchen, s);
	    
	    kitchen.addExit(diningRoom, n);
	    
	    houseEntrance.addExit(centerHouse, n);
	    houseEntrance.addExit(outsideHouse, s);
	    
	    outsideHouse.addExit(houseEntrance, n);
	    outsideHouse.addExit(meetupSpot, s);
	    
	    meetupSpot.addExit(outsideHouse, n);
	    meetupSpot.addExit(schoolEntrance, s);
	    
	    schoolEntrance.addExit(meetupSpot, n);
	    schoolEntrance.addExit(schoolHall, s);
	    
	    schoolHall.addExit(schoolEntrance, n);
	    schoolHall.addExit(teachersOffice, e);
	    schoolHall.addExit(bathroom, s);
	    schoolHall.addExit(classroom, w);
	    
	    teachersOffice.addExit(schoolHall, w);
	    
	    bathroom.addExit(schoolHall, n);
	    
	    classroom.addExit(schoolHall, e);
	}
	
	public Room start() {
		return startingRoom;
	}
}
