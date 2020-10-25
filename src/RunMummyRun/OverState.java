package RunMummyRun;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class OverState extends State{
	
	UImanager2 uiManager2;
	public OverState(Handler handler) {
		super(handler);
		uiManager2=new UImanager2(handler);
		handler.getMouseManager2().setUImanager2(uiManager2);
		
		
		uiManager2.addObject(new UIImageButton2(305,400,180,64,Assets.btn_Continue,new ClickListener(){

			public void onClick() {
				Money.coins=0;
				State.setCurrentState(handler.getGame().endlessState);
				
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
		
		g.drawImage(Assets.over, 0, 0, 800, 600, null);
		g.setColor(Color.WHITE);
		g.setFont(new Font(null,Font.BOLD,30));
		g.drawString("Total Coins Collected:"+Money.coins, 250, 340);
		uiManager2.render(g);
	}

}