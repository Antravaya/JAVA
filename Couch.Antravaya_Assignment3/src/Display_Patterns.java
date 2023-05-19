import java.util.Scanner;

public class Display_Patterns {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a numbers: ");
			int n = input.nextInt();
			displayPattern(n);
		}
	}
	
	public static void displayPattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
