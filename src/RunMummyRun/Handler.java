package RunMummyRun;

public class Handler{
	private Game game;
	
	public Handler(Game game){
		this.game=game;
	}
	public int getWidth(){
		return game.getWidth();
	}
	public int getHeight()
	{
		return game.getHeight();
	}
	
	public KeyManager getKeyManager(){
		return game.getKeymanager();
	}
	
	public MouseManager getMouseManager(){
		return game.getMouseManager();
	}
	public MouseManager2 getMouseManager2(){
		return game.getMouseManager2();
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}

}
