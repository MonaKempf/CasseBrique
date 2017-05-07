package com.mkempf.brickbuster;

import javax.swing.JPanel;

public class Ball {
	Position positionBalle = new Position(Window.WEIGHT/2, Window.HEIGHT - 80);
	private int x;
	private int y;
	private int[] vecteurDirection = new int[2];
	private JPanel jp;
	
	
	public Ball(JPanel jp){
		this.jp=jp;
		this.x = positionBalle.getX();
		this.y = positionBalle.getY();
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
