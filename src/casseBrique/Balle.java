package casseBrique;

import javax.swing.JPanel;

public class Balle {
	Position positionBalle = new Position(Fenetre.WEIGHT/2, Fenetre.HEIGHT - 80);
	private int x;
	private int y;
	private int[] vecteurDirection = new int[2];
	private JPanel jp;
	
	
	public Balle(JPanel jp){
		this.jp=jp;
		this.x = positionBalle.getPositionX();
		this.y = positionBalle.getPositionY();
		this.vecteurDirection [0] = 0;
		this.vecteurDirection [1] = 2;
//		run();
	}
	
	
	public int getPositionBalleX(){
		return x;
	}
	
	public int getPositionBalleY(){
		return y;
	}
	
	
	public void setPositionBalleX(int x){
		jp.repaint();
		this.x = x;
	}
	
	public void setPositionBalleY(int y){
		jp.repaint();
		this.y = y;
	}
//	
//	public void run(){
//		while(x< Fenetre.WEIGHT && y< Fenetre.HEIGHT-100 ){
//			setPositionBalleX(x+ vecteurDirection[0]);
//			setPositionBalleY(y+ vecteurDirection[1]);
//			System.out.println(y);
//		}
//	}
//	
	

}
