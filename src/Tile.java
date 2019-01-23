import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//static stuff here
	
	public static Tile[] tiles = new Tile[256];
	
	public static Tile dirtTile = new DirtTile(0);
	public static Tile dirtTile2 = new DirtTile2(1);
	
	public static Tile sandTile = new SandTile(2);
	public static Tile sandTile2 = new SandTile2(3);
	
	public static Tile iceTile = new IceTile(4);
	public static Tile iceTile2 = new IceTile2(5); 
	
	public static Tile lavaTile = new LavaTile(6);
	
	public static Tile rockTile = new RockTile(7);
	public static Tile rockTile2 = new RockTile2(8);
	
	public static Tile sky11 = new SkyTile(Assets.sky11, 9);
	public static Tile sky12 = new SkyTile(Assets.sky12, 10);
	public static Tile sky13 = new SkyTile(Assets.sky13, 11);  //einfarbig hell
	public static Tile sky14 = new SkyTile(Assets.sky14, 12);
	public static Tile sky15 = new SkyTile(Assets.sky15, 13);
	public static Tile sky16 = new SkyTile(Assets.sky16, 14);
	public static Tile sky17 = new SkyTile(Assets.sky17, 15);
	public static Tile sky18 = new SkyTile(Assets.sky18, 16);
	public static Tile sky19 = new SkyTile(Assets.sky19, 17);
	public static Tile sky110 = new SkyTile(Assets.sky20, 18);
	public static Tile sky111 = new SkyTile(Assets.sky201, 19);
	public static Tile sky21 = new SkyTile(Assets.sky21, 20);
	public static Tile sky22 = new SkyTile(Assets.sky22, 21);
	public static Tile sky23= new SkyTile(Assets.sky23, 22);
	public static Tile sky24 = new SkyTile(Assets.sky24, 23);
	public static Tile sky25 = new SkyTile(Assets.sky25, 24);
	public static Tile sky26 = new SkyTile(Assets.sky26, 25);
	public static Tile sky27 = new SkyTile(Assets.sky27, 26);
	public static Tile sky28 = new SkyTile(Assets.sky28, 27);
	public static Tile sky29 = new SkyTile(Assets.sky29, 28);
	public static Tile sky210 = new SkyTile(Assets.sky210, 29);
	public static Tile sky211 = new SkyTile(Assets.sky211, 30);
	public static Tile sky31 = new SkyTile(Assets.sky321, 31);
	public static Tile sky32 = new SkyTile(Assets.sky322, 32);
	public static Tile sky33 = new SkyTile(Assets.sky323, 33);
	public static Tile sky34 = new SkyTile(Assets.sky324, 34);
	public static Tile sky35 = new SkyTile(Assets.sky325, 35);
	public static Tile sky36 = new SkyTile(Assets.sky326, 36);
	public static Tile sky37 = new SkyTile(Assets.sky327, 37);
	public static Tile sky38 = new SkyTile(Assets.sky328, 38);
	public static Tile sky39 = new SkyTile(Assets.sky329, 39);  //einfarbig dunkel
	public static Tile sky310 = new SkyTile(Assets.sky3210, 40);
	public static Tile sky311 = new SkyTile(Assets.sky3211, 41);
	
	//Class
	
	public static final int TILEWIDTH = 50;
	public static final int TILEHEIGHT = 50;
	
	protected BufferedImage texture;
    protected final int id;
	
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}

	public int getID() {
		return id;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	
	}
	
	public boolean isSolid() {
		return false;
		
	}
}
