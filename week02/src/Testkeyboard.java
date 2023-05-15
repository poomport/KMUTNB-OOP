import java.util.Scanner;

public class Testkeyboard {

	public static void main(String[] args) {
		int x; // Declare a variable of the type int
		System.out.print("Please enter a number :");
		// Want to get an interger from the keyboard
        Scanner sc = new Scanner(System.in);// System.in <== keyboard
	    // Open Scanner
        x = sc.nextInt(); // Return int //scanf("%d",&x); =>x
        System.out.println("You enter "+ x);
        System.out.println("ByeBye!!!");
        sc.close(); // Close Scanner
	}

}
 