package com.mkempf.brickbuster;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

public class Brick {

	private Position p;
	public final static int WIDTH = 100;
	public final static int HEIGHT = 20;
	public final static int NB_COLUMNS = 8;
	public final static int NB_ROWS = 4;
	private JPanel jp;

	public Brick(JPanel jp, Position p) {
		this.jp = jp;
		this.p = p;
	}



	public Position getP() {
		return p;
	}

}
