
public class Rectangle {//Our Rectangle blueprint

//class with Encapsulation

	//Properties = width,height,name (private for properties)
	private double width;
	private double height;
	private String name;
	
	
	///***Special method***///
	public Rectangle() {
		//System.out.println("Hello Rectangle");
		//Initial the value of our properties
		this.width = 1.0;
		this.height = 1.0;
		this.name = "CED 1 RA";
	}
	public Rectangle(double width,double height) { // Overloading Constructor
		/*if(width==0)this.width = 1.0;
		else if(width<0)this.width = width * - 1;
		else this.width = Math.abs(width);
		
		if(height==0) this.height = 1.0;
		else this.height = Math.abs(height);
		//this.width = width; // can be 0 or negative
		//this.height = height;
		this.name = "CED 1RA overload";*/
		//this.setWidth(width);
		//this.setHeight(height);
		this.setSize(width, height);
		this.name = "CED 1RA Overload";
	}
	public Rectangle(double width,double height,String name) {
		this.setSize(width, height);
		this.name = name;//this.setName(name);
	}
	
	
	//methods should be declared as public
	//Setter()
	public void setWidth(double width) {
		if(width==0)this.width = 1.0;
		//if(width<0)this.width = width * - 1;
		else this.width = Math.abs(width);
	}
	public void setHeight(double height) {
		if(height==0) this.height = 1.0;
		else this.height = Math.abs(height);
	}
	public void setSize(double width,double height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter()
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
	
	/*** Method ***/
	public double computeArea() {
		double area=0;
		area = this.width * this.height;		
		return area;
	}
	   public void displayDetail() { //Indentation => increase readability
			System.out.println(" === Class Rectangle ===");
		System.out.println("Name: : "  + this.name);
		System.out.println("Width  : "  + this.width);
		System.out.println("Height : "  + this.height);
		System.out.println("Area    : "  + this.computeArea());
		System.out.println("-------------------------");
	}


}
