import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game implements Runnable {
//Runnable = for thread. Class has to have run Method
	
	
	private Display display;
	private int width, height;
	private boolean running = false;
	private Thread thread;
	public String title;
	
	//Graphics
	
	private BufferStrategy bs;
	private Graphics g;
	
	//Input
	private KeyManager keyManager;
	
	

	//Camera
	private GameCamera gameCamera;
	
	//Handler
	private Handler handler;
	
	//States
	private State GameMenu;
	private State gameState;
	private State settingsState;
	
	public Game(String pTitle, int pWidth, int pHeight) {
	
	width = pWidth;
	height = pHeight;
	title = pTitle;
	keyManager = new KeyManager();

	}
	
	private  void init() {
		
	//Graphics	
	display = new Display(title, width, height);
	display.getFrame().addKeyListener(keyManager);
	Assets.init();
	
	gameCamera = new GameCamera(this, 0, 0);
	
	//States 
	settingsState = new Settings(handler);
	gameState = new GameState(handler);
	GameMenu = new GameMenu(handler);
	handler = new Handler(this);
	
	//Setting State
	State.setState(gameState);
		
	}
	
	
	public void tick() {
		//update
    keyManager.tick();
    
	if(State.getState() != null) {
		State.getState().tick();
	}
	
	}
	
	private void render() {
		//render
		
		bs = display.getCanvas().getBufferStrategy(); //a way of ('better') drawing things to screen with buffers ("hidden screen" within actual screen)
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
			
		}
		 g = bs.getDrawGraphics();
		 
		 //clear screen
		 g.clearRect(0, 0, width, height);
		
		 //State
		 if(State.getState() != null) {
				State.getState().render(g);
				
			}
			
		
		 //draw 
		
		
		
		
	
	    //end draw
		 bs.show();
		 g.dispose();
		 
	}
	
	public void run() {
    		
	init();
	
	int fps = 60;
	double timePerTick = 1_000_000_000 / fps; //messured in nanoseconds (1 sec = 9bill nano sec)
	double delta = 0;
	long now;
	long lastTime = System.nanoTime();
	long timer = 0;
	int ticks = 0;
	
	
	while(running){
		now = System.nanoTime();
		delta += (now - lastTime) / timePerTick; //tells comp when to call render and tick
		timer += now - lastTime;
		lastTime = now;
		
		if(delta >= 1){
		tick();
		render();
		ticks++;
		delta--;
		
		
	}
		if(timer >= 1000000000) {
			System.out.println("Ticks and Frames: " + ticks);
			ticks = 0;
			timer = 0;
		}
		
		}
		stop();
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
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
	public GameCamera getGameCamers() {
		return gameCamera;
	}
	
	
	public synchronized void start() {
	    
		if (running)
			return;
	    
		running = true;
		thread = new Thread(this);
		thread.start(); //calls run Method
		
	}
	
	public synchronized void stop() {
		
		
		if(!running)
			return;
		
		running = false;
	
		try {
			thread.join(); //has to be surrounded by try/catch
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	
	}
	

	
	
}
