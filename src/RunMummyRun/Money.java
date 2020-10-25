package RunMummyRun;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Money extends Creature{
	public static int coins=0;
	public static boolean start=true;
	public boolean Display[]=new boolean[50];
	public Money(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

	public void tick() {
		if (start) coins=0;
		if(EndlessState.x1>=-300){
			reset();
			start=false;
		}
		kill();
		
	}

	public void render(Graphics g) {
		
		g.drawImage(Assets.money, 10,10,40,40,null);
		g.setColor(Color.WHITE);
		g.setFont(new Font(null,Font.BOLD,30));
		g.drawString(""+coins, 60, 40);
		/////
		if (Display[0]){
			g.drawImage(Assets.money, 1100+EndlessState.x1,450,50,50,null);
		}
		if (Display[1]){
			g.drawImage(Assets.money, 1200+EndlessState.x1,450,50,50,null);
		}
		if (Display[2]){
			g.drawImage(Assets.money, 1250+EndlessState.x1,350,50,50,null);
		}
		if (Display[3]){
			g.drawImage(Assets.money, 1350+EndlessState.x1,300,50,50,null);
		}
		if (Display[4]){
			g.drawImage(Assets.money, 1450+EndlessState.x1,350,50,50,null);
		}
		
		if (Display[5]){
			g.drawImage(Assets.money, 1500+EndlessState.x1,450,50,50,null);
		}
		if (Display[6]){
			g.drawImage(Assets.money, 1600+EndlessState.x1,450,50,50,null);
		}
		/////
		if (Display[7]){
			g.drawImage(Assets.money, 2430+EndlessState.x1,350,50,50,null);
		}
		if (Display[8]){
			g.drawImage(Assets.money, 2750+EndlessState.x1,350,50,50,null);
		}
		if (Display[9]){
			g.drawImage(Assets.money, 2850+EndlessState.x1,350,50,50,null);
		}
		if (Display[10]){
			g.drawImage(Assets.money, 2900+EndlessState.x1,250,50,50,null);
		}
		if (Display[11]){
			g.drawImage(Assets.money, 3000+EndlessState.x1,200,50,50,null);
		}
		if (Display[12]){
			g.drawImage(Assets.money, 3100+EndlessState.x1,250,50,50,null);
		}
		if (Display[13]){
			g.drawImage(Assets.money, 3150+EndlessState.x1,350,50,50,null);
		}
		if (Display[14]){
			g.drawImage(Assets.money, 3250+EndlessState.x1,350,50,50,null);
		}
		if (Display[15]){
			g.drawImage(Assets.money, 3550+EndlessState.x1,350,50,50,null);
		}
		if (Display[16]){
			g.drawImage(Assets.money, 4350+EndlessState.x1,450,50,50,null);
		}
		if (Display[17]){
			g.drawImage(Assets.money, 4670+EndlessState.x1,230,50,50,null);
		}
		if (Display[19]){
			g.drawImage(Assets.money, 4850+EndlessState.x1,450,50,50,null);
		}
		if (Display[20]){
			g.drawImage(Assets.money, 5280+EndlessState.x1,450,50,50,null);
		}
		if (Display[21]){
			g.drawImage(Assets.money, 5490+EndlessState.x1,230,50,50,null);
		}
		if (Display[22]){
			g.drawImage(Assets.money, 5750+EndlessState.x1,450,50,50,null);
		}
		if (Display[23]){
			g.drawImage(Assets.money, 6250+EndlessState.x1,450,50,50,null);
		}
		if (Display[24]){
			g.drawImage(Assets.money, 6450+EndlessState.x1,230,50,50,null);
		}
		if (Display[25]){
			g.drawImage(Assets.money, 6670+EndlessState.x1,450,50,50,null);
		}
		if (Display[26]){
			g.drawImage(Assets.money, 7100+EndlessState.x1,450,50,50,null);
		}
		if (Display[27]){
			g.drawImage(Assets.money, 7350+EndlessState.x1,230,50,50,null);
		}
		if (Display[28]){
			g.drawImage(Assets.money, 7700+EndlessState.x1,450,50,50,null);
		}
		if (Display[29]){
			g.drawImage(Assets.money, 8400+EndlessState.x1,350,50,50,null);
		}
		if (Display[30]){
			g.drawImage(Assets.money, 8750+EndlessState.x1,350,50,50,null);
		}
		if (Display[31]){
			g.drawImage(Assets.money, 8850+EndlessState.x1,350,50,50,null);
		}
		if (Display[32]){
			g.drawImage(Assets.money, 8900+EndlessState.x1,250,50,50,null);
		}
		if (Display[33]){
			g.drawImage(Assets.money, 9000+EndlessState.x1,200,50,50,null);
		}
		if (Display[34]){
			g.drawImage(Assets.money, 9100+EndlessState.x1,250,50,50,null);
		}
		if (Display[35]){
			g.drawImage(Assets.money, 9150+EndlessState.x1,350,50,50,null);
		}
		if (Display[36]){
			g.drawImage(Assets.money, 9250+EndlessState.x1,350,50,50,null);
		}
		if (Display[37]){
			g.drawImage(Assets.money, 9530+EndlessState.x1,350,50,50,null);
		}
		if (Display[38]){
			g.drawImage(Assets.money, 10800+EndlessState.x1,450,50,50,null);
		}if (Display[39]){
			g.drawImage(Assets.money, 10900+EndlessState.x1,450,50,50,null);
		}
		if (Display[40]){
			g.drawImage(Assets.money, 10950+EndlessState.x1,350,50,50,null);
		}
		if (Display[41]){
			g.drawImage(Assets.money, 11050+EndlessState.x1,300,50,50,null);
		}
		if (Display[42]){
			g.drawImage(Assets.money, 11150+EndlessState.x1,350,50,50,null);
		}
		if (Display[43]){
			g.drawImage(Assets.money, 11250+EndlessState.x1,450,50,50,null);
		}
		if (Display[44]){
			g.drawImage(Assets.money, 11350+EndlessState.x1,450,50,50,null);
		}
		
		
		
	}

	public void kill() {
		if(new Rectangle(1100+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[0]=false;
		}
		else if(new Rectangle(1200+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[1]=false;
		}
		else if(new Rectangle( 1250+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[2]=false;
		}
		else if(new Rectangle(1350+EndlessState.x1,300,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[3]=false;
		}
		else if(new Rectangle(1450+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[4]=false;
		}
		else if(new Rectangle( 1500+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[5]=false;
		}
		else if(new Rectangle( 1600+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[6]=false;
		}
		else if(new Rectangle(2430+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[7]=false;
		}
		else if(new Rectangle(2750+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,30,90))){
			coins+=1;
			Display[8]=false;
		}
		else if(new Rectangle(2850+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[9]=false;
		}
		else if(new Rectangle(2900+EndlessState.x1,250,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[10]=false;
		}
		else if(new Rectangle(3000+EndlessState.x1,200,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[11]=false;
		}
		else if(new Rectangle(3100+EndlessState.x1,250,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[12]=false;
		}
		else if(new Rectangle(3150+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[13]=false;
		}
		else if(new Rectangle(3250+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[14]=false;
		}
		else if(new Rectangle(3550+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[15]=false;
		}
		else if(new Rectangle(4350+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[16]=false;
		}
		else if(new Rectangle(4670+EndlessState.x1,230,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[17]=false;
		}
		else if(new Rectangle(4850+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[19]=false;
		}
		else if(new Rectangle(5280+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[20]=false;
		}
		else if(new Rectangle(5490+EndlessState.x1,230,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[21]=false;
		}
		else if(new Rectangle(5750+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[22]=false;
		}
		else if(new Rectangle(6250+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[23]=false;
		}
		else if(new Rectangle(6670+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[24]=false;
		}
		else if(new Rectangle(6670+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[25]=false;
		}
		else if(new Rectangle(7100+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[26]=false;
		}
		else if(new Rectangle(7350+EndlessState.x1,230,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[27]=false;
		}
		else if(new Rectangle(7700+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[28]=false;
		}
		else if(new Rectangle(8400+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[29]=false;
		}
		else if(new Rectangle(8750+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[30]=false;
		}
		else if(new Rectangle(8850+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[31]=false;
		}
		else if(new Rectangle(8900+EndlessState.x1,250,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[32]=false;
		}
		else if(new Rectangle(9000+EndlessState.x1,200,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[33]=false;
		}
		else if(new Rectangle(9100+EndlessState.x1,250,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[34]=false;
		}
		else if(new Rectangle(9150+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[35]=false;
		}else if(new Rectangle(9250+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[36]=false;
		}
		
		else if(new Rectangle( 9530+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[37]=false;
		}
		else if(new Rectangle(10800+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[38]=false;
		}
		else if(new Rectangle(10900+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[39]=false;
		}
		else if(new Rectangle(10950+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[40]=false;
		}
		else if(new Rectangle(11050+EndlessState.x1,300,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[41]=false;
		}
		else if(new Rectangle(11150+EndlessState.x1,350,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[42]=false;
		}
		else if(new Rectangle(11250+EndlessState.x1,450,50,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[43]=false;
		}
		else if(new Rectangle(11350+EndlessState.x1,450,1,50).intersects(new Rectangle(0+Mummy.shift+25,380-Mummy.state2*3,1,90))){
			coins+=1;
			Display[44]=false;
		}
		
		
	}
	public void reset(){
		for(int i=0;i<50;i++){
			Display[i]=true;
		}
	}
	

}
