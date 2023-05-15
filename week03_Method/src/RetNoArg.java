
public class RetNoArg {

	public static void main(String[] args) {
	double radius = 5.5; // Radius of a circle <---Scanner to read the value from keyboard
    double area = pi() *radius *radius; // compute Circle "s area
    double circum = 2 * pi() *radius;  // compute Circle"s circumference
    System.out.println("radius =" + radius);
    System.out.println("area =" + area);
    System.out.printf("circumference = %.4f\n" ,circum);
	}
	// Method that doesn't require an argument but return a double
    public static double pi(){
    double p;
    p = 22.0/7.0;
    return p;	
    }
}
