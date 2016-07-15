package zork;


public class Player {
	int x;
	int y;
	void move(int direction){
		switch(direction){
			case 0: y++;
			case 1: y--;
			case 2: x++;
			case 3: x--;
		}	
	}
	int getPossitionX(){
		return x;
	}
	int getPossitionY(){
		return y;
	}
}
