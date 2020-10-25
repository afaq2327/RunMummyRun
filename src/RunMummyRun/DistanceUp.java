package RunMummyRun;

import java.awt.Graphics;
import java.awt.Rectangle;

public class DistanceUp extends Creature{

	public DistanceUp(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

	public void tick() {
		kill();
		
	}

	public void render(Graphics g) {
		g.drawImage(Assets.powerup2, 11500+EndlessState.x1,410,40,40, null);
	}

	public void kill() {
		if(new Rectangle(11500+EndlessState.x1,410,40,40).intersects(new Rectangle(0+Mummy.shift,380-Mummy.state2*3,50,60))){
			Mummy.distance=0;
			}
	}

}