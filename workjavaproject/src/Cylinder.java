/*
 * Hw7 Abstract class
 * Ratchapoom Huabiam
 * Id:6402041620256
 */
public class Cylinder extends AbstCylinder {
	
	public double Pi = Math.PI;
	
     // Constructor
	 public Cylinder() {
		 super();	 
	 }
	 
	 // Overloading Constructor
	 public Cylinder(double radius,double length) {
		  super(radius, length);	 
	 }
	 
	 // Setter
	 
	 public void setPi(double Pi) {
		 this.Pi = Math.PI;	 
	 }
	 
	 public void setRadius(double radius) {
		 if (radius == 0) super.length = 1;
		 else super.radius = radius;
	 }
	 
	 public void setLength(double length) { // set length cannot be 0
		if(length == 0) super.length = 1;
		else super.length = length;
	}
	 
	 // Getter
	 public double getPi() {
		 return Pi;
	 }
	 
	 public double getRadius() {
		 return radius;
	 }
	 
	 public double getLength() {
		 return length;
	 }
	 
	@Override
	public double volume() {
		double volume =  this.Pi * super.radius * super.radius * super.length;
	    return volume;
	}

	@Override
	public double surfaceArea() {
		 double SurfaceArea =  2 * this.Pi * super.radius * super.radius + 2 * this.Pi * super.radius * super.length;
	     return SurfaceArea;
	}

}
