package RunMummyRun;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager2 implements KeyListener{
	private boolean keys[];
	public boolean up,down,pause;
	
	public void tick(){
		up=keys[KeyEvent.VK_UP];
		down=keys[KeyEvent.VK_DOWN];
		pause=keys[KeyEvent.VK_LEFT];
		
	}
	public KeyManager2(){
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
