package basics;

import java.util.Scanner;

public class ExerciseOddOrEven {

	public int userInput1() {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
//	return int a = sc.nextInt();
		int a = sc.nextInt();
		return a;
	}

	public void findOddOrEven() {
		int c = userInput1();
		if (c==0){
			System.out.println("Please enter a value other than 0");
		}
		else if (c % 2 == 0) {
			System.out.println(c+ " is an Even Number");
		} else
			System.out.println(c+ " is an Odd Number");
	}

	public static void main(String[] args) {
		ExerciseOddOrEven obj = new ExerciseOddOrEven();
		obj.findOddOrEven();
	}

}
