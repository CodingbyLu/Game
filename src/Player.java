import java.awt.Graphics;

public class Player extends Creature {

	
	
	public Player(Handler handler, float pX, float pY) {
		super(handler, pX, pY, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
	}

	
	public void tick() {
		//where we update variables for an object
		getInput();	
		move();
		handler.getGameCamers().centerOnEntity(this);
	}
	
	private void getInput() {
		//Moving 
		
		xMove = 0;
		yMove = 0;
		if(handler.getKeyManager().up) {
			yMove = -speed;
			
			}
		if(handler.getKeyManager().down) {
			yMove = speed;
			}
		
		if(handler.getKeyManager().left) {
			xMove = -speed;
			}
		
		if(handler.getKeyManager().right) {
			xMove = speed;
			}
	
	}

	
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) (x - handler.getGameCamers().getxOffset()),
				(int) (y - handler.getGameCamers().getyOffset()), width, height, null); 
		
		
		
	}

	
	
}
