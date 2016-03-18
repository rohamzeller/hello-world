package Stargate;

import java.awt.Graphics2D;

public abstract class MapObject {

	protected int textureID;

	/**
	 * 
	 * @param g
	 */
	public void draw(Graphics2D g) {
		throw new UnsupportedOperationException();
	}

}