package Snock;

import java.awt.Graphics;

public class Snake extends Creature{
	private GameClass game;
	public Snake(GameClass game,float x, float y) {
		super(x, y,Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
		this.game=game;
	}
	public void tick(){
		getInput();
		move();
	}
	public void getInput() {
		xMove=0;
		yMove=0;

		if(game.getKeyManager().left && x>=10){
			xMove-=speed;
		}
		if(game.getKeyManager().right && x<=540){
			xMove=speed;
		}
		if(game.getKeyManager().up && y>=400){
			yMove=-speed;
		}
		if(game.getKeyManager().down && y<=600){
			yMove=speed;
		}
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.snake,(int)x, (int)y,width,height, null);
	}

}
