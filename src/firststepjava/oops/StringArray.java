package firststepjava.oops;

public class StringArray {

	public static void main(String[] args) {
		String[] dayOfWeek = { "Sunday", "Monday", "tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String dayOfWeekMostCharacter = "";
		for (String day : dayOfWeek) {
			if (day.length() > dayOfWeekMostCharacter.length()) {
				dayOfWeekMostCharacter = day;
			}
		}
		System.out.println("Day With most number of Character:" + dayOfWeekMostCharacter);

		for (int i = dayOfWeek.length - 1; i >= 0; i--) {
			System.out.println(dayOfWeek[i]);
		}
	}

}
