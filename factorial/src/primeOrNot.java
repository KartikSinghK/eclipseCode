import java.util.Scanner;
public class primeOrNot {
  public static void main(String args[]) {
	 Scanner input = new Scanner(System.in);
	 int num;
	 System.out.print("Enter the number to check : ");
	 num = input.nextInt();
	 int check  = 1;
	 for (int i = 1; i < num; i++) {
		 if(num % i == 0) check ++;
	 }
	 if(check == 2) System.out.println("The number is Prime");
	 else System.out.println("The number is not Prime");
  }
}
