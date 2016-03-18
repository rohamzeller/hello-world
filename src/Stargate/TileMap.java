package Stargate;

import java.awt.image.BufferedImage;
import java.util.Map;

public class TileMap {

	public Map<Integer, BufferedImage> textureMap;
	private Tile[][] tiles;
	private Wormhole wormhole;

	/**
	 * 
	 * @param textureID
	 */
	public BufferedImage getTextureMap(int textureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param filePath
	 */
	public void loadTextureMap(String filePath) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param filePath
	 */
	public void loadMap(String filePath) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Tile getTile(int x, int y) {
		throw new UnsupportedOperationException();
	}

	public Wormhole getWormhole() {
		throw new UnsupportedOperationException();
	}

}