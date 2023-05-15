import java.io.IOException;

public class ioException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("=====================");
			System.out.println("      Main Menu");
			System.out.println("=====================");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Transfer");
			System.out.println("4. Check Balance");
			System.out.println("=====================");
			System.out.println("Enter Number: ");
			int c = System.in.read();
			
			char ch = (char) c;
			
			System.out.println("You select " + ch);
		}
		catch (IOException e) {
			System.err.println("ERROR: System.in.read\n" + e.getMessage());
		}
	}
}
