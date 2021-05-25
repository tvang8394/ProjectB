package fixtures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room extends Fixture {
	
	
	Map<String, Room> exits = new HashMap<String, Room>();
	
	// Constructor
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		 
	}

	
	public Map<String, Room> getExit() {
		return exits;
	}

	public void setExit(String direction, Room room) {
		if (direction == null || room == null) {
			System.out.println("Direction or room cannot be null");
			return;
		}
		this.exits.put(direction,  room);
	}
	
	

	

}
