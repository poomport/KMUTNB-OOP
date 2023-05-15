
public class ooIndexException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[10];
		
		try
		{
			for(int i=0; i<10; i++)
				x[i] = i;
		
			System.out.println(x[10]);
		}
		catch (Exception arrex)
		{
			System.err.println("CATCH in ArrayIndexOutOfBoundsException.");
			System.err.println(arrex);
			testDisp();
		}
	}

	
	static void testDisp()
	{
		System.err.println("===================");
		System.err.println("       Test ");
		System.err.println("===================");
	}
}
