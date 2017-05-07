package com.mkempf.brickbuster;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Panel extends JPanel {

	
	public Ball balle;
	public Paddle raquet;
	public Palette palette;
	
	public Panel(JFrame jf, Palette palette){
		this.balle = new Ball(this);
		this.raquet = new Paddle(this);
		this.palette = palette;
		this.addKeyListener(this.raquet);

	}
	
	
	public void paintComponent(Graphics g){

		super.paintComponent(g);
		System.out.println("paint "+raquet.getP().getX());
	    Graphics2D g2D = (Graphics2D)g; 
	    g2D.setColor(palette.paddle);
		g2D.fillRect(raquet.getP().getX(),raquet.getP().getY(),80,20);
		g2D.setColor(palette.ball);
		g2D.fillOval(balle.getPositionBalleX(),balle.getPositionBalleY(),20,20);
		setBackground(palette.background);
		this.setVisible(true);
		
		
	}

}
