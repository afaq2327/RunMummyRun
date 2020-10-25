package Snock;

import java.awt.Color;
import java.awt.Graphics;

public class GameState extends State {
	private Snake snake;
	public GameState(GameClass game){
		super(game);
		snake=new Snake(game,260,600);
	}
	
	protected void tick() {
		snake.tick();
	}
	
	protected void render(Graphics g) {
		snake.render(g);
		Tile.tiles[0].render(g, 20, 20);
		Tile.tiles[1].render2(g, 200, 200);
		
		
	}
	
	
}
