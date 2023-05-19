import java.util.Scanner;

public class Display_The_First_Days_Of_Each_Month {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the year: ");
			int year = input.nextInt();
			
			System.out.println("Enter the first day of the year:(0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday,)");
			int firstDay = input.nextInt();
			
			String[] months = {"January","February","March","April","May","June",
					"July","August","September","October","November","December"};
			
			int[] daysInMonths = {31, 28 + (year % 4 != 0 || year % 100 == 0 && year % 400 != 0 ? 0 : 1), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for(int i = 0; i < months.length; i++) {
				System.out.printf("%s 1, %d is %s%n", months[i], year, DayOfTheWeek(firstDay));
				firstDay = (firstDay + daysInMonths[i]) % 7;
			}
		}

	}
	
	public static String DayOfTheWeek(int days) {
		
		switch(days) {
		case 0: 
			return "Sunday";
		
		case 1: 
			return "Monday";
		
		case 2: 
			return "Tuesday";
		
		case 3: 
			return "Wednesday";
		
		case 4: 
			return "Thursday";
		
		case 5: 
			return "Friday";
		
		case 6: 
			return "Saturday";
			
		default:
			return "";
		}
	}

}
