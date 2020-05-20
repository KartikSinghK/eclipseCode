package difference;

public class DiffMain {
  int num1;
  int num2;
  void change(int var1, int var2) {
	  num1 = var1++;
	  num2 = var2++;
  }
    void checkOb(DiffMain d) {
		 d.num1 = 3;
		 d.num2 = 4;
	 }
  
}
