package RunMummyRun;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Obstacle1 extends Creature{
	//private int back=0;
	public Obstacle1(Handler handler,float x, float y,int width, int height) {
		super(handler,x, y,DEFAULT_WIDTH,DEFAULT_HEIGHT);
	
		
		
	}
	public void tick(){
		
		kill();
	}
	


	public void render(Graphics g) {
		
		///1
		 g.drawImage(Assets.obstacle2,700+EndlessState.x1,370,130,150, null);
		 g.drawImage(Assets.obstacle3,1300+EndlessState.x1,370,130,150, null);
		 
		///2
		 g.drawImage(Assets.obstacle6,2240+EndlessState.x1,90,150,350, null);
		 g.drawImage(Assets.obstacle7,2520+EndlessState.x1,90,150,350, null);
		 g.drawImage(Assets.obstacle3,3000+EndlessState.x1,300,130,150, null);
		 g.drawImage(Assets.obstacle7,3370+EndlessState.x1,90,150,350, null);
		 g.drawImage(Assets.obstacle6,3660+EndlessState.x1,90,150,350, null);
	 
		///3
		 g.drawImage(Assets.obstacle4,4620+EndlessState.x1,280,130,230, null);
		 g.drawImage(Assets.obstacle5,5020+EndlessState.x1,60,150,350, null);
		 g.drawImage(Assets.obstacle4,5450+EndlessState.x1,280,130,230, null);
		 g.drawImage(Assets.obstacle5,5930+EndlessState.x1,60,150,350, null);
		 g.drawImage(Assets.obstacle4,6410+EndlessState.x1,280,130,230, null);
		 g.drawImage(Assets.obstacle5,6830+EndlessState.x1,60,150,350, null);
		 g.drawImage(Assets.obstacle4,7300+EndlessState.x1,280,130,230, null);

		////4
		 g.drawImage(Assets.obstacle9,8350+EndlessState.x1,0,150,370, null);
		 g.drawImage(Assets.obstacle8,8930+EndlessState.x1,250,150,200, null);
		 g.drawImage(Assets.obstacle9,9480+EndlessState.x1,0,150,370, null);
		 
		////5
		 g.drawImage(Assets.obstacle2,11020+EndlessState.x1,370,130,150, null);


		 
	}

	public void kill() {
		///1
		if(new Rectangle(700+EndlessState.x1,370,130,150).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
//		
		else if(new Rectangle(1300+EndlessState.x1,370,130,150).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		///2
		if(new Rectangle(2240+EndlessState.x1,90,150,350).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
//		
		else if(new Rectangle(2520+EndlessState.x1,90,150,350).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		else if(new Rectangle(3000+EndlessState.x1,300,130,150).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
//		
		else if(new Rectangle(3370+EndlessState.x1,90,150,350).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		///3
		if(new Rectangle(3660+EndlessState.x1,90,150,350).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		
		else if(new Rectangle(4620+EndlessState.x1,280,130,230).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		else if(new Rectangle(5020+EndlessState.x1,60,150,350).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		
		else if(new Rectangle(5450+EndlessState.x1,280,130,230).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
//		////4
		if(new Rectangle(5930+EndlessState.x1,60,150,350).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		
		else if(new Rectangle(6410+EndlessState.x1,280,130,230).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		else if(new Rectangle(6830+EndlessState.x1,60,150,350).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
//	
		else if(new Rectangle(7300+EndlessState.x1,280,130,230).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		////5
		if(new Rectangle(8350+EndlessState.x1,0,150,370).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
//		
		if(new Rectangle(8930+EndlessState.x1,250,150,200).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		else if(new Rectangle(9480+EndlessState.x1,0,150,370).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		
		else if(new Rectangle(11020+EndlessState.x1,370,130,150).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			Mummy.power-=1;
		}
		
		
		
	}
	
}


