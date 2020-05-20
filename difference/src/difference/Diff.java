package difference;

public class Diff extends DiffMain {

	public static void main(String[] args) {
		int n1 = 1, n2 = 2;
		DiffMain dif = new DiffMain();
		DiffMain dif2 = new DiffMain();
		System.out.println("The original value : " + n1 + " " + n2);
		dif.change(n1, n2);
		System.out.println("The values after executing the function : " + n1 + " " + n2);
		
		 dif2.checkOb(dif) {
			 System.out.println("The values are : " + dif.num1 + " " + dif.num2);
		 }
     }

}
