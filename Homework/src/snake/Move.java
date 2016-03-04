package snake;

public interface Move {
	
	String [][] fielD(int x,int y);
	
	String typeString();
	
	int typeInt();
	
	void moveSnake();

}
