package firststepjava.oops;

class Example {
	int id;

	Example(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Example ID: " + id;
	}
}

public class ObjectClass {
	public static void main(String[] args) {
		Example obj = new Example(10);
		Example obj1 = new Example(20);
		Example obj2 = new Example(30);
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}

