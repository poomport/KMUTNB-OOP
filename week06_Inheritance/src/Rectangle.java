

	// Class with Encapsulation

	public class Rectangle { // Our Rectangle Blueprint
		//Properties = width, height, name  (properties should be declared as private)
		private double width;  // This width is a property.
		private double height;
		protected String name;
		
		/*** Constructor ***/
		public Rectangle() { // Default Constructor
			// Initial the value of our properties
			this.width = 1.0;
			this.height = 1.0;
			this.name = "CED 1 RA";
		}
		public Rectangle(double width, double height) { // Overloading Constructor
			this.setSize(width, height);
			this.name = "CED 1 RA (Overload)";
		}
		public Rectangle(double width, double height, String name) { //Overloading Constructor
			this.setSize(width, height);
			this.name = name; //this.setName(name);
		}
		
		
		// methods should be declared as public
		// Setter()
		public void setWidth(double width) { // This width is a parameter
			if(width==0.0) 
				this.width = 1.0;
			//else if(width<0) this.width = width * -1.0;
			else 
				this.width = Math.abs(width);  // <<-- we want to assign property with parameter -> parameter to property
		}
		public void setHeight(double height) {
			if(height==0) 
				this.height = 1.0;
			else 
				this.height = Math.abs(height); // absolute  => |10| = 10     => |-10| = 10
		}
		public void setSize(double width, double height) {
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
		public double computeArea() { // Compute the area of this class = this.width * this.height
			double area;
			area = this.width * this.height;		
			return area;
		}
		
	    public void displayDetail() { // Indentation => increase readability
	    	System.out.println(" === Class Rectangle ===");
			System.out.println("Name   : "  + this.name);
			System.out.println("Width  : "  + this.width);
			System.out.println("Height : "  + this.height);
			System.out.println("Area   : "  + this.computeArea());
			System.out.println("------------------------");
	    }

		
	}

