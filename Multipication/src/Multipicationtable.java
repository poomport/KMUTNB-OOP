import java.util.Scanner;
public class Multipicationtable {

	public static void main(String[] args) {
		int num = 0;
        int i = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input multiplication : ");
        num = sc.nextInt();
        for(i=1;i<=12;i++) {
        for(i=1;i<=12;i++) {
        	System.out.printf("%dx%d:%d\n",num,i,num*i);
        }}
        sc.close();
	}
	

}
