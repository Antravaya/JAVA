import java.util.Scanner;

public class CalculatingEnergy {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the amount of water in kilograms: ");
			double amountInKilograms = input.nextDouble();
			
			System.out.print("Enter the initial temperature: ");
			double intitialTemperature = input.nextDouble();
			
			System.out.print("Enter the final temperature: ");
			double finalTemperature = input.nextDouble();
			
			double result = amountInKilograms * (finalTemperature - intitialTemperature) * 4184;
			System.out.println("The energy needed is: " + result);
		}

	}
}
