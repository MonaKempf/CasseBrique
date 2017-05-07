package com.mkempf.brickbuster;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Paddle implements KeyListener {
	Position p = new Position(Window.WIDTH/2, Window.HEIGHT - Panel.HEIGHT_PADDEL);
	private JPanel jp;
	
	
	public Paddle(JPanel jp){
		this.jp=jp;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
			
	}

	public Position getP() {
		return p;
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if(p.getX() >= 0 && e.getKeyCode() == KeyEvent.VK_LEFT){
			p.setX(p.getX()-10);
					}
		else{
			if(p.getX() <= Window.WIDTH && e.getKeyCode() == KeyEvent.VK_RIGHT){
					p.setX(p.getX()+10);
			}
		}
	jp.repaint();
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
				
	}
	


}
