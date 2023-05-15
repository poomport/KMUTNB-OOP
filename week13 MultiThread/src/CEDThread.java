
public class CEDThread extends Thread { // 1.Create a Class that extends Thread
    // Property
	private String myName;
	
	// Constructor
	public CEDThread() {
		super();
	}
	public CEDThread(String name) {
		this.myName = name;
	}
	
	/*Method*/
	
	//Setter
	public void setMyName(String name) {
		this.myName = name;
	}
	//Getter
	public String getMyName() {
		return this.myName;
	}
	public void run() { // 2.Override run()
		                // It is similar to main()
		long delay = 0L;
		for(int i=0; i<10; i++) {		
			delay = (long)(Math.random()* 500)+500; //500-1000
			
			System.out.println(i + ": Hello CED from : "+this.myName+" --- Delay : "+delay);
			try {
				//super.sleep(500); // Static
				Thread.sleep(delay); //same super
			} 
			catch (InterruptedException e) {	
			}
		}		
	}
}
