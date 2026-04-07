package com.in28minutes.api.d;

import java.time.DayOfWeek;

public class Enum_values {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek = DayOfWeek.TUESDAY;
		String str = switch (dayOfWeek) {
		case MONDAY -> "FIRST DAY OF THE WORK";
		case TUESDAY, WEDNESDAY, THURSDAY -> "MIDDLE DAY OF WORK";
		case FRIDAY -> "END DAY OF WORK";
		case SUNDAY, SATURDAY -> "WEEkEND OF THE WORK";
		default -> "no weeks";
		};
		System.out.println(str);
	}

}
