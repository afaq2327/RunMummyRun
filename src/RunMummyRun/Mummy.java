package RunMummyRun;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Mummy extends Creature{
	static int power=100;
	static boolean  pause=false;
	public static boolean do_jump=false;
	public static boolean do_slide=false;
	public static boolean do_run=true;
	static int state =0;
	static int state2=0;//for obstacle collision...
	static int shift=0;
	static boolean die=false;
	public static int distance=0;
	int yp=20;
	private Animation mummy,jump,slide, die2;
	public Mummy(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		mummy=new Animation(15,Assets.mummy);
		jump=new Animation(100,Assets.jump);
		slide=new Animation(100,Assets.slide);
		die2=new Animation(50,Assets.die);
	}

	public void tick() {
		if(!pause){
			if(handler.getGame().getKeymanager2().pause){
				pause=true;
			}
			if(pause){
				State.setCurrentState(handler.getGame().pauseState);
			}
			if(handler.getGame().getKeymanager2().up){
				do_jump=true;
				do_slide=false;
				do_run=false;
				
			}
			if(handler.getGame().getKeymanager2().up && (int)y<380&&(int)y>200){
				state=0;
			}
			else if(handler.getGame().getKeymanager2().down && y<=550){
				if((EndlessState.x1<=-1530 && EndlessState.x1>=-3810)||(EndlessState.x1<=-7530 && EndlessState.x1>=-9810)){
				y=330;
				state2-=20;}
				else y=380;
				do_slide=true;
				do_jump=false;
				do_run=false;
				distance+=1;
				
			}
			if(do_jump&& state<=100){
				jump.tick();
				state+=1;
				
				
				if((EndlessState.x1<=-1530 && EndlessState.x1>=-3810)||(EndlessState.x1<=-7530 && EndlessState.x1>=-9810)){
					if(state<=55){
						y-=3;
						state2+=1;
						}
					else{
						y+=3;
						state2-=1;
					}
				}
				else{
					if(state<=45){
						y-=3;
						state2+=1;
					}
						
					else {
						y+=3;
						state2-=1;
					}
				}
				
			}
			else if(do_slide && state<=100){
				slide.tick();
				state+=1;
				state2=-30;
				if(handler.getGame().getKeymanager2().down && state2==-50){
					state=0;
					}
			}
			else{
				mummy.tick();
				state=0;
				state2=0;
				do_jump=false;
				do_slide=false;
				if((EndlessState.x1<=-1530 && EndlessState.x1>=-3810)||(EndlessState.x1<=-7530 && EndlessState.x1>=-9810)){
					y=330;
					state2=15;
				}else y=380;
				
			}
			
			hitCorner();
			if(shift<=300) shift+=1;
			
			if(die){
				die2.tick();
				
			}
			kill();
		}
		else return;
		
	}
	

	public void render(Graphics g) {
		if(!pause){	
			if(!die){
				g.drawImage(getCurrentAnimationFrame(),(int)( x)+shift ,(int) (y),80,120, null);
				g.drawImage(Assets.heart, 150, 10, 50, 50, null);
				g.setColor(Color.RED);
				g.fillRect(220, 20, power,20);
				g.setColor(Color.BLACK);
				g.setFont(new Font(null,Font.BOLD,30));
				g.drawString("Press Left Arrow Key To Pause", 340, 40);
			}
			
			else g.drawImage(getCurrentAnimationFrame(),380,380,160,62, null);
		}
		else return;
		
	}
	private BufferedImage getCurrentAnimationFrame(){
		if(!die){
			if (do_jump){
				return jump.getCurrentFrame();
			}
			else if(do_slide){
				return slide.getCurrentFrame();
			}
			else return mummy.getCurrentFrame();
		}
		
		else return die2.getCurrentFrame();
		
	}

	public void hitCorner(){
		if(((int)y==380)&&((EndlessState.x1<=-1530 && EndlessState.x1>=-3810)||(EndlessState.x1<=-7530 && EndlessState.x1>=-9810))){
			power-=1;
		}
		
	}

	public void kill() {
		if (power==0) die =true;
	}
	

}
