import java.awt.Color;
import java.awt.Graphics;

public class Player extends Creature {

	
	
	public Player(Handler handler, float pX, float pY) {
		super(handler, pX, pY, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 10;
		bounds.y = 10;
		bounds.width = 33;
		bounds.height = 36;
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
		
	//	g.setColor(Color.red);
	//	g.fillRect((int) (x + bounds.x -handler.getGameCamers().getxOffset()),
	//	(int) (y + bounds.y -handler.getGameCamers().getyOffset()),
	//	bounds.width, bounds.height);
		
	}

	
	
}
