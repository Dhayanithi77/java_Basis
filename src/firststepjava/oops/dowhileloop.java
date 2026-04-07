package firststepjava.oops;

import java.util.Scanner;

public class dowhileloop {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Enter the Number:");
			num = Sc.nextInt();
			System.out.println("cube of" + num + "is" + (num * num * num));
		} while (num >= 0);
		{
			System.out.println("Sorry  this Number Can't be multiply ");
		}

	}

}
