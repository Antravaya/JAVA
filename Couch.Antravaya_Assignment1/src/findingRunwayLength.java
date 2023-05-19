import java.util.Scanner;

public class findingRunwayLength {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter speed and acceleration: ");
			
			double metersPerSecond = input.nextDouble();
			double acceleration = input.nextDouble() * 2; 
			double length = Math.pow(metersPerSecond,2)/acceleration;
			
			System.out.println("The minimum runway length for this airplane is: " 
			+ (float)Math.abs(length));
		}
	}
}
