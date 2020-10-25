package RunMummyRun;


import java.awt.Graphics;

public class MenuState extends State{

	private UImanager uiManager;

	public MenuState(Handler handler) {
		super(handler);
		uiManager=new UImanager(handler);
		handler.getMouseManager().setUImanager(uiManager);
		
		
		uiManager.addObject(new UIImageButton(340,380,120,60,Assets.btn_Start,new ClickListener(){

			public void onClick() {
				
				State.setCurrentState(handler.getGame().endlessState);
			}}));
	}

	public void tick() {
		uiManager.tick();
	}

	public void render(Graphics g) {
		g.drawImage(Assets.back2, 0, 0, 800, 600, null);
		uiManager.render(g);
	}

}
