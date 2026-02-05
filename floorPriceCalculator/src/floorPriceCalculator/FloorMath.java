package floorPriceCalculator;

public class FloorMath {
static Floor floor = new Floor(0, 0);


static double floorArea;

static void floorAreaMath(Floor floor) { 
	floorArea = Math.abs(floor.getLength()) * floor.getWidth();
}

	
	
	
	
}
