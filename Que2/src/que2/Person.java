package que2;

public class Person {
      private String name;
      private int age;
      private String email;
      private static int count = 0;
      
      //parameterize constructor 
      
      Person(String pName, int pAge, String pEmail){
    	  this.name = pName;
    	  this.age = pAge;
    	  this.email = pEmail;
    	  count++;  //this will help to count the number of instances
      }
      
      void displayCount() throws ExcessMemberException, InvalidEmailException {
    	  int check = 0;
    	  for(int i = 0; i < email.length(); i++) {
    		  if(email.charAt(i)=='@') {
    			  check++;
    		  }
    	  }
    	  System.out.println("The number of instances are : " + count);
    	  if(count > 5) {
    		  throw new ExcessMemberException();
    	  }
    	  if(check != 1)
    		  throw new InvalidEmailException();
    	  }
      public String toString() {
    	  return("Name : " + name + " | age : " + age + " | email : " + email);
      }
}
