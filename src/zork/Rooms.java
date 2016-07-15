package zork;

import javax.swing.JOptionPane;

public class Rooms {

	public static final int NORTH = 0;
	public static final int SOUTH = 0;
	public static final int EAST = 0;
	public static final int WEST = 0;
String name;
String message;

boolean[] possableMovingDirections = new boolean[4];
	Rooms(String name, String message,boolean north,boolean south,boolean east,boolean west){
		this.name = name;
		this.message = message;
		possableMovingDirections[NORTH] = north;
		possableMovingDirections[SOUTH] = south;
		possableMovingDirections[EAST] = east;
		possableMovingDirections[WEST] = west;

	}
	void displayMessage(){
		JOptionPane.showMessageDialog(null, message);
	}
	String getMessage(){
		return message;
	}
	boolean canGoInDirection(int direction){
		if(possableMovingDirections[direction] == true){
			return true;
		}
		else{
			JOptionPane.showMessageDialog(null, "you can not move in this direction!");
			return false;
		}
	}
}
