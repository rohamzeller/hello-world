package Stargate;

import java.awt.event.KeyEvent;

public class GamePanel {

	/**
	 * Dimensions
	 */
	public static final int WIDTH = 320;
	public static final int HEIGHT = 240;
	/**
	 * Game Thread
	 */
	private Thread thread;
	private boolean running;
	private int FPS = 60;
	private long targetTime = 1000/FPS;
	/**
	 * image
	 */
	private java.awt.image.BufferedImage image;
	private java.awt.Graphics2D g;
	/**
	 * game state manager
	 */
	private GameStateManager gsm;

	/**
	 * Constructor
	 */
	public GamePanel() {
		throw new UnsupportedOperationException();
	}

	public void addNotify() {
		throw new UnsupportedOperationException();
	}

	private void init() {
		throw new UnsupportedOperationException();
	}

	public void run() {
		throw new UnsupportedOperationException();
	}

	private void update() {
		throw new UnsupportedOperationException();
	}

	private void draw() {
		throw new UnsupportedOperationException();
	}

	private void drawToScreen() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param key
	 */
	public void keyTyped(KeyEvent key) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param key
	 */
	public void keyPressed(KeyEvent key) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param key
	 */
	public void keyReleased(KeyEvent key) {
		throw new UnsupportedOperationException();
	}

}