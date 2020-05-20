package varLenAndStatic;
class ClassWithStatic {
	static int num1 = 1, num2 = 2;
	static void func(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		System.out.println("First number : " + num1 + " second num : " + num2);
	}
	void VarLenFunc(int ...v) {
		System.out.println("Length of the argument is : " + v.length);
	}
}
public class VarLen {

	public static void main(String[] args) {
		ClassWithStatic ob = new ClassWithStatic();
		ob.VarLenFunc(1, 2, 3, 4);
		ob.VarLenFunc(2);
		ClassWithStatic.func(2,  3);

	}

}
