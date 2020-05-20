package methodOver;

class Over {
	void firstFunc() {
		System.out.println("This is empty ");
	}
	void secArg(int arg) {
		System.out.println(arg);
	}
	void thrdArg(double arg1, int arg2) {
		System.out.println(arg1 + arg2);
	}
}
public class Overriding {

	public static void main(String[] args) {
		Over o = new Over();
		char ch = 'A';
		o.secArg(ch);
        o.thrdArg(2.5, 'x');
	}

}
