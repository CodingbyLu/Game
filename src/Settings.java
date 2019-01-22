import java.awt.Graphics;

public class Settings extends State {

	
	public Settings(Handler handler) {
		super(handler);
	}
	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.zwei, 0, 0, null);
		
	}

}
