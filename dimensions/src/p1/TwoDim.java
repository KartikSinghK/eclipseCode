package p1;

public class TwoDim {
   private int x, y;
   
	public TwoDim() {
	   x = 0;
	   y = 0;
   }
	public TwoDim(int dim1, int dim2) {
		x = dim1; 
		y = dim2;
	}
	
	 public String toString() {
		return("X coordinate : " + x + " Y coordinate : " + y);
	}
}
