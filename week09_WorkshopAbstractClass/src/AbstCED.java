
public abstract class AbstCED {
 protected int gen; // Property
 
 // Constructor
 public AbstCED() { 
	 this.gen = 10;
 } 
 
 // Overloading Constructor
 public AbstCED(int gen) {
	 this.gen = gen;
 }
 
 // Abstract Method
 public abstract void eat();
 public abstract void sleep();
 
 // Normal Method
 public void aboutUs() {
	 System.out.println("We are CED #"+this.gen);
 }
}
