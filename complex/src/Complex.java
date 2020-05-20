
import java.util.Scanner;
public class Complex {
	
	void toString(int real_part, int imag_part) {
		System.out.println(real_part + " + (" + imag_part + ")i");
	}
	
    void Add(int real1, int imag1, int real2, int imag2) {
    	int real_res = real1 + real2;
    	int imag_res = imag1 + imag2;
    	toString(real_res, imag_res);
    }
    
    void Mul(int real1, int imag1, int real2, int imag2) {
    	
    	int imag_mul = (real1 * imag2) + (real2 * imag1);
    	int square = -(imag1 * imag2);
    	int real_mul = (real1 * real2) + square;
    	toString(real_mul, imag_mul);
    }
}

class Output {
	public static void main(String[] args) {
		
		Complex c = new Complex();
	    int real1, imag1, real2, imag2;
    	Scanner input = new Scanner(System.in);
    	//input complex number 1
    	System.out.print("Enter the real part and imaginary part of num1 : ");
        real1 = input.nextInt();
        imag1 = input.nextInt();
        //input complex number 2
        System.out.print("Enter the real part and imaginary part of num2 : ");
        real2 = input.nextInt();
        imag2 = input.nextInt();
        //sum print
        System.out.print("sum of the complex numbers : ");
        c.Add(real1, imag1, real2, imag2);
        System.out.println(" ");
        //product print
        System.out.print("multiplication of the complex numbers : ");
        c.Mul(real1, imag1, real2, imag2);
	}
}