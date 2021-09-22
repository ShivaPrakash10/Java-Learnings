package basics;

import java.util.Scanner;

public class ScannerDemo {
	
	static String  str;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Please enter a number: ");
		a = sc.nextInt();
		System.out.println("Your entry is " +a);
		
		ScannerDemo demmo = new ScannerDemo();
		demmo.getNameFromUser();
		
		System.out.println("enter another name: ");
		str = sc.next();
		System.out.println("Hey "+str+ "!!!!");
		
	
		
	}
	
	public void getNameFromUser() {
		System.out.println("Please enter your name: "); //prompting the user to enter a name
		String name = sc.next();
		System.out.println("Hello "+name+ "!!!!");
	}

}
