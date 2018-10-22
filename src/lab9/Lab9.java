package lab9;

import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {

		circle();

	}

	public static double circle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester, Please enter a radius:");
		double pi = 3.14;
		double radius = Validatorlab9.getDouble(sc, "Please enter a valid double: ");
		System.out.println(radius);

		double circumference = 2 * pi * radius;
		System.out.println(" The circumference of your circle is: " + circumference);

		double area = pi * (radius * radius);
		System.out.println("The area of your circle is: " + area);

		System.out.println("To enter the radius of another circle enter 1, to quit enter 2.");
		double userDouble = Validatorlab9.getDouble(sc, "Please enter a either 1 or 2: ");
		if (userDouble == 1) {
			circle();
		}
		if (userDouble == 2) {
			System.out.println("Goodbye");
		} else {
			System.out.println("Not a valid input. Program resetting...");
			circle();
		}
		return userDouble;
	}

}
