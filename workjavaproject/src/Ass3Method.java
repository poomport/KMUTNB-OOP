/**
  Assignment3 Method
  
  Ratchapoom Huabiam
  Id:6402041620256

  I use sol return with argument.

**/
import java.util.Scanner;
public class Ass3Method {

	public static void main(String[] args) {
	double Num1,Num2,Result; //Declare a variable of the type double.
	
	Scanner sc = new Scanner(System.in); 
	System.out.println("================================================");
	System.out.println("                  Suggestion!!!         ");
	System.out.println("***You should input value from keyboard 2 Num***");
	System.out.println("------------------------------------------------");
	System.out.print("Enter your Num1:"); // Get integer from Keyboard.
    Num1 = sc.nextDouble(); // Open Scanner.
	System.out.print("Enter your Num2:"); // Get integer from Keyboard.
	Num2 = sc.nextDouble(); // Open Scanner.
	System.out.println("------------------------------------------------");
	Result = add(Num1,Num2);	
    System.out.printf("Add : %.2f + %.2f = %.2f\n",Num1,Num2,Result);
    Result = subtract(Num1,Num2);
    System.out.printf("Sub : %.2f - %.2f = %.2f\n",Num1,Num2,Result);
    Result = multiply(Num1,Num2);
    System.out.printf("Mul : %.2f * %.2f = %.2f\n",Num1,Num2,Result);
    Result = divide(Num1,Num2); 
    System.out.printf("Div : %.2f / %.2f = %.2f\n",Num1,Num2,Result);
    System.out.println("------------------------------------------------");
    
    //I trial test. // I want trial build choice in program exit program or stay program.
    int sw,i ; //Declare a variable of the type int.
    System.out.println("Do you want to stay program ?");
    System.out.println("If exit select 1 or If stay select 2");
    System.out.print("Your select :");
    sw = sc.nextInt(); // Open scanner.
    switch (sw) {
    case 1: // Choice Exit program!!
    System.out.println("End program");
    System.out.println("Thank you for using in my program");
    System.out.println("ByeBye!!!");
    break;
    case 2: // Choice stay program (one time notification)
    System.out.println("Continue use program");
    for(i=1;i<=100;i++) {
	System.out.print("Enter your Num1:");
    Num1 = sc.nextDouble();
	System.out.print("Enter your Num2:");
	Num2 = sc.nextDouble();
	System.out.println("------------------------------------------------");
	Result = add(Num1,Num2);	
    System.out.printf("Add : %.2f + %.2f = %.2f\n",Num1,Num2,Result);
    Result = subtract(Num1,Num2);
    System.out.printf("Sub : %.2f - %.2f = %.2f\n",Num1,Num2,Result);
    Result = multiply(Num1,Num2);
    System.out.printf("Mul : %.2f * %.2f = %.2f\n",Num1,Num2,Result);
    Result = divide(Num1,Num2); 
    System.out.printf("Div : %.2f / %.2f = %.2f\n",Num1,Num2,Result);
    System.out.println("------------------------------------------------");
    }}
    
    sc.close(); //Close all Scanner
	}

	public static double add(double AddN1,double AddN2) {
	double res;
	res = AddN1 + AddN2;
	return res;
	}
	public static double subtract(double AddN1,double AddN2) {
	double res;
	res = AddN1 - AddN2;
	return res;
	}
	public static double multiply(double AddN1,double AddN2) {
	double res;
	res = AddN1 * AddN2;
	return res;
	}
	public static double divide(double AddN1,double AddN2) {
	double res;
	res = AddN1 / AddN2;
	return res;
	}
}
