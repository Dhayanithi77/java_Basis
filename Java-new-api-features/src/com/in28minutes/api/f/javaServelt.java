package com.in28minutes.api.f;

class Run implements Runnable {
	@Override
	public void run() {
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
	}
}

public class javaServelt {
	public static void main(String[] args) {
		new Thread(new Run()).start();

	}
}
