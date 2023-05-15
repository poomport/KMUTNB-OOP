import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class fileException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("Z:\\test.txt");
			BufferedReader inputFile = new BufferedReader (fr);
			String txt = inputFile.readLine();
			System.out.println(txt);
		}
		catch (FileNotFoundException fnf)
		{
			System.err.println("CATCH in File Not Found Exception.");
			System.err.println(fnf);
		}
		catch (Exception e)
		{
			System.err.println("CATCH in Exception.");
			System.err.println(e);
		}

	}

}
