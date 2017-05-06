package casseBrique;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Fenetre extends JFrame {
	
	public final static int WEIGHT = 1200;
	public final static int HEIGHT = 500;
	
	
	public Fenetre(){
		super();
		
		this.setTitle("Le Casse Brique ");
		
		this.setSize(WEIGHT, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	


	public static void main(String[] args) {
		JFrame fenetre = new Fenetre();
		Menue menue = new Menue(fenetre);
		Panneau panneau = new Panneau(fenetre);

		fenetre.getContentPane().add( menue, BorderLayout.EAST);
		fenetre.getContentPane().add( panneau, BorderLayout.CENTER);
		
//		Thread t = new Thread(new Balle(panneau));
//		t.start();

		fenetre.setVisible(true);
		panneau.requestFocus();
		panneau.setFocusable(true);

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