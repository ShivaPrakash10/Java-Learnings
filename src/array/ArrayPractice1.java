package array;

import java.util.Scanner;

public class ArrayPractice1 {

	public static void main(String[] args) {
//		int arr[] = { 54, 2, 56, 6, 17, 100, -5 };
		
		ArrayPractice1 practice = new ArrayPractice1();
//		practice.getArrayElements();
//		practice.sumOfArray(arr);;
		practice.sumOfArray(getArrayElements());   // using return type
//		practice.sumOfArray1();  // this will also work, last method
		
	}
	
//	public void sumOfArray(int a[]) {
	public void sumOfArray(int a[]) {
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("The sum = " + sum);
	}
	
	public static int[] getArrayElements() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int b = scanner.nextInt();
		int ar[]= new int[b];
		
		System.out.println("Enter "+b+" numbers : ");
		for (int i = 0; i < b; i++) {
			ar[i] = scanner.nextInt();
		}
		return ar;
		
//		sumOfArray(ar);
	}
	
	public void sumOfArray1() {
		int a[] = getArrayElements();
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("The sum = " + sum);
	}

}
