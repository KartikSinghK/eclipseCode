package p;
import p2.ThreeDim;
import p1.TwoDim;
import java.util.Scanner;
public class MainClass extends ThreeDim {

	public static void main(String[] args) {
		int d1, d2, d3;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of x, y and z : ");
        d1 = sc.nextInt();
        d2 = sc.nextInt();
        d3 = sc.nextInt();
        TwoDim TwoOb = new TwoDim(d1, d2);
        ThreeDim threeOb = new ThreeDim(d3);
        TwoDim ref;
        ref = TwoOb;
        System.out.println(ref.toString());
        ref = threeOb;
        System.out.println(ref);
	}

}
