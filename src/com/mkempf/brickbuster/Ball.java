package com.mkempf.brickbuster;

import java.util.List;

import javax.swing.JPanel;

public class Ball {
	Position p = new Position(Window.WIDTH/2, Window.HEIGHT - (Panel.HEIGHT_PADDEL +Panel.DIAMETER_BALLE));
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
			if (p.getX() >= Panel.WIDTH 
					&& vecteurDirectionX == 1 
					&& vecteurDirectionY == -1 ){
				vecteurDirectionX = -1;
				vecteurDirectionY = -1;
			}
			if (p.getX() >= Panel.WIDTH 
					&& vecteurDirectionX == 1 
					&& vecteurDirectionY == 1 ){
				vecteurDirectionX = -1;
				vecteurDirectionY = 1;
			}
			if(p.getX() <= 0 
					&& vecteurDirectionX == -1 
					&& vecteurDirectionY == 1 ){
				vecteurDirectionX = 1;
				vecteurDirectionY = 1;
			}
			if(p.getX() <= 0 
					&& vecteurDirectionX == -1
					&& vecteurDirectionY == -1){
				vecteurDirectionX = 1;
				vecteurDirectionY = -1;
			}
			if(p.getY() == 0 
					&& vecteurDirectionX == -1
					&& vecteurDirectionY == -1){
				vecteurDirectionX = -1;
				vecteurDirectionY = 1;
			}
			if(p.getY() == 0
					&& vecteurDirectionX == 1
					&& vecteurDirectionY == -1){
				vecteurDirectionX = 1;
				vecteurDirectionY = 1;
			}
			if( Brick.TOUCHE
					&& vecteurDirectionX == -1
					&& vecteurDirectionY == -1){
				vecteurDirectionX = -1;
				vecteurDirectionY = 1;
				Brick.TOUCHE = false;
			}
			if( Brick.TOUCHE
					&& vecteurDirectionX == 1
					&& vecteurDirectionY == -1){
				vecteurDirectionX = 1;
				vecteurDirectionY = 1;
				Brick.TOUCHE = false;
			}
			if (p.getY() == Panel.HEIGHT - Panel.HEIGHT_PADDEL - Panel.DIAMETER_BALLE
					&& (p.getX() >= paddle.p.getX() - 8 && p.getX() <= paddle.p.getX() + Panel.WIDTH_PADDEL + 2)
					&& vecteurDirectionX == 1
					&& vecteurDirectionY == 1){
				vecteurDirectionX = 1;
				vecteurDirectionY = -1;
			}			
		
			if (p.getY() == Panel.HEIGHT - Panel.HEIGHT_PADDEL - Panel.DIAMETER_BALLE
					&& ( p.getX() >= paddle.p.getX() - 8 && p.getX() <= paddle.p.getX() + Panel.WIDTH_PADDEL + 2)
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
	

	
	public void destroyBricks(Position pBall, List<Brick> bricks){
		for (int i = 0; i < bricks.size(); i++) {
			if (pBall.getX()>= bricks.get(i).getP().getX() && pBall.getX()<= bricks.get(i).getP().getX()+ Brick.WIDTH
					&& pBall.getY() >= bricks.get(i).getP().getY() - 2
					&& pBall.getY() <= bricks.get(i).getP().getY() + 2  
				){
				bricks.remove(i);
				Brick.SCORE++;
				Brick.TOUCHE = true;
				jp.repaint();
			}
		}
	
}
	
	

}
