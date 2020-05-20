package que7;
import java.io.*;
public class Slash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        try(BufferedReader b = new BufferedReader(new FileReader("File1"))){
        	String line = b.readLine();
        	while(line != null) {
            	if(line.charAt(0) == '/'&& line.charAt(1) == '/') {
            		System.out.println(line);
            	}
            	line = b.readLine();
        	}
        	
        }
        catch(IOException e) {
        	System.out.println(e);
        }
	}

}
