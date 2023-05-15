
class Triangle implements Shape {
    @Override
	public void draw() {
 		System.out.println("Overriding method draw() in Triangle");
	}

	public void erase() {
		System.out.println("Overriding method erase() in Triangle");
	}
}
