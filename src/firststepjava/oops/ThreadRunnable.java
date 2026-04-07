package firststepjava.oops;


class Task1 extends Thread {
	@Override
	public void run() {
		for (int i = 100; i <= 199; i++) {
			System.out.println(i + " ");

			System.out.println("Task 1 Completed");
		}
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		for (int i = 200; i <= 299; i++) {
			System.out.println(i + " ");

			System.out.println("Task 2 Completed");
		}

	}
}

public class ThreadRunnable {

	public static void main(String[] args) {

		Task1 task1 = new Task1();

		task1.run();
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.run();

	}
}