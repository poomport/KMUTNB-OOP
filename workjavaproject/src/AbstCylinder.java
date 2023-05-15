/*
 * AbstCylinder {abstract}}
 * By: Soradech Krootjohn
 */

public abstract class AbstCylinder {
	protected double radius;
	protected double length;
	
	// Constructor
	public AbstCylinder() {
		this.radius = 1.0;
		this.length = 1.0;
	}
	// Overload Constructor
	public AbstCylinder(double radius, double length) {
		this.radius = radius;
		this.length = length;
	}
	// Abstract Method
	public abstract double volume();
	public abstract double surfaceArea();
	
	public void aboutMe() {
		String str = "AbstCylinder by Computer Education";
		System.out.println(str);
	}
	
}