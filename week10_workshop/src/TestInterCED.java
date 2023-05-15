
public class TestInterCED {
public static void main(String[] args){
	CEDstudent x;
	x = new CEDstudent("Smart students"); // overloading constructor
	
	x.eat();
	x.sleep();
	x.aboutMe();
	System.out.println("Gen = "+ICEDStudent.gen);
	System.out.println("Motto"+ICEDStudent.motto);
}
}
