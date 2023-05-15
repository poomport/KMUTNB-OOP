import java.util.Scanner;
public class ScoreTest {

	public static void main(String[] args) {
		/***
		 * Declare score as int
		 * Open Scanner
		 * print => "Please enter score:"
		 * Get int from KBD and assign to score
		 * Check if pass/fail => print the result
		 * Close Scanner
		 */
         int score = 0;
         Scanner sc = new Scanner(System.in);
         System.out.print("Please enter a score :");
         score = sc.nextInt();
         if(score>49) {
        	 System.out.println("You Pass.");
        	 System.out.println("You are good student.");
        	 }
         else if(score<=49) {
        	 System.out.println("You Fail.");
        	 System.out.println("Please try harder.");
         }
         System.out.println("ByeBye!!!");
         sc.close(); // Close Scanner
	}

}
