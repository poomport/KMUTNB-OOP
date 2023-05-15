
public class CEDRunable implements Runnable {
	private String myName; // Property
	
	//Default Constructor
	public CEDRunable() {
		super();
		this.myName = "Test C";
	}
	
	//Overloading Constructor
	public CEDRunable(String name) {
		super();
		this.myName = "Test OC";
	}
	
	//Setter
	public void setMyName(String name) {
		this.myName = name;
	}
	// Getter
	public String getMyName(){
		return this.myName;
	}
	
	@Override
	public void run() {
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
