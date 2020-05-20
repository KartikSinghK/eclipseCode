package p2;
import p1.TwoDim;
public class ThreeDim extends TwoDim {
  private int z;
  TwoDim ob = new TwoDim();
  public ThreeDim() {
	  z = 0;
  }
  public ThreeDim(int d3) {
	  z = d3;
  }
  public String toString() {
	  System.out.println(ob);
	  return "Z coordinate : "+ z;
  }
}
