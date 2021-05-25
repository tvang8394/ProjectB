package game;

import java.util.ArrayList;
import java.util.List;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	List<Room> roomList = new ArrayList<Room>();
	
	public List<Room> getRoomList() {
		return roomList;
	}

	
	public void init() {
		
		Room livingRoom = new Room("Living Room", "Center of the house", "Wide open space to the north leads to the dining room"
				+ "\n" + "Look to the west and a set of stair case leads you to the second floor" + "\n"
				);
		
		
		Room secondFloor = new Room("Second Floor", "Large vanity ready to use", "Vanity area with a large mirror" + 
		"\n" + "Head west to enter into the storage room" + "\n" +
				"Head south to return to the living room" + "\n" +
		"Heading east will lead you to a dead end");
		
		Room diningRoom = new Room("Dining Room", "Dining room connected to the kitchen","Open kitchen concept when you step in you'll see no other rooms connected to this area");
		Room storageRoom = new Room("Storage Room", "Lots of bonsai trees and amynastye rocks", "The storeage room is full and pack with a varity of items. You look to the north and see a hidden door.");
		
		Room hiddenRoom = new Room("Hidden Room", "Lots of gold and silver", "You're RICH! You've reached the pot of gold. To the north you see an escape hatch and arrive at the living room.");
		
		livingRoom.setExit("north", diningRoom);
		livingRoom.setExit("west", secondFloor);
		
		diningRoom.setExit("south", livingRoom);
		
		secondFloor.setExit("east", livingRoom);
		secondFloor.setExit("west", storageRoom);
		
		storageRoom.setExit("north", hiddenRoom);
		storageRoom.setExit("east",	 secondFloor);
		
		hiddenRoom.setExit("north", livingRoom);
		hiddenRoom.setExit("south", storageRoom);
		
		roomList.add(livingRoom); // 0
		roomList.add(secondFloor);// 1
		roomList.add(diningRoom); // 2
		roomList.add(hiddenRoom); // 3 
		roomList.add(storageRoom);// 4
		
		
		this.startingRoom = livingRoom;
	}
	
	
	
	
	
	
}
