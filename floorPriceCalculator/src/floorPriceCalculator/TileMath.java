package floorPriceCalculator;
public class TileMath {
	static Tile tile = new Tile(0,0);
	Driver driver = new Driver();

	static double tileArea;
	static double priceResult;
	static double tileAmmount;
	

	static double sideMath(Tile tile) {
        tileArea = Math.abs(tile.getTileLength()) * tile.getTileWidth() / 2;
        System.out.println("the area of your tile is " + tileArea);
        return tileArea;
	}
	
	static double ammountMath(Tile tile) {
		double tileAmmount = Math.abs(FloorMath.floorArea) / tileArea; 
		System.out.println("you will need " + tileAmmount + " tiles to cover your floor");
		return tileAmmount;
	}
}



