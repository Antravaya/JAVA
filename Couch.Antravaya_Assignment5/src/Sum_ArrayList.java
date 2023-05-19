import java.util.ArrayList;
import java.util.Scanner;

public class Sum_ArrayList {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        try (Scanner input = new Scanner(System.in)) {
			// Prompt user to enter five numbers
			System.out.print("Enter five numbers: ");
			for (int i = 0; i < 5; i++) {
			    double num = input.nextDouble();
			    list.add(num);
			}
		}

        // Compute the sum of the numbers in the list
        double sum = sum(list);

        // Display the sum
        System.out.println("The sum of the numbers is " + sum);
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double num : list) {
            sum += num;
        }
        return sum;
    }
}
