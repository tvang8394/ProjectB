package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fixtures.Room;

public class Main {
	
	public static void main(String[] args) {
		
		RoomManager rm = new RoomManager();
		Player player = new Player();
		
		rm.init();
		player.currentRoom = rm.startingRoom;
		System.out.println("Find the hidden treasure!");
		
		while(!player.hiddenTreasure) {
			printRoom(player);
			String direction = collectInput();
			System.out.println(direction);
			
			setCurrentRoom(direction, player);
			//System.out.println("After setCurrentRoom: " + player.currentRoom);
		}
		
		
		
	}
	
	private static void printRoom(Player player) {
		System.out.println("Current Room: " + player.currentRoom.getName() + "\n" +
	player.currentRoom.getShortDescription() + "\n" + player.currentRoom.getLongDescription());
	}
	
	private static String collectInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Where would you like to go?");
		String playerInput = input.nextLine();
		return playerInput;
	}
	
	private static void setCurrentRoom(String direction, Player player) {
		if (player.currentRoom.getExit().get(direction) == null) {
			System.out.println("Cannot go that way" + "\n");
		} else {
			player.currentRoom = player.currentRoom.getExit().get(direction);
		}
		if (player.currentRoom.getName().equals("Hidden Room")) {
			player.hiddenTreasure = true;
			System.out.println("You found the treasure!");
		}
	}
}
