
public class Algebra_Quadratic_Equation {
	
	public static void main(String[] args) {
		Algebra_Quadratic_Equation equation1 = new Algebra_Quadratic_Equation(1,2,1);
		System.out.println("Equation1: " + equation1.getA() + "x^2" + equation1.getB() + "x + " + equation1.getC() + " = 0");
		System.out.println("Discriminant: " + equation1.getDiscriminat());
		System.out.println("Root 1: " + equation1.getRoot1());
		System.out.println("Root 1: " + equation1.getRoot2());
		
		Algebra_Quadratic_Equation equation2 = new Algebra_Quadratic_Equation(1,2,1);
		System.out.println("Equation1: " + equation2.getA() + "x^2" + equation2.getB() + "x + " + equation1.getC() + " = 0");
		System.out.println("Discriminant: " + equation2.getDiscriminat());
		System.out.println("Root 1: " + equation2.getRoot1());
		System.out.println("Root 1: " + equation2.getRoot2());
	}
	
	private double a, b, c;
	
	public Algebra_Quadratic_Equation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getDiscriminat() {
		return b * b - 4 *a *c;
	}
	
	public double getRoot1() {
		double discriminant = getDiscriminat();
		if(discriminant < 0) {
			return 0;
		}else {
			return (-b + Math.sqrt(discriminant)) / (2 * a);
		}
	}
	
	public double getRoot2() {
		double discriminant = getDiscriminat();
		if(discriminant < 0) {
			return 0;
		}else {
			return (-b + Math.sqrt(discriminant)) / (2 * a);
		}
	}
}

	