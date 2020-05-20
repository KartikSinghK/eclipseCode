package underAge;

public class UnderAge extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int age = 0;
    public UnderAge(int a) {
    	age = a;
    }
    public String toString() {
    	return("Under age! " + age);
    }
     
}
