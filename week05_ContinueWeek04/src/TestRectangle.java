
public class TestRectangle {
	public static void main(String[] args) {
		// Create an Object of class Rectangle 
		//Rectangle rect1 = new Rectangle(20,40); // to create an object (new)
		//Rectangle rect1 = new Rectangle(20,40,"CED 3 parametors");
		Rectangle rect1 = new Rectangle(-1,2);
		//rect1.displayDetail();
		//rect1.setWidth(0);20,10,"CED Paraone"
		//rect1.setHeight(0);
		//rect1.setName("Ratchapoom");
		
		//rect1.displayDetail();
		//Rectangle rect2;
		//rect2 = new Rectangle();
		
		// Access the properties of the Object
		/*rect1.width = 10.0;
		rect1.height = 20.5;
		rect1.name = "Rect A";*/
		//rect1.setWidth(-10.0);
		//rect1.setHeight(20.50);
		//rect1.setSize(-10.0,-2.5);
		//rect1.setName("New name"); 
				
		/*rect2.width = 33.0;
		rect2.height = 238.03;
		rect2.name = "Rect B";*/
		
		
		
		
		
		
		double area1 = rect1.computeArea();
		System.out.println("Area of rect 1 = "+ rect1.getWidth());
		System.out.printf("Area of rect 1 = %.2f\n",rect1.getHeight());
		System.out.println("Area of rect 1 = "+ area1);
		System.out.println("Name of rect 1 = "+ rect1.getName());
		
		
		/*
		rect2.width = 33.0;
		rect2.height = 238.03;
		rect2.name = "Rect B";
		System.out.println("-------------------------------------");
		System.out.println("Area of rect 2 = "+ rect2.width);
		System.out.printf("Area of rect 2 = %.2f\n",rect2.height);
		System.out.println("Area of rect 2 = "+rect2.computeArea());
		System.out.println("Name of rect 1 = "+ rect2.name);*/
		
		//System.out.printf("Area of rect 2 = %.2f\n",rect2.computeArea());
	}
}
