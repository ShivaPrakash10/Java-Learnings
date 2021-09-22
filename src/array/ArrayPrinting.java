package array;

import java.util.Arrays;

public class ArrayPrinting {

	public static void main(String[] args) {
		char charArr[] = new char[] { 'a', 'b', 'c', 'd' };

		int intArr[] = { 1, 2, 3, 4, 5 };

		String strArr[] = new String[3];
		strArr[0] = "Sathya";
		strArr[1] = "Tamil";
		strArr[2] = "Shiva";

		System.out.println(charArr);
		System.out.println(intArr);
		System.out.println(strArr);

//		ArrayPrinting print = new ArrayPrinting();
//		print.simpleForLoopForCharArrayPrinting(charArr);
////		print.simpleForLoopForArrayPrinting(intArr);
//		
//		print.AdvancedForLoopForCharArrayPrinting(charArr);
//		print.AdvancedForLoopForIntArrayPrinting(intArr);
//		print.AdvancedForLoopForStringArrayPrinting(strArr);
		
		System.out.println(Arrays.toString(charArr));
		System.out.println(Arrays.toString(intArr));
		String strToString = Arrays.toString(strArr);
		System.out.println(strToString);
		
	}
	
	

	public void simpleForLoopForCharArrayPrinting(char arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void simpleForLoopForIntArrayPrinting(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void simpleForLoopForStringArrayPrinting(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void AdvancedForLoopForCharArrayPrinting(char arr[]) {
		for(char eachElement: arr) {  
			System.out.println(eachElement);
		}
	}

	public void AdvancedForLoopForIntArrayPrinting(int arr[]) {
		for(int eachElement: arr) {  
			System.out.println(eachElement);
		}
	}

	public void AdvancedForLoopForStringArrayPrinting(String arr[]) {
		for(String eachElement: arr) {  
			System.out.println(eachElement);
		}
	}

}
