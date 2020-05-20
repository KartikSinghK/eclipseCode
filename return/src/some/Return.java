package some;

public class Return {
	public static void main(String[] args) {
	    try {
	    throw new IllegalStateException("Testing");
	    } 
	    finally  {
	    System.out.println("In Finally");
	    }
	}
}
