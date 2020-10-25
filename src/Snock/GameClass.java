package Snock;

import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import Snock.KeyManager;
import java.util.Random;
public class GameClass implements Runnable{
	
	//variables...
	private int width;
	private int height;
	private boolean running=false;
	static int x1=0;
	int x2=-700;
	static int rx;
	static int rx2;
	
	
	
	//classes...
	private Thread thread;
	private Display display;
	private BufferStrategy bs=null;
	private Graphics g;
	private Font font=new Font("Clibri",Font.ITALIC,60);
	private BufferedImage backImage;
	private SpriteSheet sheet;
	private State gameState;
	private KeyManager keyManager;
	private Random pos = new Random();

	
	private BufferedImage foodImage;
	private BufferedImage rockImage;
	//private Random pos2 = new Random();
	//constructors..
	public GameClass(int width,int height){
		this.width=width;
		this.height=height;
		keyManager=new KeyManager();
	}
	
	//methods...
	private void init(){//initialize what to display...
		
		display=new Display("Snock",width,height);
		display.getFrame().addKeyListener(keyManager);
		backImage=ImageLoader.loadImage("/textures/Picture1.png");
		foodImage=ImageLoader.loadImage("/textures/food.png");
		rockImage=ImageLoader.loadImage("/textures/rock.png");
		Assets.init();
		gameState=new GameState(this);
		gameState.setCurrentState(gameState);
	}
	
	private void tick(){//maintain the time of displaying objects...
		if(x1>=0&&x1<=700){
			x1+=3;
			x2+=3;
		}
		else{
				x1=0;
				x2=-700;
				rx=pos.nextInt(550);
				rx2=pos.nextInt(550);
				
		}

			
		keyManager.tick();
		 if(gameState.getCurrentState()!=null){
			 gameState.getCurrentState().tick();
		 }
	}
	private void render(){//provide display....
		bs=display.getCanvas().getBufferStrategy();//creating memory...
		if(bs==null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g=bs.getDrawGraphics();//logical paint brush...
		
		
		////////Draw here..
		
		g.drawImage(backImage, 0, x2, width, height, null);
		g.drawImage(backImage, 0, x1, width, height, null);
		g.drawImage(foodImage, rx, x1, 30, 30, null);
		g.drawImage(rockImage, rx2, x1, 260, 50, null);
		
		
		
		if(gameState.getCurrentState()!=null){
			 gameState.getCurrentState().render(g);
		 }
		
		////////
		bs.show();//showing to frame what is drawn...
		g.dispose();//disposing the paint brush...
		
	}
	public void run() {//main thread method...
		//initialize everything..
		init();
		//int fps=200;
		//double timePerTick=1000000000/fps;
		//double delta=0;
		//long now;
		//long lastTime=System.nanoTime();
		//long timer=0;
		//int ticks=0;
		
		
		while(running){//main loop of the game...
			
			//now=System.nanoTime();
			//delta+=(now-lastTime)/timePerTick;
			//timer+=now-lastTime;
			//lastTime=now;
			//if(delta>=1){
				tick();
				render();
				//ticks++;
				//delta--;
			//}
			//if(timer>=1000000000){
				//System.out.println("Ticks and Frames:"+ticks);
				//ticks=0;
				//timer=0;
			//}
		}
		stop();
	}
	public KeyManager getKeyManager(){
		return keyManager;
	}
	public synchronized void start(){
		if(running) return;
		running=true;
		thread=new Thread(this);
		thread.start();
	}
	public synchronized void stop(){
		if(!running) return;
		running=false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
