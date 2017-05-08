package com.mkempf.brickbuster;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class GameLoop extends TimerTask {
	
	public Ball ball;
	public List<Brick> bricks;
	
	public GameLoop(Ball ball, List<Brick> bricks){
		this.ball = ball;
		this.bricks = bricks;
	}
	
	
	@Override
	public void run() {
		ball.moveBall();
		ball.destroyBricks(ball.getP(), bricks);
	}

}