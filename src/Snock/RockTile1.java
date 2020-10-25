package Snock;

import java.awt.Graphics;

public class RockTile1 extends Tile{

		public RockTile1(int id){
			super(Assets.rock,id);
		}
		
		public boolean isSolid(){
			return true;
		}
		
}
