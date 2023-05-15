import java.io.*;
public class multiException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numerator = 10;
		int denominator = 10;
		int[] arr = new int[5]; // Allocate 5 integers in memory arr[0] - arr[4];
		try {
			System.out.println("Numerator/Denominator = " + numerator/denominator);
			
			FileReader fr = new FileReader("C:\\test.txt");//.//divZero.java
			BufferedReader inputFile = new BufferedReader (fr);
			int x = inputFile.read();
			int a = arr[-1];
		}
		// .....
		// ......
		// Unexpected Exception
		/*
		catch (FileNotFoundException fnf) {
			System.err.println("CATCH in File Not Found Exception.");
			//System.err.println(fnf);
		}
		catch (IOException ioe) {
			System.err.println("CATCH in IO Exception.");
			//System.err.println(ioe);
		}
		catch (ArrayIndexOutOfBoundsException arrex) {
			System.err.println("CATCH in ArrayIndexOutOfBoundsException.");
			//System.err.println(arrex.getMessage());	
			//System.err.println(arrex);
		}
	    catch (ArithmeticException ae) {
			System.err.println("CATCH in ArithmeticException");
		    System.err.println(ae.getMessage());
			System.err.println(ae);
		}*/
		catch (Exception e) { // Exception e = new ArrayIndexOutOfBoundsException()
			// Unexpected Exceptions.
			System.err.println("CATCH in EXCEPTION");
			System.err.println(e.getClass());				
		}
        finally {
        	System.out.println("Finally : Bye Bye!!");
        }
	}
}
