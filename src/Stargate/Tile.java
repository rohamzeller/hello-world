package Stargate;

import java.awt.Graphics2D;
import java.util.List;

public abstract class Tile {

	protected Vector v;
	protected int textureID;
	protected List<MapObject> mapObjects;
	private Door door;
	private Scale scale;

	/**
	 * 
	 * @param e
	 * @param directionFrom
	 */
	public abstract void onStep(Entity e, int directionFrom);

	public abstract void putBox();

	/**
	 * 
	 * @param g
	 */
	public abstract void draw(Graphics2D g);

	public Vector getNextTileVector() {
		throw new UnsupportedOperationException();
	}

	public Door getDoor() {
		throw new UnsupportedOperationException();
	}

	public Scale getScale() {
		throw new UnsupportedOperationException();
	}

}