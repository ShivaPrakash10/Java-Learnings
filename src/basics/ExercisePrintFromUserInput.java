package basics;

import java.util.Scanner;

public class ExercisePrintFromUserInput {

	static int a;

	public static void userInput() {
		System.out.println("Enter a number between 1-10 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
	}

//		for(int i=a;i>=0;i--) {  
//			System.out.println(a-i); // This will work only when the value is 10.For other value, its decremented and for eg
//		if value is 8 and 8-3=5. so Hi will be printed directly which is wrong
//			if(i==5) {
//				System.out.println("Hi");
//			}
//		}

	public static void verify() {
		userInput();
		for (int i = 0; i <= a; i++) {
			if (i == 5) {
				System.out.println("Hi");
			} else
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		verify();
	}
}
