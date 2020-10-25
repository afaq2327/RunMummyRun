package Snock;

import java.awt.Graphics;

public abstract class State {
	//state manager...
	public static State currentState=null;
	protected static GameClass game;
	
	public State(GameClass game){
		this.game=game;
	}
	
	public static State getCurrentState() {
		return currentState;
	}
	public static void setCurrentState(State state) {
		currentState =state;
	}
	//abstract classes...
	protected abstract void tick();
	protected abstract void render(Graphics g);

	
}
