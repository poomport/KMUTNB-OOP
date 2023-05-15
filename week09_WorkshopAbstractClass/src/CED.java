
public class CED extends AbstCED {
	// Constructor
	public CED() {
		super(); // call default constructor
	}
	// Overloading Constructor
	public CED(int gen) {
		super(gen);
	}
	@Override
	public void eat() {
		System.out.println("CED students eat a lot!!!");
	}
    @Override
    public void sleep() {
    	System.out.println("CED students sleep all day long!!!");	
    }
    
    //Additional method 
    public void study() {
    	System.out.println("We study very hard!!!");
    }
}
