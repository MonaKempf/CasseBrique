package com.mkempf.brickbuster;

import javax.swing.JPanel;

public class Ball {
	Position p = new Position(Window.WIDTH/2, Window.HEIGHT - 80);
	private JPanel jp;
	private int vecteurDirectionX = 1;
	private int vecteurDirectionY = -1;
	private int SPEED = 4;
	private Paddle paddle ;
	
	
	public Ball(JPanel jp, Paddle paddle ){
		this.jp=jp;
		this.paddle = paddle;
	}
	
	public Position getP() {
		return p;
	}
	
	

	
	public void moveBall(){
		System.out.println();
		//if(p.getX()< Panel.WIDTH && p.getY() < Panel.HEIGHT 
			//	&& p.getX()> 0 && p.getY() > 0){
			if (p.getX() >= Panel.WIDTH - Panel.DIAMETER_BALLE
					&& vecteurDirectionX == 1 
					&& vecteurDirectionY == -1 ){
				vecteurDirectionX = -1;
				vecteurDirectionY = -1;
			}
			if (p.getX() >= Panel.WIDTH - Panel.DIAMETER_BALLE
					&& vecteurDirectionX == 1 
					&& vecteurDirectionY == 1 ){
				vecteurDirectionX = -1;
				vecteurDirectionY = 1;
			}
			if(p.getX() <= 0 + Panel.DIAMETER_BALLE
					&& vecteurDirectionX == -1 
					&& vecteurDirectionY == 1 ){
				vecteurDirectionX = 1;
				vecteurDirectionY = 1;
			}
			if(p.getX() <= 0 + Panel.DIAMETER_BALLE
					&& vecteurDirectionX == -1
					&& vecteurDirectionY == -1){
				vecteurDirectionX = 1;
				vecteurDirectionY = -1;
			}
			if(p.getY() <= 0 + Panel.DIAMETER_BALLE
					&& vecteurDirectionX == -1
					&& vecteurDirectionY == -1){
				vecteurDirectionX = -1;
				vecteurDirectionY = 1;
			}
			if(p.getY() <= 0 + Panel.DIAMETER_BALLE
					&& vecteurDirectionX == 1
					&& vecteurDirectionY == -1){
				vecteurDirectionX = 1;
				vecteurDirectionY = 1;
			}
			
			if (p.getY() >= Panel.HEIGHT - Panel.HEIGHT_PADDEL - Panel.DIAMETER_BALLE
					&& (p.getX() >= paddle.p.getX() - 2 && p.getX() <= paddle.p.getX() + Panel.WIDTH_PADDEL + 2)
					&& vecteurDirectionX == 1
					&& vecteurDirectionY == 1){
				vecteurDirectionX = 1;
				vecteurDirectionY = -1;
			}			
		
			if (p.getY() == Panel.HEIGHT - Panel.HEIGHT_PADDEL - Panel.DIAMETER_BALLE
					&& ( p.getX() >= paddle.p.getX() - 2 && p.getX() <= paddle.p.getX() + Panel.WIDTH_PADDEL + 2)
					&& vecteurDirectionX == -1
					&& vecteurDirectionY == 1){
				vecteurDirectionX = -1;
				vecteurDirectionY = -1;
			}	
			if (p.getY() > Panel.HEIGHT - Panel.HEIGHT_PADDEL - Panel.DIAMETER_BALLE ){
				jp.setVisible(false);
			}
			
		p.setX(p.getX()+ vecteurDirectionX * SPEED);
		p.setY(p.getY()+ vecteurDirectionY * SPEED);
	
		jp.repaint();
	}
	
	

}
