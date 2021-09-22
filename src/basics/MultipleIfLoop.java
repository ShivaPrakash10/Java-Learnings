package basics;

import java.util.Scanner;

public class MultipleIfLoop {

	public static void main(String[] args) {
		MultipleIfLoop m = new MultipleIfLoop();
//		m.scanner();
//		m.scanner1();
		m.Validating();

	}

	public int scanner() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("please enter a value");
		a = sc.nextInt();
		return a;
	}
	
	public void scanner1() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("please enter another value");
		a = sc.nextInt();
	}

	public void Validating() {
//		System.out.println(scanner()); //System.out.println(int a);
//		System.out.println(scanner1());
		int c = scanner();
		if (c == 100)
			System.out.println("the given value is equal to 100");
		
		if (c < 100)
			System.out.println("the given value is less than 100 ");
		
		if (c > 100)
			System.out.println("the given value is greater than 100");
	}
}
