package floorPriceCalculator;

public class Driver {

	
	public static void main(String[] args) {
		
		
		//prompt and loop to get length from user
		double length = UserFloor.inputlengthFloor();
		
		//prompt and loop to get width from user
		double width = UserFloor.inputWidthFloor();
		
		//prompt and loop to get tile width from user
		double tileWidth = UserFloor.inputWidthTile();
		
		//prompt and loop to get tile length from user
		double tileLength = UserFloor.inputLengthTile();
		
		//prompt user to input side ammount
		
		
		//prompt and loop to get tile price from user
		double price = UserFloor.inputPrice();
		
		
		Tile tileInstance = new Tile(tileLength, tileWidth);
		
		Floor floorInstance = new Floor(width, length); 
		
		FloorMath.floorAreaMath(floorInstance);
		
		TileMath.sideMath(tileInstance);
			
		
		double priceResult = Math.abs(price) * TileMath.ammountMath(tileInstance);
		
		System.out.println("the tiles will cost you $" + priceResult + ";");
	}
	
}
