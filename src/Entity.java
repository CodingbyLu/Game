import java.awt.Graphics;

public abstract class Entity {
	
	protected float x, y;
	protected int width, height;
	protected Handler handler;
	
	public Entity(Handler handler, float pX, float pY, int pWidth, int pHeight) {
	    this.handler = handler;
		x = pX;
		y = pY;
		height = pHeight;
		width = pWidth;
		
	}
	
	//getters & setters
	
	public float getX() {
		return x;
	}



	public void setX(float x) {
		this.x = x;
	}



	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public abstract void tick();
	public abstract void render(Graphics g);

	
	
}
