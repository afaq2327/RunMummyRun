package RunMummyRun;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class UImanager2 {
	private Handler handler;
	private ArrayList<UIobject2> objects;
	public UImanager2(Handler handler){
		this.handler=handler;
		objects=new ArrayList<UIobject2>();
	}
	
	public void tick(){
		for(UIobject2 o: objects) o.tick();
	}
	public void render(Graphics g){
		for(UIobject2 o: objects) o.render(g);
	}
	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public ArrayList<UIobject2> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<UIobject2> objects) {
		this.objects = objects;
	}

	public void onMouseMove(MouseEvent e){
		for(UIobject2 o: objects) o.onMouseMove(e);
	}
	public void onMouseRelease(MouseEvent e){
		for(UIobject2 o: objects) o.onMouseRelease(e);
	}
	
	public void addObject(UIobject2 o){
		objects.add(o);
	}
	public void removeObject(UIobject2 o){
		objects.remove(o);
	}
}
