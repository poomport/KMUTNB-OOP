/**
  Hw6: Inheritance
  Ratchapoom Huabiam
  ID: 6402041620256
 */

public class BoxCylinder extends Circle {
// Properties pi,radius,typename,length.
	private double length;
	private double Radiusouter; 
	String typename; 
	
	// Constructor
	// Default Constructor
	public BoxCylinder() {  // If input doesn't apply. // It enforcement to Constructor.
		super();
		this.length = 1;	
		this.typename = "Cylender's Constructor";
	}
	// Overloading Constructor 0
    public BoxCylinder(double radius) {   // If there is input radius but no length. // It enforcement to Overloading Constructor 0.
    	super(radius); // Call Constructor of Superclass.
    	this.length = 1; // Because set length cannot be 0
    	this.typename = "Cylender's Constructor Null length";
    }
	// Overloading Constructor 1
	public BoxCylinder(double radius,double length) { // If have both. // It enforcement to Overloading Constructor 1.
		super(radius);
		if(length==0) this.length = 1;
		else this.length = length;
		this.typename = "Cylinder's Overloading";
	}
	// Setter()
	public void setLength(double length) { // set length cannot be 0
		if(length == 0) this.length = 1;
		else this.length = length;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public void setRadiusouter(double R) {
		if(Radiusouter == 0) this.Radiusouter = 1;
		else this.Radiusouter = R;
	}
	
	// Getter()
	public double getLength() {
		return length;
	}
	public String getTypename() {
		return typename;
	}
	public double getRadiusouter() {
		return Radiusouter;
	}
	// Cylindrical formulation (normal shape)	
	public double computeVolume() {
		double volume = super.computeArea() * this.length;
		return volume;
	}
	public double computeSurfaceArea() {
		double surfacearea = super.circumference() * this.length + 2 * super.computeArea(); 
		return surfacearea;
	}
	// Cylindrical formulation (Hollow shape) or pvc pipe
	public double computeVolume1() {
		double volume1 = super.getPi() * this.Radiusouter * this.Radiusouter * this.length - super.computeArea() * this.length;
		return volume1;
	}	
	public double computeSurfaceArea1() {
		double surfacearea1 = 2 * (super.getPi()*this.Radiusouter*this.Radiusouter - super.computeArea()) + 2 *( super.getPi() * this.Radiusouter * this.length)+ super.circumference() * this.length  ;
	    return surfacearea1;
	}
	
	
	    public void displayDetail0() {
		System.out.println("=== Class BoxCylinder ====");
		System.out.println("-------------------------------------------------------");
		System.out.println("Type   : "+this.typename); // Specify type Constructor.
		System.out.println("Pi     : "+super.getPi());
		System.out.println("Radius : "+super.getRadius());
		System.out.println("Length : "+this.length);
		System.out.println("-------------------------------------------------------");
		System.out.println("Name   : Cylindrical");
		System.out.println("-------------------------------------------------------");
		System.out.println("Volume : Pi  * r  * r * l");
		System.out.printf("Sol    : %.2f * %.2f * %.2f * %.2f \n",super.getPi(),super.getRadius(),super.getRadius(),this.length);
	    System.out.printf("Ans.   : %.2f\n",this.computeVolume());
	    System.out.println("---------------------------------------------------------------------------------------");
	    System.out.println("SurfaceArea : 2*(Pi * r * l ) + 2(Pi * r * r)");
	    System.out.printf("Sol    : 2 * (%.2f * %.2f * %.2f) + 2 * (%.2f * %.2f * %.2f)\n",super.getPi(),super.getRadius(),this.length,super.getPi(),super.getRadius(),super.getRadius());
	    System.out.printf("Ans.   : %.2f\n",this.computeSurfaceArea());
	    System.out.println("---------------------------------------------------------------------------------------");
	    }
	
	    public void displayDetail1() {
		System.out.println("=== Class BoxCylinder ====");
		System.out.println("-------------------------------------------------------");
		System.out.println("Type        : "+this.typename); // Specify type Constructor.
		System.out.println("Pi          : "+super.getPi());
		System.out.println("Radius      : "+super.getRadius());
		System.out.println("Radiusouter : "+this.Radiusouter);
		System.out.println("Length      : "+this.length);
		System.out.println("----------------------------------------------------------------");
		System.out.println("Name   : Hollow Cylindrical ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Volume : (Pi * R * R * l) - (Pi * r * r * l)");
		System.out.printf("Sol    : (%.2f * %.2f * %.2f * %.2f) - (%.2f * %.2f * %.2f * %.2f )\n",super.getPi(),this.Radiusouter,this.Radiusouter,this.length,super.getPi(),super.getRadius(),super.getRadius(),this.length);
	    System.out.printf("Ans.   : %.2f\n",this.computeVolume1());
	    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println("SurfaceArea : 2 * (Pi * R * R - Pi * r * r) + 2 *( Pi * R * l )+ 2 * Pi * r  * l");
	    System.out.printf("Sol    : 2 * (%.2f * %.2f * %.2f - %.2f * %.2f * %.2f) + 2 * %.2f * %.2f * %.2f + 2 * %.2f * %.2f * %.2f\n",super.getPi(),this.Radiusouter,this.Radiusouter,super.getPi(),super.getRadius(),super.getRadius(),super.getPi(),this.Radiusouter,this.length,super.getPi(),super.getRadius(),this.length);
	    System.out.printf("Ans.   : %.2f\n",this.computeSurfaceArea1());
	    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
	    }	
}
