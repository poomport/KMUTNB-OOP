import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int score = 0;
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a score :");
        score = sc.nextInt();
         
        if(score<=49){
			System.out.println("Grade F");
		}
        else if(score < 60 && score>= 50){
			System.out.println("Grade D");
		}
        else if(score < 70 &&  score >= 60){
			System.out.println("Good: Grade C");
		}
        else if(score< 80 && score >= 70){
			System.out.println("Very Good: Grade B");
		}
        else if(score >= 80){
			System.out.println("Excellent: Grade A");
        }
        else {
			System.out.println("Failed! Try again");
		}
        
        String result = (score>=50) ? "Pass" : "Fail";
        System.out.println("You =>" + result);
        
        
        System.out.println("ByeBye!!!");
        sc.close(); // Close Scanner

	}

}
