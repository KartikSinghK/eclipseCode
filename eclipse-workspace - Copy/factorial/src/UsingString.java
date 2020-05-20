import java.util.Scanner;
public class UsingString {
  public static void main(String args[]) {
	  int deci, mod = 0;
	  String bin = "0";
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the Decimal number : ");
	  deci = input.nextInt();
	  while(deci != 1) {
		  mod = deci % 2;
		  deci /= 2;
		  bin = bin + mod;
		  }
	  bin = bin + deci;
	  System.out.println(bin);
  }
}
