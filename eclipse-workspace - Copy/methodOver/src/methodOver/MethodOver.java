package methodOver;
import java.util.Scanner;
public class MethodOver {

	public static void main(String[] args) {
		String que;
		int range, sum = 0, dig[];
		Scanner ans = new Scanner(System.in);
        range = Integer.parseInt(args[0]);
        dig = new int[range]; 
        System.out.println("Enter the digits : ");
        
        for(int i = 0; i < range; i++) {
        	dig[i] = ans.nextInt();
        }
        for(int i = 0; i < range; i++) {
        	sum  += dig[i];
        }
        System.out.print("The sum of the digits : ");

        System.out.print(sum);
	}

}
