//Kim Terrence Quines
//Guided Task 3: Print today's date and time using Java’s built-in libraries.

import java.time.LocalDate;
import java.time.LocalTime;

public class GuidedTask3 {

	public static void main(String[] args) {
		
		LocalDate current_date =  LocalDate.now();
		LocalTime current_time =  LocalTime.now();
		System.out.println("Today's Date: " + current_date);
		System.out.println("Today's Time: " + current_time);
	}

}
