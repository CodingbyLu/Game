import java.awt.Graphics;

public abstract class State {
	
	
	//think of all the following as a separate class
	//State Manager
	
	private static State currentState = null;
	
	public static void setState(State pState){
		currentState = pState;
		
	}
	
	static State getState(){
		return currentState;
		
	}
	
	
	//Class
	
	protected Handler handler;
	
	public State(Handler handler) {
		
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);

	

}
