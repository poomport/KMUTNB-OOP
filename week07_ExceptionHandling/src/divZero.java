//import java.io.*;

class divZero {
	public static void main(String args[ ]) {
		int numerator = 10;
		int denominator = 0;
		try {
			System.out.println("Numerator/Denominator = " + numerator/denominator);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Result: 0");
			System.err.println("CATCH in ArithmeticException");
			System.err.println(ae);
		}
		catch (Exception e) {
			System.err.println("CATCH in Exception");
			System.err.println(e);
		}
		finally {
			System.out.println("======== Finally ========");			
		}

	} //End of main
} //End of class