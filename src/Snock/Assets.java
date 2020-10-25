package Snock;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Assets {
	
	private static int width=90,height=88;//crop the image of the following width and height respectively...
	public static BufferedImage snake,food,rock;
	
	public static void init(){
		
		SpriteSheet sheet=new SpriteSheet(ImageLoader.loadImage("/textures/snake.png"));
		SpriteSheet sheet2=new SpriteSheet(ImageLoader.loadImage("/textures/food.png"));
		SpriteSheet sheet3=new SpriteSheet(ImageLoader.loadImage("/textures/rock.png"));
		
		snake=sheet.crop(25,0,32,280);
		food=sheet2.crop(0,0,97,100);
		rock=sheet3.crop(0,0,300,100);
		
		
	}
}
