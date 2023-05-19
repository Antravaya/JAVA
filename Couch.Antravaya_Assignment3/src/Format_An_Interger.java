import java.util.Scanner;

public class Format_An_Interger {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			System.out.print("Enter your width: ");
			int width = input.nextInt();
			
			String formmated = format(number, width);
			System.out.println("Your formated number is: " + formmated);
		}
	}
	
	public static String format(int number, int width) {
		String str = Integer.toString(number);
		int strLen = str.length();
		
		if(strLen >= width) {
			return str;
		}else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < width - strLen; i++) {
				sb.append('0');
			}
			sb.append(str);
			return sb.toString();
		}
	}

}
