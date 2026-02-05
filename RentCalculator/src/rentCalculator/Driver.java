package rentCalculator;

public class Driver {

	public static void main(String[] args) {
		
		double length1 = 0;
		double width1 = 0;
		
		double length2 = 0;
		double width2 = 0;
	
		double length3 = 0;
		double width3 = 0;

		
		double areaRoom1;
		double areaRoom2;
		double areaRoom3;
		
		double rent = 0;
		double wholeAppartment = 0;
		
		 
		Room room1 = new Room(length1, width1);
		Room room2 = new Room(length2, width2);
		Room room3 = new Room(length3, width3);
		
		User user = new User(); 
	
		rent = user.inputRent();
		wholeAppartment = user.inputTotalSpace();
		System.out.println("input values for room 1");
		length1 = user.inputLength();
		width1 = user.inputWidth();
		
		
		room1.setLegnth(length1);
		room1.setWidth(width1);
		
		System.out.println("input values for room 2");
		length2 = user.inputLength();
		width2 = user.inputWidth();
		
		
		room2.setLegnth(length2);
		room2.setWidth(width2);
		
		System.out.println("input values for room 3");
		length3 = user.inputLength();
		width3 = user.inputWidth();
		
		
		room3.setLegnth(length3);
		room3.setWidth(width3);
		
		
		areaRoom1 = room1.findRoomSize();
		areaRoom2 = room2.findRoomSize();
		areaRoom3 = room3.findRoomSize();

		
		System.out.println("the area of room 1 is " + areaRoom1 + " square feet. " + " the area of room two is " + areaRoom2 +  " square feet." + " the area of room three is " + areaRoom3 + "square feet");
		
		
		double totalRoomArea = areaRoom1 + areaRoom2 + areaRoom3;
		double sharedSpace = wholeAppartment - totalRoomArea;
		
		
		double rent1 = areaRoom1/totalRoomArea * rent;
		double rent2 = areaRoom2/totalRoomArea * rent;
		double rent3 = areaRoom3/totalRoomArea * rent;
		
		System.out.println("person staying in room one needs to pay; " + rent1);
		System.out.println("person staying in room one needs to pay; " + rent2);
		System.out.println("person staying in room one needs to pay; " + rent3);
		System.out.println("the total ammount of shared space is; " + sharedSpace);
		
		
		
		
		
		
		

	}

	
	}


