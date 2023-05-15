
class MyCircle implements IntfCircle {
	private double r;

	public MyCircle(){ // default constructor
		this.r =1.0;
	}
	public	MyCircle(double r) { // Overloading Constructor
	
		this.r = r;
	}
    @Override
	public double findArea() {
		return PI * this.r * this.r;
	}
   @Override
	public void showArea() {
		System.out.println("Radius: " + r);
		System.out.println("Circle area: " + this.findArea()); 
	}
}
