import java.util.Scanner;

public class NoRetNoArg {

	public static void main(String[] args) {
		// Declaration
		int x = 0;
		Scanner sc = new Scanner(System.in);
		menu();
		x = sc.nextInt();
		System.out.println("You select:" + x);
		sc.close();
	}
	// This method does not return and does not receive  parameter(s).  
    private static void menu() {
    	System.out.println("==============");
		System.out.println(" 1. Add ");
		System.out.println(" 2. Subtract ");
		System.out.println(" 3. Multiply ");
		System.out.println(" 4. Divine ");
		System.out.println("==============");
		System.out.println("Please select[1-4]:");
}
}