package basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value between 1-7: ");
		int a = scan.nextInt();
//		scan.close();

		switch (a) {

		case 1: { // case is an entry point
			System.out.println("Sunday");
			break; // break is an exist point in switch
		}
		case 5: {
			System.out.println("Thursday");
			break;
		}
		case 3: {
			System.out.println("Tueday");
//			break;
		}
		case 4: {
			System.out.println("Wednesday");
			break;
		}
		case 6: {
			System.out.println("Friday");
			break;
		}
		case 7: {
			System.out.println("Saturday");
			break;
		}
		case 2: {
			System.out.println("Monday");
			break;
		}
		default: {
			System.out.println("your value is not between 1-7");
		}
		}

	}

}
