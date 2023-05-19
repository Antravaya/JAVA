import java.util.Arrays;
import java.util.Comparator;

public class Sort_Two_Dimensional_Array{
	
	public static void sort(int[][] m) {
		Arrays.sort(m, new Comparator<int[]>() {
			@Override
			public int compare(int[] row1, int[] row2) {
				for(int i = 0; i < row1.length; i++) {
					if (row1[i] != row2[i]){
						return row1[i] - row2[i];
					}
				}
				return 0;
			}
		});
	}
	
	public static void main(String[] args) {
		int[][] array = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		sort(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}