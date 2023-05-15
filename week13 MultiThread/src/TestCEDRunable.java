
public class TestCEDRunable {

	public static void main(String[] args) {
		// 3. Create object of class CEDRunable
		CEDRunable ced1 = new CEDRunable();
	    CEDRunable ced2 = new CEDRunable();
		CEDRunable ced3 = new CEDRunable();
		// 4. Create object of class Thread // Build Thread Run CEDRunable
        Thread t1 = new Thread(ced1,"Thread CED1");
        Thread t2 = new Thread(ced2,"Thread CED2");
        Thread t3 = new Thread(ced3,"Thread CED3");        
        // 5. run our Thread by calling start()
        t1.start();
        t2.start();
        t3.start();
        // 6. wait for all Thread to finish (using join();)
        try {
			 t1.join();
			 t2.join();
			 t3.join();
		 }
		 catch(InterruptedException e) {			
		 }
        System.out.println("****main() BYE BYE!!!");
	}

}
