package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Johny");
		name.add("dhaya");
		name.add("dhanush");
		whatare(name);
		doNotChange(name);

		System.out.println(name);
	}

	private static void whatare(List<String> name) {
		name.add("what are you");

	}

	private static void doNotChange(List<String> name) {
		name.add("do Not Change");
		name.add("All out");

	}


}
