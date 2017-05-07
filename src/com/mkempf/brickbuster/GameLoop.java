package com.mkempf.brickbuster;

import java.util.TimerTask;

public class GameLoop extends TimerTask {
	
	public Ball b;
	
	public GameLoop(Ball b){
		this.b = b;
	}
	
	
	@Override
	public void run() {
		b.moveBall();	
	}

}