package factorial;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num = sc.nextInt();
      int fct = 1;
      for(int i = 1; i <= num; i++) {
    	  fct *= i;
      }
        System.out.println("Factorial of " + num + " = " + fct);
	}

}
