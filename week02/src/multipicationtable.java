/**********
 * Ratchapoom Huabiam
 * ID 6402041620256
 */

import java.util.Scanner;

public class multipicationtable {

	public static void main(String[] args) {
		
			int num = 0;
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.print("Enter number :");
		    num = sc.nextInt();
		     
		    System.out.printf("multipication table : %d\n",num);	 
		    
		    for(int i=1; i<=12; i++) 
		    {
		    if(num<1){
		    System.out.println("Fail. try again please"); break;
	        }
		   
		    System.out.printf("%d*%d:%d\n",num,i,num*i);	
		    }
		    
		    System.out.println("ByeBye!!!");
		    sc.close(); // Close Scanner
			
	      
		
}
	}

