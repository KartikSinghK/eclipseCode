
import java.util.Scanner;
public class Complex {
	void toString(float real_part, float imag_part) {
		System.out.println(real_part + " i" + imag_part);
	}
	
    void Add(float real1, float imag1, float real2, float imag2) {
    	float real_res = real1 + real2;
    	float imag_res = imag1 + imag2;
    	toString(real_res, imag_res);
    }
    
    void Mul(float real1, float imag1, float real2, float imag2) {
    	
    	float imag_mul = (real1 * imag2) + (real2 * imag1);
    	float square = -(imag1 * imag2);
    	float real_mul = (real1 * real2) + square;
    	toString(real_mul, imag_mul);
    }
    
        
    
}

class Output {
	public static void main(String[] args) {
		Complex c = new Complex();
	
    	float real1, imag1, real2, imag2;
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the real part and imaginary part of num1 : ");
        real1 = input.nextFloat();
        imag1 = input.nextFloat();
        System.out.print("Enter the real part and imaginary part of num2 : ");
        real2 = input.nextFloat();
        imag2 = input.nextFloat();
        System.out.println("sum of the complex number : ");
        c.Add(real1, imag1, real2, imag2);
        System.out.println("multiplication of the complex number : ");
        c.Mul(real1, imag1, real2, imag2);
	}
}