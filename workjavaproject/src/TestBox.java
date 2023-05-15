/**
  Hw6: Inheritance
  Ratchapoom Huabiam
  ID: 6402041620256
  // Test switch choice for Cylindrical 2 styles
 */


import java.util.Scanner;
public class TestBox {
  public static void main(String[] args) {
	  //set the value can be changed.
	  BoxCylinder ans = new BoxCylinder(2,3); // <- Input field input only  Number in parentheses.
	  // Comment to put.
      // No input = output Cylender's Constructor.
      // input 1 Num  =  output Cylender's Constructor Null length.
	  // input 2 Num  =  output Cylinder's Overloading.
	  
	  
	  //set the value can be changed.
	  // Only for Cylindrical formulation (Hollow shape) or pvc pipe. Because it has an outer radius not inner radius.
	  /**if choose 2 is highly recommended you should changed setRadanouter. **/
	  ans.setRadiusouter(0); // <- Input field input only 1 Number in parentheses.
	  // input 0 output 1. Because I don't want R = 0
	
	  
	  
	  
	  
	  
	  // Lock don't change.
	  // Condition choice of shape  
	  // Please Do not change this the conditions 
	  // Because it condition choose a pattern Cylindrical display'scondition.
	  
	  Scanner sc = new Scanner(System.in); 
	  System.out.println("Select 1: Cylindrical formulation (normal shape)");
	  System.out.println("Select 2: Cylindrical formulation (Hollow shape) or pvc pipe");
	  System.out.printf("Please Select your Cylindral 1 or 2:");
	  int Sw; // 
	  Sw = sc.nextInt(); // Open Scanner.
	  System.out.println("You select:"+Sw);
		switch (Sw) {
		case 1: ans.displayDetail0(); break;
		case 2: ans.displayDetail1(); break;
		}
	  sc.close(); // close Scanner
  }
}
