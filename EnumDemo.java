package Enumerations;

public class EnumDemo {

	public static void main(String[] args) {
		Directions dir = Directions.NORTHEAST;
		
		//Directions dir1 = Directions.valueOf("NORTH");
		
		Directions[] directionValues = Directions.values();
		
		for(Directions direct :directionValues) {
			System.out.println("Directions :"+direct);
		}
		
		
		Priority priority = Priority.MEDIUM;
		
		Priority priority2 = Priority.valueOf("LOW");
		
		System.out.println(priority2);

		switch (priority) {
		case HIGH:
			System.out.println("High priority");
			break;
		case MEDIUM:
			System.out.println("Medium priority");
			break;
		case LOW:
			System.out.println("Low priority");
			break;
		}
			
		System.out.println("============ Enum valueOf()");

		

		priority2 = Priority.valueOf("HIGH"); // java.lang.IllegalArgumentException: No enum constant com.itbulls.learnit.javacore.enumerations.Priority.high

		System.out.println("============ Enum comparison");

		System.out.println("Priority.MEDIUM == Priority.MEDIUM : " + (priority == Priority.MEDIUM)); // true
		System.out.println("Priority.MEDIUM.equals(Priority.MEDIUM): " + (priority.equals(Priority.MEDIUM))); 

		System.out.println("Priority.MEDIUM == Priority.HIGH: " + (priority == Priority.HIGH)); // false

		System.out.println("============ Enum ordinal()");

		System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());
		System.out.println("Priority.MEDIUM.ordinal(): " + Priority.MEDIUM.ordinal());

		System.out.println("============ Enum iteration");

		Priority[] values = Priority.values();
		
		for (Priority priority3 : values) {
			System.out.println(priority3);
		}
		
		System.out.println("============ To print the month names having 31 days");
		
		Month[] months = Month.values();
		for(Month month: months) {
			if(month.getNoOfDays() == 31) {
				System.out.println(month);
			}
		}

		System.out.println("============ Enum fields and methods");

		System.out.println("Month.FEBRUARY.getNoOfDays(): " + Month.FEBRUARY.getNoOfDays());

	}

}
