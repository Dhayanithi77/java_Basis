package firststepjava.oops;

import java.util.EnumSet;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Enumset {


	public static void main(String[] args) {

		EnumSet<Day> weekend = EnumSet.of(Day.SUNDAY, Day.SATURDAY);
		System.out.println(weekend);
		EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
		System.out.println(weekdays);
		EnumSet<Day> alldays = EnumSet.allOf(Day.class);
		System.out.println(alldays);
		EnumSet<Day> holidays = EnumSet.noneOf(Day.class);
		holidays.add(Day.FRIDAY);
		System.out.println(holidays);
		weekdays.remove(Day.THURSDAY);
		System.out.println(weekdays);
	}

}
