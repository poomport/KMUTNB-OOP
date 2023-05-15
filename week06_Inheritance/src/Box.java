
public class Box extends Rectangle {
  // Properties width , height , depth
	private double depth;
	// Constructor
	// Default Constructor
	public Box() {
	    // set width = 1.0 , height = 1.0 , depth = 1.0
		super(); // Call Constructor of superclass
		this.depth = 1.0;	
	}
	// Overloading Constructor
	public Box(double width, double height,double depth) {
		super(width,height);
		this.setDepth (depth); // It not zero nor negative.
	}
	// Setter() for our depth
	public void setDepth(double depth) { // depth cannot be 0 nor negative	
	    if(depth==0) this.depth = 1.0;
	    else this.depth = Math.abs(depth); 	
	}
	public void setSize(double width,double height,double depth) {
		//super.setWidth(width); // superclass's method
		//super.setHeight(height); // superclass's method
		super.setSize(width, height); // call setSize(() of rectangle (superclass)
		this.setDepth(depth);
	}
	// Getter() for our depth
	public double getDepth() {
		return this.depth;
	}
	public double computeVolume() {
		//double volume =  super.getWidth() * super.getHeight()* this.depth;
	    double volume = super.computeArea() * this.depth;
	    return volume;
	}
	public void displayDetail() { // Overriding Method(displayDetail of Box)
    	System.out.println(" === Class Box ===");
		System.out.println("Name   : "  + super.getName());
		System.out.println("Width  : "  + super.getWidth());
		System.out.println("Height : "  + super.getHeight());
		System.out.println("Depth  : "  + this.depth);
		System.out.println("Area   : "  + this.computeVolume());
		System.out.println("------------------------");
    }

}
