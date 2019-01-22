import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int pWidth = 21, pHeight = 21;
	
	public static BufferedImage green, blue, yellow, arrow, eins, zwei;
	public static BufferedImage Wario;
	public static BufferedImage kiwi;
	
	public static BufferedImage sand, sand2;
	public static BufferedImage dirt, dirt2;
	public static BufferedImage ice, ice2;
	public static BufferedImage lava;
	public static BufferedImage player;
	
	public static void init(){
	
		SpriteSheet tile = new SpriteSheet(ImageLoader.loadImage("/textures/tile.png"));
			
		green = tile.crop(0, 0, 39, 39);
		blue = tile.crop(39, 0, 39, 39);
		yellow = tile.crop(79, 0, 39, 39);
		arrow = tile.crop(120, 0, 39, 39);
		eins = tile.crop(0, 40, 39, 39);
		zwei = tile.crop(40, 40, 39, 39);
		
		
		SpriteSheet Entitys = new SpriteSheet(ImageLoader.loadImage("/textures/Wario.png"));
		
		Wario = Entitys.crop(32, 105, 16, 17);
		
		
		kiwi = ImageLoader.loadImage("/textures/kiwi.gif");
		
		
		SpriteSheet World = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet2.png"));
		
		sand = World.crop(26 + 23 * 2, 3 + 23 * 0, pWidth, pHeight);
		sand2 = World.crop(26 + 23 * 1, 3 + 23 * 1, pWidth, pHeight);
		
		dirt = World.crop(26 + 23 * 2, 3 + 23 * 4, pWidth, pHeight);
		dirt2 = World.crop(26 + 23 * 1, 3 + 23 * 5, pWidth, pHeight);
		 	
		lava = World.crop(26 + 23 * 0, 3 + 23 * 13, pWidth, pHeight);
		
		ice = World.crop(26 + 23 * 2, 3 + 23 * 2, pWidth, pHeight);
		ice2 = World.crop(26 + 23 * 1, 3 + 23 * 3, pWidth, pHeight);
		
		player = World.crop(26 + 23 * 24, 3 + 23 * 1, pWidth, pHeight);
		
		
	
		
	}

}
