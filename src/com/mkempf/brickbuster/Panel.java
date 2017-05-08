package com.mkempf.brickbuster;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.management.timer.TimerMBean;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.html.ListView;


public class Panel extends JPanel {
	
	public final static int WIDTH = 900;
	public final static int HEIGHT = Window.HEIGHT;
	
	public final static int DIAMETER_BALLE = 20;
	public final static int WIDTH_PADDEL = 80;
	public final static int HEIGHT_PADDEL = 20;
	
	//FPS frames per second
	private static final int FPS = 60;
	private Ball ball;
	private Paddle paddle;
	private Palette palette;
	private GameLoop gameLoop;
	private Timer t;
	public List<Brick> bricks;
	
	
	
	public Panel(JFrame jf, Palette palette){
		this.paddle = new Paddle(this);
		this.ball = new Ball(this, paddle);
		this.palette = palette;
		this.t = new Timer();
		this.addKeyListener(this.paddle);
		this.setSize(WIDTH,HEIGHT);
		this.bricks = createBricks();
		this.gameLoop = new GameLoop(ball, bricks);
		t.scheduleAtFixedRate(gameLoop,0,1000/FPS);

	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	    Graphics2D g2D = (Graphics2D)g; 
	    g2D.setColor(palette.paddle);
		g2D.fillRect(paddle.getP().getX(),paddle.getP().getY(),WIDTH_PADDEL,HEIGHT_PADDEL );
		g2D.setColor(palette.ball);
		g2D.fillOval(ball.getP().getX(),ball.getP().getY(),DIAMETER_BALLE,DIAMETER_BALLE);
		g2D.setColor(palette.brick);
		for (int i = 0; i < bricks.size(); i++) {
			g2D.fillRect(bricks.get(i).getP().getX(),bricks.get(i).getP().getY(),Brick.WIDTH, Brick.HEIGHT);
		}
		setBackground(palette.background);
		this.setVisible(true);
		
		
	}
	
	public List<Brick> createBricks() {
		List<Brick> bricks = new ArrayList<>();
		for (int i = 0; i < Brick.NB_COLUMNS; i++) {
			for (int j = 0; j < Brick.NB_ROWS; j++) {
				Position p = new Position(i * (Brick.WIDTH + 5), j * (Brick.HEIGHT +5));
				bricks.add(new Brick(this, p));
			}
		}
		return bricks;
	}
	

}
