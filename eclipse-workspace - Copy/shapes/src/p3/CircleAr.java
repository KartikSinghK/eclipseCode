package p3;
import p1.Shape;
public class CircleAr extends Shape {
	double ar = 0;
	 public void area(double len, double bre) {
		 ar = 3.14*len*len;
	 }
	 public String toString() {
		 return("The area of the circle is : " + ar);
	 }
}
