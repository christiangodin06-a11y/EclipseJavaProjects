package currencyCalculator;
import java.util.Scanner;
public class User {
	
	static Scanner keyboard = new Scanner(System.in);
	
	
	public double inputDouble(String message, double low, double high) {
	    double input = 0;
	    boolean valid = true;

	    while (valid) {
	        System.out.println(message);

	        if (keyboard.hasNextDouble()) {
	            input = keyboard.nextDouble();
	            keyboard.nextLine();
	            if (input >= low && input <= high) {
	                System.out.println("You entered: " + input);
	                valid = false;
	            } else {
	                System.out.println("That number is out of range (" + low + " to " + high + "). Try again.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a whole number.");
	            keyboard.nextLine();
	        }
	    }

	    return input;
	}
	
	
	public int inputInt(String message, int low, int high) {
	    int input = 0;
	    boolean valid = true;

	    while (valid) {
	        System.out.println(message);

	        if (keyboard.hasNextInt()) {
	            input = keyboard.nextInt();
	            keyboard.nextLine();
	            if (input >= low && input <= high) {
	                System.out.println("You entered: " + input);
	                valid = false;
	            } else {
	                System.out.println("That number is out of range (" + low + " to " + high + "). Try again.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a whole number.");
	            keyboard.nextLine();
	        }
	    }

	    return input;
	}
	
	
	
			
}
		