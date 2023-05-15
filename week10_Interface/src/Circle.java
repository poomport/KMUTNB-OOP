
class Circle implements Shape {
@Override
	public void draw() {
		System.out.println("Overriding method draw() in Circle");
	}

	public void erase() {
		System.out.println("Overriding method erase() in Circle");
	}
}
