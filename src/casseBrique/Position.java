package casseBrique;

public class Position {
	private int x;
	private int y;

	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public int getPositionX(){
		return x;
	}
	
	public int getPositionY(){
		return y;
	}
	
	public void setPositionX(int x){
		this.x = x;
	}
	
	public void setPositionY(int y){
		this.y = y;
	}
	
	
    public boolean comparPosition(int x, int y){
    	if(this.x == x && this.y == y){
    		return true;
    	}
		return false;	
	}

}
