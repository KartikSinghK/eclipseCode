package p2;
import p1.Shape;
public class Rectangle extends Shape {
	double ar = 0;
	public void area(double len, double bre) {
		 ar = len*bre;
	 }
	public String toString() {
		return("The area of the rectangle is : " + ar);
	}
}
