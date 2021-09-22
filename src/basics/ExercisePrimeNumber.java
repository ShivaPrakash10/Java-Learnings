package basics;

import java.util.Scanner;

public class ExercisePrimeNumber {

	public void findPrimeNumber() {
//		OddOrEven no = new PrimeNumber();
		ExerciseOddOrEven no = new ExerciseOddOrEven();
		int c = no.userInput1();

//		if (c%2 == 0) {
//			System.out.println(c + " is not a prime number");
//		} else if (c==0 && c==1) {
//			System.out.println(c + " is not a prime number");
//		} else
//			System.out.println(c + " is a prime number");
//	}
		int temp=0;
		for(int i=2;i<c;i++) {
			if(c%i==0) {
//				System.out.println(i+" is not a prime number");
				temp=1;
				break;
			}
//			else {
//				System.out.println(i+" is a prime number");
//			}
			
		}
		if(temp==1)
			System.out.println("not prime");
		else 
			System.out.println("Prime");
	}

	public static void main(String[] args) {
		ExercisePrimeNumber m = new ExercisePrimeNumber();
		m.findPrimeNumber();
	}

}
