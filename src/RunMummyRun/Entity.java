package RunMummyRun;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Entity {
	protected float x;//position variables...
	protected  float y;
	protected  int width;int height;//resizing variables..
	protected Handler handler;
	
	public Entity(Handler handler,float x,float y,int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.handler=handler;
		
	}
//getters and setters...
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
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
	


	public abstract void kill();
	
}
