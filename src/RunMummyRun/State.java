package RunMummyRun;

import java.awt.Graphics;

public abstract class State {
//State Manager...	
	private static State currentState=null;
	
	public static State getCurrentState() {
		return currentState;
	}
	public static void setCurrentState(State currentState) {
		State.currentState = currentState;
	}
//constructor...
	protected Handler handler;
	public State (Handler handler){
		this.handler=handler;
	}
	
//abstract...
	public abstract void tick();
	public abstract void render(Graphics g);
}
