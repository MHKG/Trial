class Base {
	protected void foo() {}
}

class Derived extends Base {
	public void foo() {
		System.out.println("H");
	}
}

public class Main1 {
	public static void main(String[] args) {
		Derived d = new Derived();
		d.foo();
	}
}
