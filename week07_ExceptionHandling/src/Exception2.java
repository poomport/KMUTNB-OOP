import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception2 {
  public static void main(String[] args) {
	  int choice = 0;
	  //Scanner sc = new Scanner(System.in);
      printMenu();
      try {
      choice = getChoice();
      }
      catch(Exception e){
      System.out.println("You select : "+ choice);
      System.out.println("Bye Bye!!");
  }}
      /*
      try {
      choice = sc.nextInt(); // We not handle the exception
      }
      catch(InputMismatchException e) {
    	choice = 0;  
      }
      catch(Exception e) {
    	  // Do something...........
      }
      
      System.out.println("You select : "+ choice);
      sc.close();
      
     
      System.out.println("Bye Bye!!");
      
  }   */
  private static void printMenu(){
	  System.out.println("1. OK");
	  System.out.println("2. Not OK");
	  System.out.println("3. Quit"); // Quite good , Quiet
      
  }
  // 1.getChoice handle => try-catch
  /*private static int getChoice() {
	  int x = 0 ;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter [1-3]: ");
	  
	  
	  try {
	       x = sc.nextInt();
	      }
	      catch(InputMismatchException e) {
	    	x = 0;  
	      }
	 
	 
	  sc.close();
	  return x;
  }*/
  private static int getChoice() throws InputMismatchException{
	  int x = 0 ;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter [1-3]: ");
	  
	  
	  try {
	       x = sc.nextInt(); // InputMismatchException
	      }
	  catch(InputMismatchException ime) {
	  System.out.println("You must enter integer only.");
	  throw ime;
	  }
	 finally{
		sc.close();
	 }
	 
	  
	  return x;
  }
}
