
public class N_Sided_Regular_Polygon extends RegularPolygon{
	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Perimeter of polygon1: " + polygon1.getPerimeter());
		System.out.println("Area of polygon: " + polygon1.getArea());
		
		System.out.println("Perimeter of polygon1: " + polygon2.getPerimeter());
		System.out.println("Area of polygon: " + polygon2.getArea());
		
		System.out.println("Perimeter of polygon1: " + polygon3.getPerimeter());
		System.out.println("Area of polygon: " + polygon3.getArea());
	}
}