package com.mkempf.brickbuster;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener{
	
	public final static int WIDTH = Window.WIDTH - Panel.WIDTH;
	public final static int HEIGHT = Window.HEIGHT;
	
	public Menu(JFrame jf){
		
		JButton boutonGO = new JButton("GO");
		boutonGO.setFocusable(false);
		JButton boutonSTOP = new JButton("STOP");
		boutonSTOP.setFocusable(false);
		JLabel score = new JLabel("score");
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setMaximumSize(this.getPreferredSize());
		this.add(boutonGO);
		this.add(boutonSTOP);
		this.add(score);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//	      animated = true;
//
//	      t = new Thread(new PlayAnimation());
//
//	      t.start();
//
//	      bouton.setEnabled(false);
//
//	      bouton2.setEnabled(true);
	}

}
