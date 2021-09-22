package array;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		int arr[] = { 54, 2, 56, 6, 17, 100, -5 };

//		comparing two elements in array
		if (arr[0] > arr[1]) {
			System.out.println("The Largest number is : " + arr[0]);
		} else {
			System.out.println("The Largest number is : " + arr[1]);
		}

		System.out.println(arr.length);

		ArrayPractice obj = new ArrayPractice();
		obj.compareArrayValues(arr);
		obj.sumOfArray(arr);
		obj.findAnElement(arr, 9);
		obj.getValueUsingIndex(arr, 4);
//		obj.getArrayElements();
	}

	public void compareArrayValues(int c[]) {
		int temp = c[0];
		for (int i = 1; i < c.length; i++) {
			if (temp < c[i]) {
				temp = c[i];
			}
		}
		System.out.println("The Largest number is : " + temp);
	}

	public void sumOfArray(int a[]) {
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("The sum = " + sum);
	}

	public void findAnElement(int b[], int num1) {
		int temp = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == num1) {
//				System.out.println("Element is found");
				temp = 1;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("Element not found");
		} else
			System.out.println("Element found");
	}

	public void getValueUsingIndex(int a[], int b) {
		int length = a.length - 1;
		try {
			System.out.println("array value at given index " + b + " is " + a[b]);
		} catch (ArrayIndexOutOfBoundsException arrayIndexException) {
			System.out.println(arrayIndexException.getMessage());
			System.out.println("The index range should be from 0 to " + length);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			ArrayPrinting arr = new ArrayPrinting();
			arr.simpleForLoopForIntArrayPrinting(a);
		}

	}

	public void getArrayElements() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int b = scanner.nextInt();
		int ar[]= new int[b];
		
		System.out.println("Enter "+b+" numbers : ");
		for (int i = 0; i < b; i++) {
			ar[i] = scanner.nextInt();
		}
	}
}
