
public class CEDstudent implements ICEDStudent {
     // property
	private String genName;
	// Constructor
	public CEDstudent() {
		this.genName = "Modern students";
	}
		// overloading
		public CEDstudent(String genName) {
			this.genName = genName;
		
	}
		public void aboutMe() {
			System.out.println("CED#10 : Dept. of Computer Education");
			System.out.println("Generation Name :"+ this.genName);
		}
	@Override
	public void eat(){
		System.out.println("CED students eat a lot!!!");

	}

	@Override
	public void sleep(){
		System.out.println("CED sleep allday along");

	}

}
