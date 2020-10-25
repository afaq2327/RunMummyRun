package RunMummyRun;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener,MouseMotionListener{
	
	private boolean leftPressed,rightPressed;
	private int mouseX,mouseY;
	private UImanager uiManager;
	
	public MouseManager(){
		
	}
	public void setUImanager(UImanager uiManager){
		this.uiManager=uiManager;
	}
	public boolean isLeftPressed(){
		return leftPressed;
	}
	public boolean isRightPressed(){
		return rightPressed;
	}
	
	public int getMouseX(){
		return mouseX;
	}
	public int getMouseY(){
		return mouseY;
	}

	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY=e.getY();
		if(uiManager!=null) uiManager.onMouseMove(e);
	}

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) leftPressed=true;
		else if(e.getButton()==MouseEvent.BUTTON3) rightPressed=true;
	}

	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) leftPressed=false;
		else if(e.getButton()==MouseEvent.BUTTON3) rightPressed=false;
		
		if(uiManager!=null) uiManager.onMouseRelease(e);
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

}
