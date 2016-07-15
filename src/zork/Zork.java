package zork;

import javax.swing.JOptionPane;

public class Zork {
	// vars
	public static final int NORTH = 0;
	public static final int SOUTH = 1;
	public static final int EAST = 2;
	public static final int WEST = 3;
	public static void main(String[] args) {
		Zork zork = new Zork();
		
	}
	Zork(){
		while(true){
		Player player = new Player();
		String wordEntered;
		int numberOfRooms = 10;
		Rooms[][]rooms;
		rooms = new Rooms[numberOfRooms][numberOfRooms];
		
		
		
		
		rooms[0][0] = new Rooms("nn","grg",true,false,true,true);
		rooms[1][0] = new Rooms("nn","grg",true,false,true,true);
		rooms[2][0] = new Rooms("nn","grg",true,false,true,true);
		rooms[3][0] = new Rooms("nn","grg",true,false,true,true);	
		rooms[4][0] = new Rooms("nn","grg",true,false,true,true);
		rooms[5][0] = new Rooms("nn","grg",true,false,true,true);
		rooms[6][0] = new Rooms("nn","grg",true,false,true,true);	
		rooms[7][0] = new Rooms("nn","grg",true,false,true,true);
		rooms[8][0] = new Rooms("nn","grg",true,false,true,true);		
		rooms[9][0] = new Rooms("nn","grg",true,false,true,true);		
		
		rooms[0][1] = new Rooms("nn","grg",true,false,true,true);
		rooms[1][1] = new Rooms("nn","grg",true,false,true,true);
		rooms[2][1] = new Rooms("nn","grg",true,false,true,true);
		rooms[3][1] = new Rooms("nn","grg",true,false,true,true);	
		rooms[4][1] = new Rooms("nn","grg",true,false,true,true);
		rooms[5][1] = new Rooms("nn","grg",true,false,true,true);
		rooms[6][1] = new Rooms("nn","grg",true,false,true,true);	
		rooms[7][1] = new Rooms("nn","grg",true,false,true,true);
		rooms[8][1] = new Rooms("nn","grg",true,false,true,true);		
		rooms[9][1] = new Rooms("nn","grg",true,false,true,true);			
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		wordEntered = JOptionPane.showInputDialog(rooms[player.getPossitionX()][player.getPossitionY()]);
		int desiredMoveingDirection = -1;
		if(wordEntered.equalsIgnoreCase("north") ||wordEntered.equalsIgnoreCase("n")){
			desiredMoveingDirection = NORTH;
			JOptionPane.showMessageDialog(null, "n");
		}
		if(wordEntered.equalsIgnoreCase("south") ||wordEntered.equalsIgnoreCase("s")){
			desiredMoveingDirection = SOUTH;
			JOptionPane.showMessageDialog(null, "s");

		}
		if(wordEntered.equalsIgnoreCase("east") ||wordEntered.equalsIgnoreCase("e")){
			desiredMoveingDirection = EAST;
			JOptionPane.showMessageDialog(null, "e");

		}
		if(wordEntered.equalsIgnoreCase("west") ||wordEntered.equalsIgnoreCase("w")){
			desiredMoveingDirection = WEST;
			JOptionPane.showMessageDialog(null, "w");
		}
		if(rooms[player.getPossitionX()][player.getPossitionY()].canGoInDirection(desiredMoveingDirection)){
			player.move(desiredMoveingDirection);
		}

		
		
		}
	}
}
