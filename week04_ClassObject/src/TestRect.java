/**
  
  Ratchapoom Huabiam
  Id:6402041620256

**/
public class TestRect {

	public static void main(String[] args) {
	  // Create an object of class Rectangle
		Rectangle rect1 = new Rectangle(); // <<-- to create an object (new)
        Rectangle rect2;
        rect2 = new Rectangle();
        // Access the properties of the object
        rect1.width  = 10.0;
        rect1.height = 20.5;
        rect1.name = "RectA";
        
        rect2.width  = 33.0;
        rect2.height = 238.03;
        rect2.name = "RectB";
        
        double area1 = rect1.computeArea();
        System.out.println("Width of rect1 ="+ rect1.width);
        System.out.printf("height of rect1 =%.2f\n", rect1.height);
        System.out.println("name of rect1= "+rect1.name);
        //print the name to rect1
        System.out.println("Area of rect1 ="+ area1);
        System.out.println("--------------------------");
        System.out.println("Width of rect2 ="+rect2.width);
        System.out.printf("height of rect2 =%.2f\n", rect2.height);
        System.out.println("name of rect2 ="+rect2.name);
        //print the name of rect2
        System.out.printf("Area of rect2 =%.2f\n",rect2.computeArea());
	}
}

