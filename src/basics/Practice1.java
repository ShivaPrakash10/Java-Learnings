package basics;

import java.util.Scanner;

public class Practice1 {

	static int a;
	
	public static void gradeCalculation() {
		System.out.println("Enter the value for a : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();		
		if(a>=90) {
			System.out.println("Grade A");
		}
		else if(a>=75 && a<90) {
			System.out.println("Grade B");
		}
		else if(a>=65 && a<75) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("No Grade");
		}
	}
	
	public static void main(String[] args) {
		gradeCalculation();
		}
	}
