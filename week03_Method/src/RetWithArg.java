
public class RetWithArg {

	public static void main(String[] args) {
	double width,height,area;
	width = 110.78;
	height = 283.69;
    area = computeArea(width,height);
    System.out.printf("Width: %.2f - Height: %.2f -> Area : %.2f\n",width,height,area);
	}
    static double computeArea(double w , double h) { // Compute Rectangle Area
    double area;
    area = w*h;
    return area;
    }
}
