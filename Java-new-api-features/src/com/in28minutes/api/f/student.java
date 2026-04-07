package com.in28minutes.api.f;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stud;
		int sub;
		System.out.print("Enter the Number of Student:");
		stud = sc.nextInt();
		System.out.print("Enter the Number of Subject:");
		sub = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < stud; i++) {
			System.out.println("Student:" + (i + 1));
			for (int j = 1; j <= sub; j++) {
			System.out.print("Enter Subject Name:");
				String name = sc.nextLine();

			System.out.print("Enter Subject mark:");
				int mark = sc.nextInt();
				sc.nextLine();
				System.out.println("Subject Name: " + name + ", Subject Marks: " + mark);
			}
		}
		sc.close();
	}

}
