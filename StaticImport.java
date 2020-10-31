import static java.lang.Math.*;
//import java.lang.Math;
public class StaticImport {
	public void testAbs() {
		
		  System.out.println(abs(-100));
		  System.out.println(sqrt(25));

		 }

		 public static void main(String[] args) {
		  new StaticImport().testAbs();
		 }
}
