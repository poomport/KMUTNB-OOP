
public class TestBox {

	public static void main(String[] args) {
		
		Box b1 = new Box(23,-222,2);
		//b1.setName("CED Box");
		//b1.setWidth(100);
		//1.setHeight(200);
        //double volume = b1.computeVolume();
        //System.out.println("Volume:"+volume);
		//b1.setName("B1");
		Rectangle r1 = new Rectangle(20,30);
		r1.setName("R1");
		b1.displayDetail();
		r1.displayDetail();
		
		r1 = b1; // Dynamic Polymorphism
		r1.displayDetail();
		
		/*
		Rectangle rect = new Box(22,33,11);
		rect.displayDetail();
		*/
	}
      
}
