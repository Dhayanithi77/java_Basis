package com.in28minutes.api.c;

public class PatternMatchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object objStr = "Doing";
		instanceOfOld(objStr);
	}

	private static void instanceOfOld(Object objStr) {
		// TODO Auto-generated method stub
		if (objStr instanceof String str) {
			System.out.println(str.toUpperCase());
		}
	}

	public static void instanceOfNew(Object objStr) {
		if (objStr instanceof String s) {
			System.out.println(s.toLowerCase());
		}
	}

}
