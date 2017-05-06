package casseBrique;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Raquet implements KeyListener {
	Position positionBalle = new Position(Fenetre.WEIGHT/2, Fenetre.HEIGHT - 60);
	private int x;
	private int y;
	private char gauche = 's';
	private char droite = 'f';
	private JPanel jp;
	
	
	public Raquet(JPanel jp){
		this.jp=jp;
		this.x = positionBalle.getPositionX();
		this.y = positionBalle.getPositionY();
		
	}
	
	
	public int getPositionRaquetX(){
		return x;
	}
	
	public int getPositionRaquetY(){
		return y;
	}
	
	
	public void setPositionRaquetX(int x){
		jp.repaint();
		this.x = x;
	}
	
	public void setPositionRaquetY(int y){
		jp.repaint();
		this.y = y;
	}


	@Override
	public void keyTyped(KeyEvent e) {
			
	}


	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("------");
		System.out.println(e.getKeyChar());

		if(x >= 0 && gauche == e.getKeyChar()){
			setPositionRaquetX(x-10);
		}
		else{
			if(x <= Fenetre.WEIGHT && droite == e.getKeyChar()){
					setPositionRaquetX(x+10);
			}
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
				
	}
	


}
