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
	public static BufferedImage rock, rock2;
	
	
	//sky
	public static BufferedImage sky11, sky12, sky13, sky14, sky15, sky16, sky17, sky18, sky19, sky20, sky201, sky21, sky22, sky23, sky24, sky25, sky26, sky27, sky28, sky29, sky210, sky211,
	 sky321, sky322, sky323, sky324, sky325, sky326, sky327, sky328, sky329, sky3210, sky3211;
	
	
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
		
		
		rock = World.crop(26 + 23 * 2, 3 + 23 * 6, pWidth, pHeight);
		rock2 = World.crop(26 + 23 * 1, 3 + 23 * 7, pWidth, pHeight);
		
		
		
		//Sky
		//obere 1.ebene 18-28
		
		sky11 = World.crop(26 + 23 * 18, 3 + 23 * 7, pWidth, pHeight);
		sky12 = World.crop(26 + 23 * 19, 3 + 23 * 7, pWidth, pHeight);
		sky13 = World.crop(26 + 23 * 20, 3 + 23 * 7, pWidth, pHeight);
		sky14 = World.crop(26 + 23 * 21, 3 + 23 * 7, pWidth, pHeight);
		sky15 = World.crop(26 + 23 * 22, 3 + 23 * 7, pWidth, pHeight);
		sky16 = World.crop(26 + 23 * 23, 3 + 23 * 7, pWidth, pHeight);
		sky17 = World.crop(26 + 23 * 24, 3 + 23 * 7, pWidth, pHeight);
		sky18 = World.crop(26 + 23 * 25, 3 + 23 * 7, pWidth, pHeight);
		sky19 = World.crop(26 + 23 * 26, 3 + 23 * 7, pWidth, pHeight);
		sky20 = World.crop(26 + 23 * 27, 3 + 23 * 7, pWidth, pHeight);
		sky201 = World.crop(26 + 23 * 28, 3 + 23 * 7, pWidth, pHeight);
		
		// 2.ebene
		
		sky21 = World.crop(26 + 23 * 18, 3 + 23 * 8, pWidth, pHeight);
		sky22 = World.crop(26 + 23 * 19, 3 + 23 * 8, pWidth, pHeight);
		sky23 = World.crop(26 + 23 * 20, 3 + 23 * 8, pWidth, pHeight);
		sky24 = World.crop(26 + 23 * 21, 3 + 23 * 8, pWidth, pHeight);
		sky25 = World.crop(26 + 23 * 22, 3 + 23 * 8, pWidth, pHeight);
		sky26 = World.crop(26 + 23 * 23, 3 + 23 * 8, pWidth, pHeight);
		sky27 = World.crop(26 + 23 * 24, 3 + 23 * 8, pWidth, pHeight);
		sky28 = World.crop(26 + 23 * 25, 3 + 23 * 8, pWidth, pHeight);
		sky29 = World.crop(26 + 23 * 26, 3 + 23 * 8, pWidth, pHeight);
		sky210 = World.crop(26 + 23 * 27, 3 + 23 * 8, pWidth, pHeight);
		sky211 = World.crop(26 + 23 * 28, 3 + 23 * 8, pWidth, pHeight);
		
		//3.eben
		
		sky321 = World.crop(26 + 23 * 18, 3 + 23 * 9, pWidth, pHeight);
		sky322 = World.crop(26 + 23 * 19, 3 + 23 * 9, pWidth, pHeight);
		sky323 = World.crop(26 + 23 * 20, 3 + 23 * 9, pWidth, pHeight);
		sky324 = World.crop(26 + 23 * 21, 3 + 23 * 9, pWidth, pHeight);
		sky325 = World.crop(26 + 23 * 22, 3 + 23 * 9, pWidth, pHeight);
		sky326 = World.crop(26 + 23 * 23, 3 + 23 * 9, pWidth, pHeight);
		sky327 = World.crop(26 + 23 * 24, 3 + 23 * 9, pWidth, pHeight);
		sky328 = World.crop(26 + 23 * 25, 3 + 23 * 9, pWidth, pHeight);
		sky329 = World.crop(26 + 23 * 26, 3 + 23 * 9, pWidth, pHeight);
		sky3210 = World.crop(26 + 23 * 27, 3 + 23 * 9, pWidth, pHeight);
		sky3211 = World.crop(26 + 23 * 28, 3 + 23 * 9, pWidth, pHeight);
		
	}

}
