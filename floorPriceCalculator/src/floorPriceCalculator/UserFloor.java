package floorPriceCalculator;
import java.util.Scanner;
public class UserFloor {
	
	
		private static Scanner keyboard = new Scanner(System.in);
		
		static double length = 0.0;
		static double width = 0.0;
		static double tileLength = 0.0;
		static double tileWidth = 0.0;
		static double price = 0.0;
		static int tileSides = 0;
		//while loop to get length of floor
		static double inputlengthFloor() { 
			while (true) { 
				System.out.println("input the length of your floor");
				if (keyboard.hasNextDouble()) {
					length = keyboard.nextDouble();
					System.out.println(length + "; floor length inputed by you");
					return length;
			} else { 
				System.out.println("that is not a valid input for legnth");
				keyboard.nextLine();
			}
		}
	}
		//while loop to get width of floor
		static double inputWidthFloor() { 
			while (true) {
				System.out.println("input the width of your floor");
				if (keyboard.hasNextDouble()) {
					width = keyboard.nextDouble();
					System.out.println(width + "; floor width inputed by you");
					return width;
				} else { 
					System.out.println("that is not a valid input for length");
					keyboard.nextLine();
			}
		}		
	}
		
		
		static double inputLengthTile() {
			while (true) {
				System.out.println("input the length of your tile");
				if (keyboard.hasNextDouble()) {
					tileLength = keyboard.nextDouble();
					System.out.println(tileLength + "; tile length inputed by you");
				return tileLength;
			} else { 
				System.out.println("that was not valid brother");
				keyboard.nextLine();
			}
		}
	}
		
		static double inputWidthTile() {
			while (true) {
				System.out.println("input the width of your tile");
				if (keyboard.hasNextDouble()) {
					tileWidth = keyboard.nextDouble();
					System.out.println(tileWidth + "; tile width inputed by you");
				return tileWidth;
			} else { 
				System.out.println("that was not valid brother");
				keyboard.nextLine();
			}
		}
	} 
	
		
		static double inputPrice() {
			while (true) {
				System.out.println("input the price of your tile");
				if (keyboard.hasNextDouble()) {
				price = keyboard.nextDouble();
				System.out.println(price + "; price inputed by you");
				return price;
			} else { 
				System.out.println("that aint no ammount of money dawg");
				keyboard.nextLine();
			}	
		}
		}
}
	
		
		