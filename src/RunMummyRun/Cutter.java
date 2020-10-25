package RunMummyRun;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Cutter extends Creature{

	public Cutter(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

	public void tick() {
		kill();
	}

	public void render(Graphics g) {
		g.drawImage(Assets.cutter,7700+EndlessState.x1*2,390,100,100, null);
	}

	public void kill() {
		if(new Rectangle(7750+EndlessState.x1*2,410,100,100).intersects(new Rectangle(0+Mummy.shift-Mummy.distance,380-Mummy.state2*3,50,60))){
			Mummy.power-=1;
			}
	}

}
