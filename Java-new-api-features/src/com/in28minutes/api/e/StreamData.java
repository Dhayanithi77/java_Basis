package com.in28minutes.api.e;

import java.util.stream.Gatherers;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamData {

	public static void windowFixed() {
		Stream<Integer> numbers = IntStream.rangeClosed(1, 30).boxed();
		numbers.gather(Gatherers.windowFixed(5)).forEach(System.out::println);
	}

	public static void windowSliding() {
		Stream<Integer> numbers = IntStream.rangeClosed(1, 30).boxed();
		numbers.gather(Gatherers.windowSliding(5)).forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		windowSliding();
	}

}
