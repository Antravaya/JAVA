
public class Grade {

	/* The grade will change based on the
	 number you enter inside the parentheses
	 in GradeWork()
	 */
	public static void main(String[] args) {
		System.out.println("Your students grade is a: ");
		GradeWork(80);
	}
	
	public static void GradeWork(int grade) {
		if(grade > 89) {
			System.out.println("A");
		}
		else if(grade > 79) {
			System.out.println("B");
		}
		else if (grade > 69) {
			System.out.println("C");
		}
		else if (grade > 59) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
