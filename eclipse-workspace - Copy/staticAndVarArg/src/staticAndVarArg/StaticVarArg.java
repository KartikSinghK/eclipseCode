package staticAndVarArg;
class WithStatic {
	static int num1 = 0, num2 = 0;
	static void change(int var1, int var2) {
		num1 = var1;
		num2 = var2;
		System.out.println("first number : " + num1 + " second number : " + num2);
	}
	void VarLen(int...v) {
		System.out.println("Length of the argument is : " + v.length);
	}
}
public class StaticVarArg {

	public static void main(String[] args) {
		WithStatic w = new WithStatic();
		WithStatic.change(2,3);
		w.VarLen(100);
		w.VarLen(1,3,5,6);

	}

}
