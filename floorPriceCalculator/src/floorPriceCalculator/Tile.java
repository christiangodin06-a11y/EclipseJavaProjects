package floorPriceCalculator;

public class Tile {

	private double tileWidth;
	private double tileLength;

	
	
	public Tile(double tileWidth, double tileLength) {
		this.tileWidth = tileWidth;
		this.tileLength = tileLength; 
	
	}

	public double getTileWidth() {
		return tileWidth;
	}

	public void setTileWidth(double tileWidth) {
		this.tileWidth = tileWidth;
	}

	public double getTileLength() {
		return tileLength;
	}

	public void setTileLength(double tileLength) {
		this.tileLength = tileLength;
	}

	
}