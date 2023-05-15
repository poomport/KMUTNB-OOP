/*
 * Hw 7 Abstract class
 * Ratchapoom Huabiam 
 * Id:6402041620256
 */
public class TestCylinder {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
	    
		// Call Method
		
		c.setRadius(2); // <- Can Edit changeable value
		c.setLength(3); // <- Can Edit changeable value
		
		// Call Method
		
		c.volume();
		c.surfaceArea();
        c.aboutMe();
        
        // print interface = blueprint
        
        System.out.println("Name Object : Cylinder");
        System.out.println("-----------------------------------");
        System.out.println("Variable");
        System.out.println("-----------------------------------");
        System.out.println("Pi : "+ c.getPi());
        System.out.println("Radius : "+ c.getRadius());
        System.out.println("Length :" + c.getLength());
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Volume");
        System.out.printf("Sol : %f * %f * %f * %f  \n",c.getPi() , c.getRadius() , c.getRadius() , c.getLength());
        System.out.printf("Ans : %.3f\n" ,c.volume());
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("SurfaceArea");
        System.out.printf("Sol :  2 * %f * %2f * %2f + 2 * %f * %2f * %2f \n", c.getPi() , c.getRadius() , c.getRadius() , c.getPi() ,c.getRadius() , c.getLength());
        System.out.printf("Ans : %.3f\n" ,c.surfaceArea());
        System.out.println("---------------------------------------------------------------------------------");
        
	}

}
