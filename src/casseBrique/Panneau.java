package casseBrique;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Panneau extends JPanel {

	
	public Balle balle;
	public Raquet raquet; 
	
	public Panneau(JFrame jf){
		balle = new Balle(this);
		raquet = new Raquet(this);
		this.addKeyListener(this.raquet);

	}
	
	
	public void paintComponent(Graphics g){

		super.paintComponent(g);
		System.out.println("paint "+raquet.getPositionRaquetX());
	    Graphics2D g2D = (Graphics2D)g; 
	    g2D.setColor(Color.yellow);
		g2D.fillRect(raquet.getPositionRaquetX(),raquet.getPositionRaquetY(),80,20);
		g2D.setColor(Color.red);
		g2D.fillOval(balle.getPositionBalleX(),balle.getPositionBalleY(),20,20);
		setBackground(Color.white);
		this.setVisible(true);
		
		
	}

}
