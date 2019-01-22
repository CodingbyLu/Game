import java.awt.Graphics;

public class GameState extends State{
	
	private Player player;
	private World world;
	
	
	public GameState(Handler handler) {
		super(handler);
		
		world = new World(handler, "res/worlds/world");
		handler.setWorld(world);
		player = new Player(handler, 0, 0);
		
		
		
	}
	
	
	public void tick() {
		world.tick();
		player.tick();
		
	}
	
	
	public void render(Graphics g) {
	 
	  world.render(g);
	  player.render(g);
	  
	}

	
	
}
