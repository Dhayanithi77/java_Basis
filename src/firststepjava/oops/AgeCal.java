package firststepjava.oops;

abstract class Name {
	abstract void age();
}

class Vijay extends Name {
	@Override
	void age() {
		System.out.println("Vijay Age is 45");
	}
}

class Dhaya extends Name {
	@Override
	void age() {
		System.out.println("Dhaya Age is 20");
	}
}
public class AgeCal {


	public static void main(String[] args) {
		Name a = new Vijay();
		a.age();

	}

}
