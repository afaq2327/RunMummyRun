package RunMummyRun;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage obstacle1,obstacle2,obstacle3,obstacle4,obstacle5,obstacle6,obstacle7,obstacle8,obstacle9,cutter,powerup,powerup2,fly,back,paused,chest,back2,over,money,heart;
	public static BufferedImage[] btn_Start,btn_Start2,btn_Continue,btn_Exit,mummy,enemy,die,jump,slide;
	
	

	
	
	public static void init(){
		
		
		SpriteSheet sheet1=new SpriteSheet(ImageLoader.loadImage("/textures/money.png"));
		SpriteSheet sheet2=new SpriteSheet(ImageLoader.loadImage("/textures/powerup_1.png"));
		SpriteSheet sheet3=new SpriteSheet(ImageLoader.loadImage("/textures/powerup_2.png"));
		SpriteSheet sheet4=new SpriteSheet(ImageLoader.loadImage("/textures/run_b.png"));
		SpriteSheet sheet5=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle10.png"));
		SpriteSheet sheet6=new SpriteSheet(ImageLoader.loadImage("/textures/level1.jpg"));
		SpriteSheet sheet7=new SpriteSheet(ImageLoader.loadImage("/textures/Run.jpg"));
		SpriteSheet sheet8=new SpriteSheet(ImageLoader.loadImage("/textures/over.png"));
		SpriteSheet sheet9=new SpriteSheet(ImageLoader.loadImage("/textures/exit.png"));
		SpriteSheet sheet10=new SpriteSheet(ImageLoader.loadImage("/textures/cont.png"));	
		SpriteSheet sheet11=new SpriteSheet(ImageLoader.loadImage("/textures/mummy.png"));
		SpriteSheet sheet12=new SpriteSheet(ImageLoader.loadImage("/textures/enemy.png"));
		SpriteSheet sheet13=new SpriteSheet(ImageLoader.loadImage("/textures/die.png"));
		SpriteSheet sheet14=new SpriteSheet(ImageLoader.loadImage("/textures/jump.png"));
		SpriteSheet sheet15=new SpriteSheet(ImageLoader.loadImage("/textures/slide.png"));
		SpriteSheet sheet16=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle1.png"));
		SpriteSheet sheet17=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle2.png"));
		SpriteSheet sheet18=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle3.png"));
		SpriteSheet sheet19=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle4.png"));
		SpriteSheet sheet20=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle5.png"));
		SpriteSheet sheet21=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle6.png"));
		SpriteSheet sheet22=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle7.png"));
		SpriteSheet sheet23=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle8.png"));
		SpriteSheet sheet24=new SpriteSheet(ImageLoader.loadImage("/textures/obstacle9.png"));
		SpriteSheet sheet25=new SpriteSheet(ImageLoader.loadImage("/textures/heart.png"));
		SpriteSheet sheet26=new SpriteSheet(ImageLoader.loadImage("/textures/pause.png"));
		SpriteSheet sheet27=new SpriteSheet(ImageLoader.loadImage("/textures/chest.png"));
		
		///////
		btn_Start=new BufferedImage[2];
		btn_Start[0]=sheet4.crop(0, 0, 90,33);
		btn_Start[1]=sheet4.crop(0, 33, 90, 33);
		
		btn_Continue=new BufferedImage[2];
		btn_Continue[0]=sheet10.crop(0, 0, 372, 117);
		btn_Continue[1]=sheet10.crop(0, 117, 372, 117);
		btn_Exit=new BufferedImage[2];
		btn_Exit[0]=sheet9.crop(0, 0, 238, 75);
		btn_Exit[1]=sheet9.crop(0, 75, 238, 75);
		
		
		
		
		
		
		back=sheet6.crop(0,0,12000,600);
		back2=sheet7.crop(0, 0, 1102, 537);
		over=sheet8.crop(0, 0, 1250, 938);
		
		
		/////
		
		mummy=new BufferedImage[30];
		mummy[0]=sheet11.crop(0, 0, 100, 110);
		mummy[1]=sheet11.crop(100, 0, 100, 110);
		mummy[2]=sheet11.crop(200, 0, 100, 110);
		mummy[3]=sheet11.crop(300, 0, 100, 110);
		mummy[4]=sheet11.crop(400, 0, 100, 110);
		mummy[5]=sheet11.crop(500, 0, 100, 110);
		mummy[6]=sheet11.crop(600, 0, 100, 110);
		mummy[7]=sheet11.crop(700, 0, 100, 110);
		mummy[8]=sheet11.crop(800, 0, 100, 110);
		mummy[9]=sheet11.crop(900, 0, 100, 110);
		mummy[10]=sheet11.crop(1000, 0, 100, 110);
		mummy[11]=sheet11.crop(1100, 0, 100, 110);
		mummy[12]=sheet11.crop(1200, 0, 100, 110);
		mummy[13]=sheet11.crop(1300, 0, 100, 110);
		mummy[14]=sheet11.crop(1400, 0, 100, 110);
		mummy[15]=sheet11.crop(0, 110, 100, 110);
		mummy[16]=sheet11.crop(100, 110, 100, 110);
		mummy[17]=sheet11.crop(200, 110, 100, 110);
		mummy[18]=sheet11.crop(300, 110, 100, 110);
		mummy[19]=sheet11.crop(400, 110, 100, 110);
		mummy[20]=sheet11.crop(500, 110, 100, 110);
		mummy[21]=sheet11.crop(600, 110, 100, 110);
		mummy[22]=sheet11.crop(700, 110, 100, 110);
		mummy[23]=sheet11.crop(800,110, 100, 110);
		mummy[24]=sheet11.crop(900, 110, 100, 110);
		mummy[25]=sheet11.crop(1000, 110, 100, 110);
		mummy[26]=sheet11.crop(1100, 110, 100, 110);
		mummy[27]=sheet11.crop(1200, 110, 100, 110);
		mummy[28]=sheet11.crop(1300, 110, 100, 110);
		mummy[29]=sheet11.crop(1400, 110, 100, 110);
	
		enemy=new BufferedImage[4];
		enemy[0]=sheet12.crop(0, 0, 68, 127);
		enemy[1]=sheet12.crop(70, 0, 68, 127);
		enemy[2]=sheet12.crop(70*2, 0, 61, 127);
		enemy[3]=sheet12.crop(68*3, 0, 68, 127);
		
		die=new BufferedImage[11];
		die[0]=sheet13.crop(100*0, 0, 100, 100);
		die[1]=sheet13.crop(100*1, 0, 100, 100);
		die[2]=sheet13.crop(100*2, 0, 100, 100);
		die[3]=sheet13.crop(100*3, 0, 100, 100);
		die[4]=sheet13.crop(100*4, 0, 100, 100);
		die[5]=sheet13.crop(100*5, 0, 100, 100);
		die[6]=sheet13.crop(100*6, 0, 100, 100);
		die[7]=sheet13.crop(100*7, 0, 100, 100);
		die[8]=sheet13.crop(100*8, 0, 100, 100);
		die[9]=sheet13.crop(100*9, 0, 100, 100);
		die[10]=sheet13.crop(100*10, 0, 100, 100);
		
		jump=new BufferedImage[20];
		jump[0]=sheet14.crop(90*0, 0, 100, 100);
		jump[1]=sheet14.crop(100*1, 0, 100, 100);
		jump[2]=sheet14.crop(100*2, 0, 100, 100);
		jump[3]=sheet14.crop(100*3, 0, 100, 100);
		jump[4]=sheet14.crop(100*4, 0, 100, 100);
		jump[5]=sheet14.crop(100*5, 0, 100, 100);
		jump[6]=sheet14.crop(100*6, 0, 100, 100);
		jump[7]=sheet14.crop(100*7, 0, 100, 100);
		jump[8]=sheet14.crop(100*8, 0, 100, 100);
		jump[9]=sheet14.crop(100*9, 0, 100, 100);
		jump[10]=sheet14.crop(100*0, 101, 100, 100);
		jump[11]=sheet14.crop(100*1, 101, 100, 100);
		jump[12]=sheet14.crop(100*2, 101, 100, 100);
		jump[13]=sheet14.crop(100*3, 101, 100, 100);
		jump[14]=sheet14.crop(100*4, 101, 100, 100);
		jump[15]=sheet14.crop(100*5, 101, 100, 100);
		jump[16]=sheet14.crop(100*6, 101, 100, 100);
		jump[17]=sheet14.crop(100*7, 101, 100, 100);
		jump[18]=sheet14.crop(100*8, 101, 100, 100);
		jump[19]=sheet14.crop(100*9, 101, 100, 100);
		
		slide=new BufferedImage[10];
		slide[0]=sheet15.crop(100*0, 0, 100, 100);
		slide[1]=sheet15.crop(100*1, 0, 100, 100);
		slide[2]=sheet15.crop(100*2, 0, 100, 100);
		slide[3]=sheet15.crop(100*3, 0, 100, 100);
		slide[4]=sheet15.crop(100*4, 0, 100, 100);
		slide[5]=sheet15.crop(100*5, 0, 100, 100);
		slide[6]=sheet15.crop(100*6, 0, 100, 100);
		slide[7]=sheet15.crop(100*7, 0, 100, 100);
		slide[8]=sheet15.crop(100*8, 0, 100, 100);
		slide[9]=sheet15.crop(100*9, 0, 100, 100);
		
		obstacle1=sheet16.crop(0, 0, 131,225);
		obstacle2=sheet17.crop(0, 0, 72,72);
		obstacle3=sheet18.crop(0, 0, 72,72);
		obstacle4=sheet19.crop(0, 0, 72,144);
		obstacle5=sheet20.crop(0, 0, 72,144);
		obstacle6=sheet21.crop(0, 0, 96,192);
		obstacle7=sheet22.crop(0, 0, 96,192);
		obstacle8=sheet23.crop(0, 0, 72,72);
		obstacle9=sheet24.crop(0, 0, 72,144);
		
		
		money=sheet1.crop(0, 0, 24,24);
		powerup=sheet2.crop(0,0,24,24);
		powerup2=sheet3.crop(0,0,24,24);
		fly=sheet3.crop(0,0,24,24);
		cutter=sheet5.crop(0,0,36,36);
		heart=sheet25.crop(0,0,640,640);
		paused=sheet26.crop(0, 0, 1250,938);
		chest=sheet27.crop(0, 0, 1166,925);
		
	}
}


