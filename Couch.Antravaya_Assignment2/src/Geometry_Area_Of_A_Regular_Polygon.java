import java.util.Scanner;

public class Geometry_Area_Of_A_Regular_Polygon {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the number of sides: ");
			double n = input.nextDouble();
			
			System.out.print("Enter the side: ");
			double s = input.nextDouble();
			
			double fraction = Math.PI / n;
			double area = (n * Math.pow(s,2)) / (4 * Math.tan(fraction));
			System.out.println("The area of the polygon is: " + area);
		}

	}

}
