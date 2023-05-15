
public class NoRetWithArg {

	public static void main(String[] args) {
		int a,b;
		a = 10;
		b = 20;
		
		add(a,b); // Make sure the order of the arguments matches the parameter
		add(b,a);
        stdInfo("Jon",b);
	}
    static void add(int x,int y) {
       int result = 0;
       result = x+y;
       System.out.printf("%d+%d=%d\n",x,y,result);
       System.out.println("Result = " + result);
    }
    static void stdInfo(String name , int age) {
       System.out.println("=============================");
       System.out.println("  Name : " +  name);
       System.out.println("  Age  :  " +  age);
       System.out.println("=============================");

    }
}
