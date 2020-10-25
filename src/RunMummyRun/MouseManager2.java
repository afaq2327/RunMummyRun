package RunMummyRun;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager2 implements MouseListener,MouseMotionListener{
	
	private boolean leftPressed,rightPressed;
	private int mouseX,mouseY;
	private UImanager2 uiManager2;
	
	public MouseManager2(){
		
	}
	public void setUImanager2(UImanager2 uiManager2){
		this.uiManager2=uiManager2;
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
		if(uiManager2!=null) uiManager2.onMouseMove(e);
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
		
		if(uiManager2!=null) uiManager2.onMouseRelease(e);
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

}


