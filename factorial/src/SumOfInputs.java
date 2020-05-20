import java.util.Scanner;
public class SumOfInputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements : ");
		int size = sc.nextInt();
		int nums[];
		nums = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		int sum = 0;
		for(int x:nums) {
			sum += x;
		}
		System.out.println("The sum of the numbers : " + sum);

	}

}
