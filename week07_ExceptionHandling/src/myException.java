
public class myException extends Exception {

	myException()
	{
		System.out.println("***** myException's Default Construction *****");
	}
	
	myException(int i)
	{
		System.out.println("Construct's parameter: " + i);
	}
	
	public void display()
	{
		System.out.println("***** display method in myException *****");
	}
}
