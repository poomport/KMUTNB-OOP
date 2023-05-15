/***
  HW5: Class and Object
  Ratchapoom Huabiam
  ID:6402041620256
 */
public class Testcircle {

	public static void main(String[] args) {
		
	  // Create an Object of class Circle.
         Circle ans = new Circle(8);  // <- Input field input only 1 Number in parentheses.
         // Comment to put.
         // No input = output Circle's Constructor.
         // input =  output Circle's Overload.
         
      // Print interface = Blue print.
         System.out.println("Object Name : "+ans.getName());
         System.out.println("--------------------------------------");
         System.out.println("Variable");
         System.out.printf("Pi = %f\n",ans.getPi());
         System.out.println("Radius = "+ ans.getRadius());
         System.out.println("--------------------------------------");
         System.out.println("Area's circle");
         System.out.printf("Sol: %f * (%.2f * %.2f) = %.2f\n",ans.getPi(),ans.getRadius(),ans.getRadius(),ans.computeArea());
         System.out.println("--------------------------------------");
         System.out.println("Circumference's circle");
         System.out.printf("Sol: 2 * %f * %.2f = %.2f\n",ans.getPi(),ans.getRadius(),ans.circumference());
         System.out.println("--------------------------------------");
	}

}
