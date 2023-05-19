import java.util.Scanner;

public class dayOfTheWeek {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter year: "); 
			int year = input.nextInt();
			
			System.out.print("Enter month: 1-12: ");
			int month = input.nextInt();
			
			System.out.print("Enter the day of the month: 1-31: "); 
			int day = input.nextInt();
			
			System.out.println("The day of the week is: ");
		    
			int q = day;
			int m = month;
			int k = year % 100;
			int j = year / 100;
			int h = q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
			h = h % 7;
		    
			switch(h) {
			case 0:
				System.out.println("Monday");
				break;
			
			case 1:
				System.out.println("Tuesday");
				break;
				
			case 2:
				System.out.println("Wednesday");
				break;
				
			case 3:
				System.out.println("Thursday");
				break;
				
			case 4:
				System.out.println("Friday");
				break;
				
			case 5:
				System.out.println("Saturday");
				break;
				
			case 6:
				System.out.println("Sunday");
				break;
			}
		}
	}
}