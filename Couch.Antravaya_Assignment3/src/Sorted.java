import java.util.Scanner;
public class Sorted {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the size of the list: ");
			int size = input.nextInt();
			int[] list = new int[size];
			
			System.out.print("Enter the contents of the list: ");
			for (int i = 0; i < size; i++) {
				list[i] = input.nextInt();
			}
			
			System.out.print("The list has " + size + " integers ");
			for (int i = 0; i < size; i++) {
				System.out.print(list[i] + " ");
			}
			
			if (isSorted(list)) {
				System.out.println("\nThe list is already sorted");
			}else {
				System.out.println("\nThe list is not sorted");
			}
		}
	}
	
	public static boolean isSorted(int[] list) {
		for(int i = 0; i < list.length -1; i++) {
			if(list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
