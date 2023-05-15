/***
    HW5: Class and Object
    Ratchapoom Huabiam
    ID:6402041620256
 */
public class Circle {
    // Properties = pi,radius,name.
	private double pi = Math.PI; // Math.PI reference ->Java Math Class.
	private double radius;
    String name; // Default
	
	// Method should be Declare as public.
	
	/*** Constructor ***/
	// Default Constructor // Initial the value of our Properties
	public Circle() { // No input output radius = 1.
		
		this.radius = 1;
		this.name = "Circle's Constructor";
	}
	// Overload Constructor
	public Circle(double radius) { 
	   
		if(radius == 0) this.radius = 1; // Input 0 Output radius = -1. 
		else this.radius = radius; // Input lower than 0 Output = radius.
		this.name = "Circle's  Overload";		
	}
	
	// Setter()
	
	public void setPi(double pi) {
	    this.pi = Math.PI; // Math Class Pi -> 3.141539
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter ()
	public double getPi() {
		return pi;
	}
	public double getRadius() {
		return radius;
	}
	public String getName() {
		return name;
	}
	
	// Method = Java function
	public double computeArea() {
		double area;
		area = this.pi * (this.radius * this.radius);
		return area;
	}
	public double circumference() {
	    double Circle_circumference;
	    Circle_circumference = 2 * this.pi * this.radius;
	    return Circle_circumference;
	}
}
