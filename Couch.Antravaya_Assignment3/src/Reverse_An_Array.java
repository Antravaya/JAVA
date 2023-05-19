import java.util.Random;
public class Reverse_An_Array {

	public static void main(String[] args) {
		Random random = new Random();
		int[] number = new int[10];
		
		for(int i = 99; i >= 0; i--) {
			int randomNumber = random.nextInt(10);
			number[randomNumber]++;
		}
		
		for(int i = 0; i < number.length; i++) {
			System.out.println("Number " + i + ": " + number[i]);
		}

	}

}
