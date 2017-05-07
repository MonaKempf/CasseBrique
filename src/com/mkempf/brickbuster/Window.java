package com.mkempf.brickbuster;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Window extends JFrame {
	
	public final static int WEIGHT = 1200;
	public final static int HEIGHT = 500;
	
	
	public Window(){
		super();
		
		this.setTitle("Le Casse Brique ");
		
		this.setSize(WEIGHT, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	


	public static void main(String[] args) {
		JFrame fenetre = new Window();
		Menu menue = new Menu(fenetre);
		Panel panneau = new Panel(fenetre,Palette.GREEN);

		fenetre.getContentPane().add( menue, BorderLayout.EAST);
		fenetre.getContentPane().add( panneau, BorderLayout.CENTER);
		
//		Thread t = new Thread(new Balle(panneau));
//		t.start();

		panneau.requestFocus();
		panneau.setFocusable(true);
		fenetre.setVisible(true);

	}

}



//
//JPanel drawingArea = new JPanel();
//
//drawingArea.setPreferredSize(new Dimension(400, 0));


//private void run(){
//for(int i = 0; i < WEIGHT; i++){
//	int x = balle.getPositionBalleX();
//	int y = balle.getPositionBalleY();
//	x++;
//	y++;
//	balle.setPositionBalleX(x);
//	balle.setPositionBalleY(y);
//	balle.repaint();
//	
//}
//
//}