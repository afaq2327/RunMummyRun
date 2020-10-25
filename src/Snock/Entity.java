package Snock;

import java.awt.Graphics;

public abstract class Entity {
	public static float x, y;
	protected int width,height;//size of the entity...
	public Entity(float x,float y,int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	public static float getX() {
		return x;
	}

	public static void setX(float x) {
		Entity.x = x;
	}

	public static float getY() {
		return y;
	}

	public static void setY(float y) {
		Entity.y = y;
	} 

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public abstract void tick();
	public abstract void render(Graphics g);
	
}
