package firststepjava.oops;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}

		return sum;
	}

	public int getmaximummark() {
		return Collections.max(marks);
	}

	public int getminimummark() {

		return Collections.min(marks);
	}

	public double getAverageMarks() {

		return (double) getTotalSumOfMarks() / marks.size();
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {

		marks.add(mark);

	}

	public void removeMarkAtIndex(int mark) {
		marks.remove(mark);

	}

}

