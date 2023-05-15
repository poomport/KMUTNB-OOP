
public class RecursiveFunction {
// function = method 
	// Recursive method
	public static void main(String[] args) {
	
	int x =6;
	int facx = factorial(x);
	System.out.printf("%d! = %d\n",x,facx);
	// ทำได้แต่แนะนำทำเป็นตัวแปรดีกว่า
	/*
	System.out.printf("%4! = %d\n",x,factorial(4));
	*/
	}
	
	static int factorial(int x) { // x must be0 or positive integer
    if (x==0) return 1;
    else return x * factorial(x-1);
    }
   
}
