package Snock;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	//static stuff...
	public static Tile[] tiles=new Tile[2];
	public static Tile foodTile=new FoodTile1(0);
	public static Tile rockTile=new RockTile1(1);
	
	
	//class
	protected BufferedImage texture;
	protected final int id;
	public static  int TILEWIDTH=32,TILEHEIGHT=30;
	public Tile(BufferedImage texture, int id){
		this.texture=texture;
		this.id=id;
		tiles[id]=this;
	}
	
	public int getId(){
		return id;
	}
	
	public static void tick(){
	}
	
	public void render2(Graphics g,int x,int y){
		g.drawImage(texture,GameClass.rx2,GameClass.x1, 260,50, null);
	}
	public void render(Graphics g,int x,int y){
		g.drawImage(texture,GameClass.rx,GameClass.x1, TILEWIDTH, TILEHEIGHT, null);
	}

	
	public boolean isSolid(){
		return false;
	}
	
}
