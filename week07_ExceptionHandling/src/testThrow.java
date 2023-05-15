
public class testThrow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			myThrow(-1);
		}
		catch(myException mye)
		{
			System.err.println("CATCH in myException.");
			System.err.println(mye);
		}
		catch(Exception e)
		{
			System.err.println("CATCH in Exception.");
			System.err.println(e);
		}
	}

	
	static void myThrow(int x) throws myException
	{
		if(x<0)
		{
			myException mye = new myException();
			throw  mye;//new myException();
		}
		System.out.println("------------------");
		System.out.println("  x = " + x);
		System.out.println("------------------");
	}
}
