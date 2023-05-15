import java.util.Scanner;
public class ForHello {

	public static void main(String[] args) {
	int num = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter number of iterations :");
    num = sc.nextInt();
    
    for(int i=0; i<num; i++) // i =i+1 -> i+=1 -> ++i -> i++ ===>same
    {
    	System.out.printf("%d: Hello CED\n",i);
    	System.out.println("Last i is" + i);
    }
    
    System.out.println("ByeBye!!!");
    sc.close(); // Close Scanner
	}

}
