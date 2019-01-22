import java.awt.Graphics;

public class GameMenu extends State {
	
	public GameMenu(Handler handler) {
		super(handler);
	
		
	}
	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.blue, 0, 0, null);

}
}
