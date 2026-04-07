package firststepjava.oops;

import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List.of("Dog", "Cat", "apple", "grape", "bee", "Banana").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));
	}

}
