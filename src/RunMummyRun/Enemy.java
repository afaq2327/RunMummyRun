package RunMummyRun;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Enemy extends Creature{
	
	private int shift=0;
	private Animation enemy;
	
	public Enemy(Handler handler,float x, float y,int width, int height) {
		super(handler,x, y,DEFAULT_WIDTH,DEFAULT_HEIGHT);
		enemy=new Animation(50,Assets.enemy);
		
		
		
	}
	public void tick(){
		//animation...
		enemy.tick();
		kill();
		
		if((EndlessState.x1<=-1930 && EndlessState.x1>=-4270)||(EndlessState.x1<=-7930 && EndlessState.x1>=-10270))y=280;
		else y=350;
		if(shift<=-300) shift+=1;
	}
	
	


	public void render(Graphics g) {
		
		g.drawImage(getCurrentAnimationFrame(),-200+shift+Mummy.distance,(int)y,96*2,96*2, null);
		
				
	}
	private BufferedImage getCurrentAnimationFrame(){

		return enemy.getCurrentFrame();
	}
	public void kill() {
		if(new Rectangle(-200+shift+Mummy.distance,(int)y,96*2,96*2).intersects(new Rectangle(0+Mummy.shift,380-Mummy.state2*3,50,60))){
			Mummy.power=0;
		}
	}
	
}
