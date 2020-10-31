
public class argsLength {
	public static void main(String ... args) {
		
		argsLength test = new argsLength();
		  test.display("Apple");
		  test.display("Cat", "Dog");
		  test.display("One", "Two", "Three");
		 }

		 public void display(String ... parameters) {
		  for (String str : parameters) {
		   System.out.println("Paramters:-" + str);
		  }
		  
		  System.out.println("");
	}
	
}
