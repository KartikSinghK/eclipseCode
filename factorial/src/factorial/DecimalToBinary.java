package factorial;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int BinaryResult[];
		int Decimal, size = 0;
		
		System.out.println("Enter the decimal number : ");
		Decimal = sc.nextInt();
		int fDec = Decimal;
		while(fDec != 1)
		{
		  fDec /= 2;
		  size++;
		}
		size++;
		BinaryResult = new int[size];
		for(int i = 0; i < size; i++) {
			BinaryResult[i] = Decimal % 2;
			Decimal /= 2;
			
		}
		for(int re = size - 1; re >= 0; re--) {
			System.out.print(BinaryResult[re]);
		}
	}

}
