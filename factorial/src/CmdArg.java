public class CmdArg {
  public static void main(String args[]) {
	  int sum = 0, num;
	  String  newArr[];
	  newArr = new String[1];
	  newArr[0] = args[0];
	  num = Integer.parseInt(newArr[0]);
	  while(num != 0) {
		  sum += (num % 10);
		  num /= 10;
	  }
	  System.out.println(sum);
  }
}
