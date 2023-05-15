/*
 * Hw 8 Interface
 * Ratchapoom Huabiam
 * ID: 6402041620256
 */
public class TestinterfCylinder {

	public static void main(String[] args) {
		
		Cylinder_implements ans = new Cylinder_implements(2,3); // <= can edit change value (radius,length)
		
		// Call Method
		ans.volume(0, 0);
		ans.surfaceArea(0,0);
        
		System.out.println("Name Object : Cylinder");
        System.out.println("-----------------------------------");
        System.out.println("Variable");
        System.out.println("-----------------------------------");
        System.out.println("Pi : "+ ICylinder.PI);
        System.out.println("Radius : "+ ans.radius);
        System.out.println("Length :" + ans.length);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Volume");
        System.out.printf("Sol : %f * %f * %f * %f  \n",ICylinder.PI, ans.radius , ans.radius , ans.length);
        System.out.printf("Ans : %.3f\n" ,ans.volume(0, 0));
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("SurfaceArea");
        System.out.printf("Sol :  2 * %f * %2f * %2f + 2 * %f * %2f * %2f \n", ICylinder.PI , ans.radius , ans.radius , ICylinder.PI ,ans.radius , ans.length);
        System.out.printf("Ans : %.3f\n" ,ans.surfaceArea(0,0));
        System.out.println("---------------------------------------------------------------------------------");
        
	}

}
