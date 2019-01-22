import java.awt.image.BufferedImage;

public class SpriteSheet {

	
	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage pSheet) {
		
		sheet = pSheet;
		
	}
	
	
	public BufferedImage crop(int px, int py, int pWidth, int pHeight) {
	return sheet.getSubimage(px, py, pWidth, pHeight);
	
	
	}
}
