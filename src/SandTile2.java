import java.awt.image.BufferedImage;

public class SandTile2 extends Tile {

	public SandTile2(int id) {
		super(Assets.sand2, id);
		
	}
	public boolean isSolid() {
		return true;
		
	}
}
