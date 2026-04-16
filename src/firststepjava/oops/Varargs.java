package firststepjava.oops;

import java.util.Arrays;

public class Varargs {
	public static int sum(int... numbers) {
		return Arrays.stream(numbers).sum();
	}
	public static void main(String[] args) {
		System.out.println(sum(2, 3, 4));
		System.out.println(sum(2, 56, 88, 43, 245, 89));
		System.out.println(sum());
	}

}
