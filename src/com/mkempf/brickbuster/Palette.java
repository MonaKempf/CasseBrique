package com.mkempf.brickbuster;

import java.awt.Color;

public class Palette {
	public Color background;
	public Color brick;
	public Color ball;
	public Color paddle;
	
	final static Palette GREEN = new Palette(
			new Color (246, 250, 247), 
			new Color (231, 234,168), 
			new Color (180,187,114),
			new Color (48,62,39)
	);

	public Palette(Color background, Color brick, Color ball, Color paddle) {
		this.background = background;
		this.brick = brick;
		this.ball = ball;
		this.paddle = paddle;
	}
	
}
