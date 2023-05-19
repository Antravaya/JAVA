import java.util.Scanner;

public class Business_Check_ISBN13 {
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
			String inputString = input.next();
			System.out.println(Check_ISBN_13(inputString));
		}
	}
	
	public static String Check_ISBN_13(String s) {
		int[] d = new int[s.length()];
		int checksum = 10 - (d[0] + 3 * d[1] + d[2] + 3 * d[3] + d[4] + 3 * d[5] + d[6] + 3 * d[7] + d[8] + 3 * d[9] + d[10] + 3 * d[11]) % 10;
		if (checksum == 10) checksum = 0;
		return s+checksum;
	}
}
