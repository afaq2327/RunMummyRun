package RunMummyRun;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	
	private boolean[] keys;
	public boolean up,down,right,left;
	public boolean aUp,aDown,aLeft,aRight;
	
	
	public void tick(){
		up=keys[KeyEvent.VK_UP];
		down=keys[KeyEvent.VK_DOWN];
		left=keys[KeyEvent.VK_LEFT];
		right=keys[KeyEvent.VK_RIGHT];
		
		aUp=keys[KeyEvent.VK_W];
		aDown=keys[KeyEvent.VK_S];
		aLeft=keys[KeyEvent.VK_A];
		aRight=keys[KeyEvent.VK_D];
	}
	
	public KeyManager(){
		keys=new boolean[256];
	}

	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()]=true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()]=false;
	}

}
