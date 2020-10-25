package Snock;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
	public boolean keys[];
	public boolean up,down,left,right;
	
	public void tick(){
		left=keys[KeyEvent.VK_LEFT];//we will get true or false...
		right=keys[KeyEvent.VK_RIGHT];//we will get true or false...
		up=keys[KeyEvent.VK_UP];
		down=keys[KeyEvent.VK_DOWN];
	}
	
	public KeyManager(){
		keys=new boolean[256];
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()]=true;
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()]=false;
	}
	
	
}
