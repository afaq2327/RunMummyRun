package RunMummyRun;

import java.awt.Graphics;
import java.util.Random;

public class EndlessState extends State{
		
		private Enemy enemy;
		private Mummy mummy;
		private Money money;
		private Obstacle1 obstacle1;
		private Cutter cutter;
		private PowerUp powerup;
		private DistanceUp distanceup;
		/////
		static int x1=5;
		static int x2=12000;
		private UImanager2 uiManager2;
		public EndlessState(Handler handler) {
			super(handler);
			/////////
			enemy=new Enemy(handler,0,330,20,20);
			mummy=new Mummy(handler,0,380,20,20);
			obstacle1=new Obstacle1(handler,380,350,225,131);
			money=new Money(handler,100,400,24,24);
			cutter=new Cutter(handler,0,0,0,0);
			powerup=new PowerUp(handler,10850, 210, 50, 50);
			distanceup=new DistanceUp(handler,0,0,0,0);
			/////////
			
		
		}
	
		public void tick() {
			if(mummy.power>0){
				if(x2>=5&&x1>=-12000){
					x1-=3;
					x2-=3;
					
				}
				
				else{
						x1=5;
						x2=12000;
						
				}
	
				enemy.tick();
				mummy.tick();
				money.tick();
				obstacle1.tick();
				cutter.tick();
				powerup.tick();
				distanceup.tick();
					
					
					
			}
			
			else {
				setDefault();
			}
		}
	
		public void render(Graphics g) {
			
			if(mummy.power>0){
			g.drawImage(Assets.back, x2,0,12000,600, null);
			g.drawImage(Assets.back, x1,0, 12000, 600, null);
			obstacle1.render(g);
			enemy.render(g);
			mummy.render(g);
			money.render(g);
			cutter.render(g);
			powerup.render(g);
			distanceup.render(g);
			}
			else return;
			
		}
		
		public void setDefault(){
			Mummy.power=100;
			Mummy.state =0;
			Mummy.state2=0;//for obstacle collision...
			Mummy.shift=0;
			Mummy.die=false;
			Mummy.distance=0;
			x1=0;
			x2=12000;
			Mummy.do_jump=false;
			Mummy.do_slide=false;
			Mummy.do_run=true;
			Money.start=true;
			State.setCurrentState(handler.getGame().overState);
			
		}
	
}
