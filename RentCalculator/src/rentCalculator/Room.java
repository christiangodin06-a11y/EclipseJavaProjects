package rentCalculator;

public class Room {

	double length;
	double width;
	double price;
	
	Room(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLegnth(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public double findRoomSize() {
		return length * width;
	}
	
	
}
