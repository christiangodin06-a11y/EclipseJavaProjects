package rentCalculator;
import  java.util.Scanner;
public class User {

	static Scanner keyboard = new Scanner(System.in);
	
	
	double inputWidth() {
		while (true) {
			System.out.println("input width");
			if (keyboard.hasNextDouble()) {
			double width = keyboard.nextDouble();
			System.out.println(width + "; width value input by you");
			return width;
		} else { 
			System.out.println("that is not a valid value");
			keyboard.nextLine();
		}	
	}
}
	
	double inputLength() {
		while (true) {
			System.out.println("input Legnth");
			if (keyboard.hasNextDouble()) {
			double length = keyboard.nextDouble();
			System.out.println(length + "; length value input by you");
			return length;
		} else { 
			System.out.println("that is not a valid value");
			keyboard.nextLine();
		}
	}
}	
	
	double inputRent() {
		while (true) {
			System.out.println("input rent");
			if (keyboard.hasNextDouble()) {
			double rent = keyboard.nextDouble();
			System.out.println(rent + "; width value input by you");
			return rent;
		} else { 
			System.out.println("that is not a valid value");
			keyboard.nextLine();
		}	
	}
}
	double inputTotalSpace() {
		while (true) {
			System.out.println("input total squarefoot of your appartment");
			if (keyboard.hasNextDouble()) {
			double totalsize = keyboard.nextDouble();
			System.out.println(totalsize + "; width value input by you");
			return totalsize;
		} else { 
			System.out.println("that is not a valid value");
			keyboard.nextLine();
		}	
	}
}
	boolean inputKeepGoing() {
		while (true) {
			System.out.println("would you like to add another room? 1 for yes, 0 for no");
			if (keyboard.hasNextBoolean()) {
			boolean keepGoing = keyboard.nextBoolean();
			return keepGoing;
		} else { 
			System.out.println("that was not a valid boolean");
			keyboard.nextLine();
			
			}
		}
	}
}
