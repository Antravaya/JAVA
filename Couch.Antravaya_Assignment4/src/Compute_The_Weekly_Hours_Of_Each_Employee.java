
public class Compute_The_Weekly_Hours_Of_Each_Employee {

	public static void main(String[] args) {
		int [][] hours = {
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}
		};
		
		int[] totalHours = new int[hours.length];
		for(int i = 0; i < hours.length; i++) {
			int total = 0;
			for (int j = 0; j < hours[i].length; j++) {
				total += hours[i][j];
			}
			totalHours[i] = total;
		}
		
		int[] sortedIDs = new int[totalHours.length];
		for(int i = 0; i < sortedIDs.length; i++) {
			sortedIDs[i] = i;
		}
		for(int i = 0; i < sortedIDs.length; i++) {
			for(int j = i + 1; j < totalHours.length; j++) {
				if(totalHours[sortedIDs[j]] > totalHours[sortedIDs[i]]) {
					int temp = sortedIDs[i];
					sortedIDs[i] = sortedIDs[j];
					sortedIDs[i] = temp;
				}
			}
		}
		
		System.out.println("Employee ID/tTotal Hours");
		for(int i = 0; i < sortedIDs.length; i++) {
			System.out.println(sortedIDs[i] + "\t" + totalHours[sortedIDs[i]]);
		}
	}

}
