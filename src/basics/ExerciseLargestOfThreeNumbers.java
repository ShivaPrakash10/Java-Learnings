package basics;

import java.util.Scanner;

public class ExerciseLargestOfThreeNumbers {

	static int a, b, c;

	public static void getThreeInputsFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a : ");
		a = sc.nextInt();
		System.out.println("Enter value for b : ");
		b = sc.nextInt();
		System.out.println("Enter value for c : ");
		c = sc.nextInt();
	}

	public static void checkLargestOfThreeNumbers() {
		getThreeInputsFromUser();
		if (a > b && a > c) {
			System.out.println(a + " is the largest number1");
		} else if (b > c) {
			System.out.println(b + " is the largest number2");
		} else
			System.out.println(c + " is the largest number3");
	}

	public static void main(String[] args) {
		checkLargestOfThreeNumbers();
	}

}
