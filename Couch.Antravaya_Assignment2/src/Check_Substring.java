import java.util.Scanner;

public class Check_Substring {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a string of letters in the first prompt "
					+ "then enter the letters within that string into the second prompt.");
			
			System.out.print("Enter string s1: ");
			String s1 = input.next();
			
			System.out.print("Enter string s2: ");
			String s2 = input.next();
			
			System.out.print(s2 + " is a Substring of " + s1);
		}
	}

}
