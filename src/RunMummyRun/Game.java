package RunMummyRun;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;



public class Game implements Runnable{

	public static boolean state2=false;
//variables...
	public String title;
	private int width,height;
	private boolean running=false;
	
//Classes...
	private Display display;
	private Thread thread;
	private BufferStrategy bs;
	private Graphics g;
	private KeyManager keyManager;
	private KeyManager2 keyManager2;
	
	private Handler handler;
	private MouseManager mouseManager;
	private MouseManager2 mouseManager2;
//States....
	
	public State menuState;
	public State pauseState;
	public State endlessState;
	public State overState;
// game methods...
	public Game(String title,int width,int height){//constructor....
		this.width=width;
		this.height=height;
		this.title=title;
		keyManager=new KeyManager();
		keyManager2=new KeyManager2();
		mouseManager=new MouseManager();	
		mouseManager2=new MouseManager2();
	}
	
	private void init(){//initialize the objects...
		display=new Display(title,width,height);
		display.getFrame().addKeyListener(keyManager2);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		
		////
		display.getFrame().addMouseListener(mouseManager2);
		display.getFrame().addMouseMotionListener(mouseManager2);
		display.getCanvas().addMouseListener(mouseManager2);
		display.getCanvas().addMouseMotionListener(mouseManager2);
		Assets.init();
		
		
		handler=new Handler(this);
		
		
		
		menuState=new MenuState(handler);
		endlessState=new EndlessState(handler);
		overState=new OverState(handler);
		pauseState=new PauseState(handler);
		State.setCurrentState(menuState);
	}
	
	private void tick(){//controls fps...
		keyManager.tick();
		keyManager2.tick();
		
		if(State.getCurrentState()!=null ){
			State.getCurrentState().tick();
		}

		
	}
	private void render(){//draw everything...
		
		/////
		
		bs=display.getCanvas().getBufferStrategy();
		if(bs==null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g=bs.getDrawGraphics();//paint brush...
		g.clearRect(0,0,width,height);//clear screen every time the function is called...
		//Draw ...
		
		g.setColor(Color.BLUE);
		g.drawRect(0,0,12000,600);
		 if(State.getCurrentState()!=null && state2==false){
			State.getCurrentState().render(g);
		}
		else return;
		//End...
		bs.show();
		g.dispose();
	}
	
	public synchronized void start(){//starts the mainloop...
		if(running) return;
		running=true;
		thread=new Thread(this);
		thread.start();
	}
	
	
	public synchronized void stop(){//stops the mainloop...
		if(!running) return;
		running=false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public KeyManager getKeymanager(){
		return keyManager;
	}
	public KeyManager2 getKeymanager2(){
		return keyManager2;
	}
	public MouseManager getMouseManager(){
		return mouseManager;
	}
	public MouseManager2 getMouseManager2(){
		return mouseManager2;
	}

	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	
//Mainloop...
	public void run() {
		init();
		
		
		int fps=200;
		double timePerTick=1000000000/fps;
		double delta=0;
		long now;
		long lastTime=System.nanoTime();
		long timer=0;
		int ticks=0;
		while(running){
			
			now=System.nanoTime();
			delta+=(now-lastTime)/timePerTick;
			timer+=now-lastTime;
			lastTime=now;
			if(delta>=1){
				tick();
				render();
				ticks++;
				delta--;
			}
			if(timer>=1000000000){
				ticks=0;
				timer=0;
			}
			
		}
		
		
		stop();
		
		
		
		
		
		
		
		
	}
}
