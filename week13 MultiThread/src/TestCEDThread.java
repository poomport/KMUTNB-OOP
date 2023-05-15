
public class TestCEDThread {

	 public static void main(String[] args) {
		 //3. Create object of thread (according the number of thread we want)
		 CEDThread ced1 = new CEDThread("CED 1");
		 CEDThread ced2 = new CEDThread("CED 2");
		 CEDThread ced3 = new CEDThread("CED 3");
		 //4. Start each thread to run
		 
		 // start will run after print // Unblock Execution
		 
		 ced1.start();
		 ced2.start();
		 ced3.start();
		 
		 // run will run before print
		  /*
		 ced1.run();
		 ced2.run();
		 ced3.run();
		 */
		 
		 //5. Wait for all thraeds to finish using join() method
		 try {
			 ced1.join();
			 ced2.join();
			 ced3.join();
		 }
		 catch(InterruptedException e) {
			 e.printStackTrace(); 
		 }
		 
		 System.out.println("Main()says BYE BYE!!!");
	 }
}
