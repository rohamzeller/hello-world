package Stargate;

public abstract class GameState {

	protected GameStateManager gsm;

	public abstract void init();

	public abstract void update();

	/**
	 * 
	 * @param g
	 */
	public abstract void draw(java.awt.Graphics2D g);

	/**
	 * 
	 * @param k
	 */
	public abstract void keyPressed(int k);

	/**
	 * 
	 * @param k
	 */
	public abstract void keyReleased(int k);

}