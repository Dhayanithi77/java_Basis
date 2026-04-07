package firststepjava.oops;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 98, 87, 98 };
		Student student = new Student("dhaya", marks);
		int sums = student.getTotalSumOfMarks();
		System.out.println(sums);
		int maximark = student.getmaximummark();
		System.out.println(maximark);
		int minmark = student.getminimummark();
		System.out.println(minmark);
		double average = student.getAverageMarks();
		System.out.println(average);
		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(2);
		System.out.println(student);

	}

}
