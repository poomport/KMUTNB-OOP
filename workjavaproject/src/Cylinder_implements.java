/*
 * HW 8 Interface
 * Ratchapoom Huabiam
 * Id:6402041620256
 */
public class Cylinder_implements implements ICylinder {
	
	
	protected double radius;
	protected double length;
	// Constructor 
	public Cylinder_implements() {
		super();
		this.radius = 1;
		this.length = 1;
	
	}
    // Overloading Constructor
	public Cylinder_implements(double radius,double length) {
		
		if (radius == 0) this.radius = 1;
		else this.radius = radius;
		if (length == 0) this.length = 1;
		else this.length = length;
		}
		
	
	@Override
	public double volume(double radius, double length) {
		
		double volume =  ICylinder.PI * this.radius * this.radius * this.length;
	    return volume;
	}

	@Override
	public double surfaceArea(double radius, double length) {
		double SurfaceArea =  2 * ICylinder.PI * this.radius * this.radius + 2 * ICylinder.PI* this.radius * this.length;
	    return SurfaceArea;
	}

}
