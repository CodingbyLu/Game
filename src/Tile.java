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
