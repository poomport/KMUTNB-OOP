
public class Exception1 {
 public static void main(String[] args) {
	 int x = 10;
	 int y = 0;
	 int result = 100;
	 
	 try {
	 result =x/y; // It causes the exception.
	 }
	 
	 catch(ArithmeticException ae) {
		//ae.printStackTrace(); 
		 result = 0;
	 }
	 
	 finally {
	 System.out.printf("%d / %d = %d\n",x,y,result);
	 }
	 
	 System.out.println("Bye Bye!!");
 }
}
