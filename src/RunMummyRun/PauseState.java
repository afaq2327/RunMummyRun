package RunMummyRun;

import java.awt.Graphics;

public class PauseState extends EndlessState{
	UImanager2 uiManager2;
	public PauseState(Handler handler) {
		super(handler);
		uiManager2=new UImanager2(handler);
		handler.getMouseManager2().setUImanager2(uiManager2);
		
		
		uiManager2.addObject(new UIImageButton2(305,400,180,64,Assets.btn_Continue,new ClickListener(){

			public void onClick() {
				
				State.setCurrentState(handler.getGame().endlessState);
				Mummy.pause=false;
			}}));
		uiManager2.addObject(new UIImageButton2(330,450,128,44,Assets.btn_Exit,new ClickListener(){

			public void onClick() {
				State.setCurrentState(handler.getGame().menuState);
			}}));
	}

	public void tick() {
		uiManager2.tick();
	}

	public void render(Graphics g) {
		g.drawImage(Assets.paused, 0, 0, 800, 600, null);
		uiManager2.render(g);
	}
}
