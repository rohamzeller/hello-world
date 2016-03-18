package Stargate;

import java.awt.Graphics2D;

public abstract class Entity {

	protected Tile actualTile;
	protected Vector dv;
	protected int textureID;
	protected TileMap tileMap;
	protected int speed;
	protected int direction;

	public abstract void move();

	/**
	 * 
	 * @param g
	 */
	public abstract void draw(Graphics2D g);

	public abstract void destroy();

	/**
	 * 
	 * @param v
	 */
	public abstract void moveTo(Vector v);

	public abstract void hitWall();

	public abstract void hitGap();

	public abstract void hitFloor();

	public abstract void hitSpecialWall();

}