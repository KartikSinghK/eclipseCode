
package que2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			try {
//				Person p = new Person("kartik",19, "kartik@gmail.com");
//		        System.out.println(p);
//		        p.displayCount();
//			}
//			catch(InvalidEmailException e) {
//				System.out.println(e);
//			}
//			
//			try {
//				System.out.println(" ");
//		        Person p1 = new Person("yash",19, "yash@gmail.com");
//		        System.out.println(p1);
//		        p1.displayCount();
//			}
//			catch(InvalidEmailException e) {
//				System.out.println(e);
//			}
//			
//			try {
//				System.out.println(" ");
//		        Person p2 = new Person("addi",19, "addi@gmail.com");
//		        System.out.println(p2);
//		        p2.displayCount();
//			}
//			catch(InvalidEmailException e) {
//				System.out.println(e);
//			}
//			
//			try {
//				System.out.println(" ");
//		        Person p3 = new Person("NPS",19, "nps@gmail.com");
//		        System.out.println(p3);
//		        p3.displayCount();
//			}
//			catch(InvalidEmailException e) {
//				System.out.println(e);
//			}
//			
//			try {
//				System.out.println(" ");
//		        Person p4 = new Person("Sahil",19, "sahilgmail.com");
//		        System.out.println(p4);
//		        p4.displayCount();
//			}
//			catch(InvalidEmailException e) {
//				System.out.println(e);
//			}
//			
//			try {
//				System.out.println(" ");
//		        Person p5 = new Person("Chandu",19, "Chandu@gmail.com");
//		        System.out.println(p5);
//		        p5.displayCount();	
//			}
//			catch(InvalidEmailException e) {
//				System.out.println(e);
//			}
			String names[] = {"k", "a", "r", "t", "i", "k"};
			int age[] = {1, 2, 4, 5, 6, 6};
			String email[] = { "k@123", "l@123", "m@123", "2@22", "2", "j"};
			Person[] p = new Person[6];
			for(int i = 0; i < 6; i++) {
				
				p[i] = new Person(names[i], age[i], email[i]);
				System.out.println(" ");
				System.out.println(p[i]);
				
				try {
					p[i].displayCount();
				}
				catch(InvalidEmailException e) {
					System.out.println(e);
				}
				
			}
	    }
		catch(ExcessMemberException e) {
			System.out.println(e);
		}
	}

}
